package io.wrtn.project.web.controller.user

import io.micrometer.observation.annotation.Observed
import io.wrtn.kommons.logging.KLogging
import io.wrtn.project.domain.model.User
import io.wrtn.project.domain.service.UserService
import io.wrtn.project.web.controller.ApiPaths
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Observed(name = "users")
@RestController
@RequestMapping(ApiPaths.API_V1 + "/users")
class UserController(
    @Autowired private val userService: UserService
) { //: CoroutineScope by CoroutineScope(Dispatchers.IO) {

    companion object: KLogging()

    @GetMapping("/{id}")
    suspend fun findByIdOrNull(@PathVariable("id") id: String): User? {
        return userService.findByIdOrNull(id)
    }

    @GetMapping("/pageable")
    suspend fun findByPageable(pageable: Pageable): Page<User> {
        return userService.findAll(pageable)
    }

    @PostMapping
    suspend fun saveUser(@RequestBody user: User): User {
        return userService.save(user)
    }
}
