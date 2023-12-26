package io.wrtn.project.messages.exceptions

import io.wrtn.project.exceptions.BaseProjectException

/**
 * [io.wrtn.project.messages.RequestMessage] 정보가 잘못된 경우 발생하는 예외
 */
class InvalidRequestException: BaseProjectException {
    constructor(): super()
    constructor(message: String): super(message)
    constructor(message: String, cause: Throwable?): super(message, cause)
    constructor(cause: Throwable?): super(cause)
}
