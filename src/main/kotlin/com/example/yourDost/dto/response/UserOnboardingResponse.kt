package com.example.yourDost.dto.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class UserOnboardingResponse : BaseRestResponse() {
    @JsonProperty("userId")
    var userId: Long? = null

    @JsonProperty("name")
    var name: String? = null
}