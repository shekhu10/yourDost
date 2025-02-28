package com.example.yourDost.utils

import com.example.yourDost.dto.response.BaseRestResponse
import com.example.yourDost.dto.response.PageableResponse
import com.example.yourDost.enums.AppCodes
import org.springframework.data.domain.Page
import org.springframework.lang.Nullable

object AppUtils {
    fun setErrorResponse(response: BaseRestResponse, code: String?, message: String?, args: Array<Any?>?) {
        response.success = false
        response.code = code
        response.msg = message
    }
    fun setSuccessResponse(response: BaseRestResponse) {
        response.success = true
        response.code = AppCodes.SUCCESS_RESPONSE.code
    }

    fun setSuccessResponse(response: BaseRestResponse, msg: String?) {
        response.success = true
        response.code = AppCodes.SUCCESS_RESPONSE.code
        response.msg = msg
    }

    fun setSuccessResponse(response: PageableResponse<*>, data: Page<*>) {
        setSuccessResponse(response, data, data.content)
    }
    fun setSuccessResponse(response: PageableResponse<*>, data: Page<*>, content: List<*>?) {
        setSuccessResponse(response)
        response.content = content
        response.numberOfElements = data.numberOfElements.toLong()
        response.size = data.size.toLong()
        response.totalElements = data.totalElements
        response.totalPages = data.totalPages
        response.number = data.number
        response.empty = data.isEmpty
        response.first = data.isFirst
        response.last = data.isLast
        response.sorted = data.sort.isSorted
    }

    fun setSuccessResponse(response: BaseRestResponse, message: String?, @Nullable code: String?) {
        response.success = true
        response.msg = message
        response.code = code
    }
}