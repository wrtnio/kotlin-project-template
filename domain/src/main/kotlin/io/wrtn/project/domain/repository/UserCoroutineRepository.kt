package io.wrtn.project.domain.repository

import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.model.UserState
import kotlinx.coroutines.flow.Flow
import org.springframework.data.repository.kotlin.CoroutineCrudRepository
import java.time.Instant

interface UserCoroutineRepository: CoroutineCrudRepository<User, String> {

    suspend fun findByEmail(email: String): User?

    suspend fun findByEmailAndUserState(email: String, userState: UserState = UserState.ACTIVE): User?

    suspend fun findByNickname(nickname: String): User?

    fun findByCreatedAtAfter(createdAt: Instant = Instant.now()): Flow<User>
}
