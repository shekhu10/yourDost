package com.example.yourDost.dto.response

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import lombok.AllArgsConstructor
import lombok.Data
import lombok.NoArgsConstructor
import java.io.Serializable
import java.time.LocalDateTime

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonPropertyOrder("st", "msgid", "msg", "devErrorMessage", "timestamp", "validationError")
open class BaseRestResponse : Serializable {
    @JsonProperty("st")
    var success = false

    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    var timestamp = LocalDateTime.now()

    @JsonProperty("msgid")
    var code: String? = null

    @JsonProperty("msg")
    var msg: String? = null
    var devErrorMessage: String? = null

    @JsonProperty("validationError")
    var validationError: Collection<ValidationError>? = null

    companion object {
        /**
         *
         */
        private const val serialVersionUID = 3692959428126102727L
    }
}