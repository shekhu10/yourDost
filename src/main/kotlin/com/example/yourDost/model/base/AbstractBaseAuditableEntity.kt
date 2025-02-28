package com.example.yourDost.model.base

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import jakarta.persistence.MappedSuperclass
import java.io.Serializable


@MappedSuperclass
@JsonIgnoreProperties(
        "createdBy",
        "createdDate",
        "lastModifiedBy",
        "lastModifiedDate",
        "new",
        "businessId",
        "manageable"
)
abstract class AbstractBaseAuditableEntity<ID : Serializable?> : AbstractVersionedAuditable<String?, ID>() {
    companion object {
        private const val serialVersionUID = 1L
    }
}