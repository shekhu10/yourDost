package com.example.yourDost.dto.response

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import lombok.*
import java.io.Serializable

@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class UserDetailResponse: Serializable, Cloneable {
    @JsonProperty("name")
    var name: String? = null

    @JsonProperty("rollNo")
    var rollNo: String? = null

    @JsonProperty("id")
    var id: String? = null

}