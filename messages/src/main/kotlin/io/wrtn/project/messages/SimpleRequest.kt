package io.wrtn.project.messages

import java.time.Instant

data class SimpleRequest(
    val id: Long,
    val source: String,
    val body: String,
    val requestType: SimpleRequestType,
    val requestTime: Instant = Instant.now()
)

enum class SimpleRequestType(val caption: String) {
    UNKNOWN("Unknown"),
    REQUEST_TYPE_1("Request Type 1"),
    REQUEST_TYPE_2("Request Type 2"),
    REQUEST_TYPE_3("Request Type 3"),
}
