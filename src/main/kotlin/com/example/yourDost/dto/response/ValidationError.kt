package com.example.yourDost.dto.response

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.io.Serializable

@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
class ValidationError(private val code: String, private val error: String) : Serializable {
    var path: String? = null

    @JsonIgnore
    var referenceValue: Any? = null

    companion object {
        /**
         *
         */
        private const val serialVersionUID = -5432214354081137943L
    }
}