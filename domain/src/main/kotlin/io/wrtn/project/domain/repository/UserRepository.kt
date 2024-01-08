package io.wrtn.project.domain.repository

import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.model.UserState
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository
import java.time.Instant

@Repository
interface UserRepository: MongoRepository<User, String>, UserRepositoryCustom {

    fun findByEmail(email: String): User?

    fun findByEmailAndUserState(email: String, userState: UserState = UserState.ACTIVE): User?

    fun findByNickname(nickname: String): User?

    fun findByCreatedAtAfter(createdAt: Instant = Instant.now()): List<User>
}
