package com.example.yourDost.dto.response

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer
import lombok.*
import java.io.Serializable
import java.time.LocalDateTime


@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
class ConsultantDetailResponse : Serializable, Cloneable{
    @JsonProperty("dimension")
    var dimension: String? = null

    @JsonProperty("lob")
    var lob: List<String>? = null

    @JsonProperty("airflowLink")
    var airflowLink: String? = null

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonDeserialize(using = LocalDateTimeDeserializer::class)
    @JsonSerialize(using = LocalDateTimeSerializer::class)
    var nextRunTime: LocalDateTime? = null

    companion object {
        private const val serialVersionUID = -3488860960637488519L
    }
}