package io.wrtn.project.domain.repository

import io.wrtn.project.domain.model.User
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.find
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query

class UserRepositoryImpl(private val operations: MongoOperations): UserRepositoryCustom {

    override fun findByNicknameLike(regex: String): List<User> {
        val criteria = Criteria.where(User::nickname.name).regex(regex)
        return operations.find<User>(Query.query(criteria))
    }
}
