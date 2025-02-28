package com.example.yourDost.dto.response

import com.fasterxml.jackson.annotation.JsonProperty

class UserGetResponse {
    @JsonProperty("name")
    var name: String? = null

    @JsonProperty("rollNo")
    var rollNo: String? = null
    @JsonProperty("id")
    var id: Long? = null
}