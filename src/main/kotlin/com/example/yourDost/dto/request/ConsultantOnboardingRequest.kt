package com.example.yourDost.dto.request

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import jakarta.persistence.Column
import jakarta.validation.constraints.NotNull
import lombok.*
import java.io.Serializable


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class ConsultantOnboardingRequest : Serializable, Cloneable  {
    @JsonProperty("fullname")
    @field:NotNull(message = "full name must not be null")
    var fullName: String? = null


    @JsonProperty("email")
    @field:NotNull(message = "email must not be null")
    var email: String? = null

    @JsonProperty("phoneNumber")
    @field:NotNull(message = "phoneNumber must not be null")
    val phoneNumber: String? = null

    @JsonProperty("passwordHash")
    @field:NotNull(message = "passwordHash must not be null")
    val passwordHash: String? = null

    @JsonProperty("profilePicture")
    val profilePicture: String? = null

    @JsonProperty("bio")
    val bio: String? = null
}