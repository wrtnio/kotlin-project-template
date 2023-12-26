package io.wrtn.project.domain.exceptions

import io.wrtn.project.exceptions.BaseProjectException

abstract class BaseDomainException: BaseProjectException {
    constructor(): super()
    constructor(message: String): super(message)
    constructor(message: String, cause: Throwable): super(message, cause)
    constructor(cause: Throwable): super(cause)
}
