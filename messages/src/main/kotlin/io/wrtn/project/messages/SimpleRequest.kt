package io.wrtn.project.messages

data class SimpleRequest(
    override val id: String?,
    override val source: String?,
    val body: String,
    val requestType: SimpleRequestType,
    override val timestamp: Long? = System.currentTimeMillis()
): RequestMessage

enum class SimpleRequestType(val caption: String) {
    UNKNOWN("Unknown"),
    REQUEST_TYPE_1("Request Type 1"),
    REQUEST_TYPE_2("Request Type 2"),
    REQUEST_TYPE_3("Request Type 3"),
}
