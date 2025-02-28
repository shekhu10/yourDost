package com.example.yourDost.dto.response

open class PageableResponse<T>: BaseRestResponse() {
    var totalElements: Long = 0
    var totalPages = 0
    var size: Long = 0
    var numberOfElements: Long = 0
    var number = 0
    var last = false
    var first = false
    var sorted = false
    var empty = false
    var content: Collection<*>? = null

    companion object {
        private const val serialVersionUID = -2846910247972036035L
    }
}