package io.wrtn.project.messages

import java.io.Serializable

abstract class AbstractResponse: Serializable {

    val headers: MutableList<Header> = mutableListOf()

    val error: ErrorResponse? = null


    fun addHeader(name: String, value: String?) {
        headers.add(Header(name, value))
    }

    fun getHeader(name: String): String? = headers.find { it.name == name }?.value
}
