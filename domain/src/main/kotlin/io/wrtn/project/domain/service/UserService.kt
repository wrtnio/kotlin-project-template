package io.wrtn.project.domain.service

import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.repository.UserRepository
import io.wrtn.project.events.users.UserEvent
import io.wrtn.project.events.users.UserEventPublisher
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(
    private val repository: UserRepository,
    private val userEventPublisher: UserEventPublisher
) {

    fun findAll(pageable: Pageable): Page<User> {
        return repository.findAll(pageable)
    }

    fun findByIdOrNull(id: String): User? {
        return repository.findByIdOrNull(id)
    }

    @Transactional
    fun save(user: User): User {
        return repository.save(user).apply {
            userEventPublisher.publish(UserEvent.UserCreated(this.id!!, this.nickname, this.email))
        }
    }

    @Transactional
    fun saveAll(users: List<User>): List<User> {
        return repository.saveAll(users).apply {
            userEventPublisher.publishAll(this.map { user ->
                UserEvent.UserCreated(user.id!!, user.nickname, user.email)
            })
        }
    }
}
