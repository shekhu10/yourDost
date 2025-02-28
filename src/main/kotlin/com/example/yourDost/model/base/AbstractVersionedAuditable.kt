package com.example.yourDost.model.base

import jakarta.persistence.Column
import jakarta.persistence.EntityListeners
import jakarta.persistence.MappedSuperclass
import org.springframework.data.annotation.CreatedBy
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedBy
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.io.Serializable
import java.time.LocalDateTime

@MappedSuperclass
@EntityListeners(AuditingEntityListener::class)
abstract class AbstractVersionedAuditable<U, PK : Serializable?> : AbstractVersionedPersistable<PK>() {
    /*
	 * (non-Javadoc)
	 *
	 * @see org.springframework.data.domain.Auditable#getCreatedBy()
	 */
    @Column(length = 50, updatable = false)
    @CreatedBy
    var createdBy: String? = null


    @Column(updatable = false)
    @CreatedDate
    var createdDate: LocalDateTime? = null
        set(createdDate) {
            field = createdDate
        }

    @Column(length = 50)
    @LastModifiedBy
    var lastModifiedBy: String? = null

    @Column
    @LastModifiedDate
    var lastModifiedDate: LocalDateTime? = null
        set(lastModifiedDate) {
            field = lastModifiedDate
        }

    companion object {
        private const val serialVersionUID = 6219787514778472672L
    }
}
