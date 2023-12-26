package io.wrtn.project.messages

import java.io.Serializable

abstract class AbstractResponse: Serializable {

    val headers: MutableList<Header> = mutableListOf()

    val error: ErrorResponse? = null

    val createdAt: Long = System.currentTimeMillis()


    fun addHeader(name: String, value: String?) {
        headers.add(Header(name, value))
    }

    fun getHeader(name: String): String? = headers.find { it.name == name }?.value
}
