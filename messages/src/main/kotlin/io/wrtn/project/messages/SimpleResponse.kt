package io.wrtn.project.messages

data class SimpleResponse(
    val id: Long,
    val body: String,
): AbstractResponse()
