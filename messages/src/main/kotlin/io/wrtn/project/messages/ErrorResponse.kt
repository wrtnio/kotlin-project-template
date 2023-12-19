package io.wrtn.project.messages

import java.io.Serializable

data class ErrorResponse(
    val code: Int = -1,
    val message: String? = null,
    val details: String? = null,
    val stackTrace: String? = null
): Serializable
