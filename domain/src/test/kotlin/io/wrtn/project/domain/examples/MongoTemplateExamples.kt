package io.wrtn.project.domain.examples

import io.wrtn.kommons.logging.KLogging
import io.wrtn.kommons.logging.debug
import io.wrtn.project.domain.AbstractDomainTest
import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.model.UserState
import org.amshove.kluent.shouldBeEqualTo
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldContain
import org.amshove.kluent.shouldNotBeNull
import org.bson.Document
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.mongodb.core.MongoTemplate
import org.springframework.data.mongodb.core.asType
import org.springframework.data.mongodb.core.createCollection
import org.springframework.data.mongodb.core.dropCollection
import org.springframework.data.mongodb.core.findById
import org.springframework.data.mongodb.core.findOne
import org.springframework.data.mongodb.core.insert
import org.springframework.data.mongodb.core.query
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.isEqualTo

class MongoTemplateExamples(
    @Autowired private val template: MongoTemplate
): AbstractDomainTest() {

    companion object: KLogging()

    @BeforeEach
    fun beforeEach() {
        template.dropCollection<User>()
    }

    @Test
    fun `새로운 User collection 생성`() {
        template.createCollection<User>()
        template.collectionNames shouldContain "user"
    }

    @Test
    fun `find by id`() {
        val saved = template.insertAll(newUsers(10)).toList()
        val target = saved[3]

        template.findById<User>(target.id!!) shouldBeEqualTo target
    }

    @Test
    fun `fluent api style 로 entity 저장하기`() {
        val saved = template.insert<User>().one(newUser())

        val loaded = template.query<User>()
            .matching(Query.query(Criteria.where(User::email.name).isEqualTo(saved.email)))
            .all()

        loaded.size shouldBeEqualTo 1
        loaded.first() shouldBeEqualTo saved
    }

    @Test
    fun `projection query`() {
        val saved = template.insert<User>().one(newUser())

        val loaded = template.query<User>()
            .asType<NicknameOnly>()
            .matching(Query.query(Criteria.where(User::email.name).isEqualTo(saved.email)))
            .oneValue()

        loaded.shouldNotBeNull()
        loaded.nickname shouldBeEqualTo saved.nickname
    }

    interface NicknameOnly {
        val nickname: String
    }

    @Test
    fun `count objects in a fluent API style`() {
        val saved = template.insert<User>().one(newUser())

        val count = template.query<User>()
            .matching(Query.query(Criteria.where(User::email.name).isEqualTo(saved.email)))
            .count()

        count shouldBeEqualTo 1
    }

    @Test
    fun `find by query`() {
        val saved = template.insert<User>().one(newUser())

        val query = Query.query(Criteria.where(User::email.name).isEqualTo(saved.email))
        val loaded = template.findOne<User>(query)

        loaded shouldBeEqualTo saved
    }

    @Test
    fun `속성이 존재하지 않을 시에는 기본 값을 설정합니다`() {
        // nickname 속성만 있는 Document를 User collection에 저장한다.
        val newDoc = Document(mapOf("nickname" to "Debop", "email" to "debop@wrtn.io"))
        val document = template.insert<Document>().inCollection("user").one(newDoc)

        val user = template.query<User>()
            .matching(Query.query(Criteria.where(User::nickname.name).isEqualTo(document["nickname"])))
            .firstValue()!!

        log.debug { "Loaded user=$user" }
        user.age shouldBeEqualTo 0                      // Default 값을 사용합니다.
        user.userState shouldBeEqualTo UserState.ACTIVE // Default 값을 사용합니다.
        user.nickname shouldBeEqualTo document["nickname"]
        user.email shouldBeEqualTo document["email"]

        val loadedDoc = template.findOne<Document>(
            Query.query(Criteria.where(User::nickname.name).isEqualTo(document["nickname"])),
            "user"
        )
        log.debug { "Loaded document=$loadedDoc" }
        loadedDoc.shouldNotBeNull()
        loadedDoc["nickname"] shouldBeEqualTo document["nickname"]
        loadedDoc["email"] shouldBeEqualTo document["email"]
        loadedDoc["_id"].shouldNotBeNull()

        loadedDoc.containsKey("age").shouldBeFalse()            // Document에는 age 속성이 없습니다.
        loadedDoc.containsKey("userState").shouldBeFalse()      // Document에는 userState 속성이 없습니다.
    }
}
