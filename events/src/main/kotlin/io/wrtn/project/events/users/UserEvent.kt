package io.wrtn.project.events.users

import io.wrtn.project.events.BaseEvent

sealed class UserEvent: BaseEvent("project.users") {

    data class UserCreated(
        val id: String,
        val nickname: String,
        val email: String,
    ): UserEvent()

    data class UserUpdated(
        val id: String,
        val nickname: String,
        val email: String,
    ): UserEvent()

    data class UserDeleted(
        val id: String,
    ): UserEvent()
}
