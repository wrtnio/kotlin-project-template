package io.wrtn.project.domain.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.PersistenceCreator
import java.io.Serializable
import java.time.Instant

data class User @PersistenceCreator constructor(
    val nickname: String,
    val email: String,
    val age: Int = 0,
    val userState: UserState = UserState.ACTIVE,
    @Id val id: String? = null,
): Serializable {

    constructor(
        nickname: String,
        email: String,
        age: Int,
        userState: UserState
    ): this(nickname, email, age, userState, null)

    var createdAt: Instant = Instant.now()
    var updatedAt: Instant = createdAt
}
