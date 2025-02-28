package com.example.yourDost.dto.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.validation.constraints.NotNull
import lombok.*
import java.io.Serializable


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class UserOnboardingRequest: Serializable, Cloneable {
    @JsonProperty("name")
    @field:NotNull(message = "Name must not be null")
    var name: String? = null

    @JsonProperty("rollNo")
    @field:NotNull(message = "rollNo must not be null")
    var rollNo: String? = null
}
