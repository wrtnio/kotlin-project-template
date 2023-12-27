package io.wrtn.project.domain.repository

import io.wrtn.project.domain.model.User

/**
 * 복잡하거나 특화된 작업이 필요한 경우에는 Entity + RepositoryImpl 에 구현합니다.
 * ```
 * interface UserRepositoryCustom {
 *     fun findByNicknameLike(regex: String): List<User>
 * }
 *
 * interface UserRepository: MongoRepository<User, String>, UserRepositoryCustom {
 *     fun findByNickname(nickname: String): User?
 * }
 *
 * @Repository
 * class UserRepositoryImpl(private val operations: MongoOperations): UserRepositoryCustom {
 *      override fun findByNicknameLike(regex: String): List<User> {
 *          // 구현
 *      }
 * }
 * ```
 *
 */
interface UserRepositoryCustom {

    fun findByNicknameLike(regex: String): List<User>

}
