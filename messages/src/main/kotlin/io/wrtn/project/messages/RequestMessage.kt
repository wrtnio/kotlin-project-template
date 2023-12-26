package io.wrtn.project.messages

interface RequestMessage {

    val id: String?
    val source: String?
    val timestamp: Long?
}
