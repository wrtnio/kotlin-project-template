package io.wrtn.project.messages

import java.io.Serializable

data class Header(
    val name: String,
    val value: String? = null
): Serializable
