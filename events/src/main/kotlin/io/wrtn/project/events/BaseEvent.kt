package io.wrtn.project.events

import org.springframework.context.ApplicationEvent

abstract class BaseEvent(source: Any): ApplicationEvent(source) {

    val createdAt: Long = System.currentTimeMillis()

}
