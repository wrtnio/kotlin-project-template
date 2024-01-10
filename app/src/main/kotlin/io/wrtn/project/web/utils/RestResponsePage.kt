package io.wrtn.project.web.utils

import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.JsonNode
import org.springframework.data.domain.PageImpl
import org.springframework.data.domain.PageRequest
import org.springframework.data.domain.Pageable

/**
 * REST API 의 Response 로 [org.springframework.data.domain.Page] 를 반환할 때,
 * Client 에서는 PageImpl 을 deserialize 할 수 없어서, RestResponsePage 를 만들어서 사용한다.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
class RestResponsePage<T>: PageImpl<T> {
    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    constructor(
        @JsonProperty("content") content: List<T>,
        @JsonProperty("number") number: Int,
        @JsonProperty("size") size: Int,
        @JsonProperty("totalElements") totalElements: Long?,
        @JsonProperty("pageable") pageable: JsonNode,
        @JsonProperty("last") last: Boolean,
        @JsonProperty("totalPages") totalPages: Int,
        @JsonProperty("sort") sort: JsonNode,
        @JsonProperty("first") first: Boolean,
        @JsonProperty("numberOfElements") numberOfElements: Int
    ): super(content, PageRequest.of(number, size), totalElements!!) {
    }

    constructor(content: List<T>, pageable: Pageable, total: Long): super(content, pageable, total) {}

    constructor(content: List<T>): super(content) {}

    constructor(): super(ArrayList<T>()) {}
}
