package io.wrtn.project.domain.service

import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.repository.UserRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
class UserService(private val repository: UserRepository) {

    fun findByIdOrNull(id: String): User? {
        return repository.findByIdOrNull(id)
    }

    @Transactional
    fun save(user: User): User {
        return repository.save(user)
    }

    @Transactional
    fun saveAll(users: List<User>): List<User> {
        return repository.saveAll(users)
    }
}
