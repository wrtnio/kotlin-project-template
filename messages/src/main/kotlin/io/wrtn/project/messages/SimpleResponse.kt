package io.wrtn.project.messages

import java.time.Instant

data class SimpleResponse(
    val id: Long,
    val body: String,
    val createdAt: Instant = Instant.now()
): AbstractResponse()
