package io.wrtn.project.utils

import com.fasterxml.jackson.databind.json.JsonMapper
import kotlin.reflect.KClass

object JacksonUtils {

    val jsonMapper: JsonMapper by lazy {
        JsonMapper.builder().findAndAddModules().build()
    }

    fun writeAsString(graph: Any?): String {
        if (graph == null) {
            return ""
        }

        return jsonMapper.writeValueAsString(graph)
    }

    fun <T: Any> readString(content: String?, targetClass: Class<T>): T? {
        if (content.isNullOrBlank()) {
            return null
        }
        return jsonMapper.readValue(content, targetClass)
    }

    fun <T: Any> readString(content: String?, targetKClass: KClass<T>): T? =
        readString(content, targetKClass.java)

    inline fun <reified T: Any> readString(content: String?): T? =
        readString(content, T::class.java)
}
