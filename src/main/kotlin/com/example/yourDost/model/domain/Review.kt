package com.example.yourDost.model.domain

import com.example.yourDost.model.base.AbstractBaseAuditableEntity
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import org.hibernate.envers.Audited
import java.time.LocalDateTime
import java.util.*


@Entity
@Audited
@Table(name = "reviews")
class Review: AbstractBaseAuditableEntity<Long?>(){

        @Id
//        @Column(name = "review_id", columnDefinition = "BINARY(16)")
        @GeneratedValue(strategy = GenerationType.UUID)
        val reviewId: UUID = UUID.randomUUID()
//
////        @Column(name = "client_id", nullable = false, columnDefinition = "BINARY(16)")
//        @GeneratedValue(strategy = GenerationType.IDENTITY)
//        val clientId: UUID? = null

        @Column(nullable = false)
        val clientName: String? = null

        @Column(nullable = false)
        val rating: Double? = null

        @Column(nullable = false)
        val comment: String? = null


}
