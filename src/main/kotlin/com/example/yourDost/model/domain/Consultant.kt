package com.example.yourDost.model.domain

import com.example.yourDost.model.base.AbstractBaseAuditableEntity
import jakarta.persistence.*
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.envers.Audited

@Audited
@Getter
@Setter
@NoArgsConstructor
@Entity(name="consulAnts")
@Table(name = "consul_ants")
class Consultant: AbstractBaseAuditableEntity<Long?>() {
//        @Id
//        @Column(name = "consultant_id", columnDefinition = "BINARY(16)")
//        var consultantId: UUID = UUID.randomUUID()

        @Column
        var fullName: String? = null

        @Column(nullable = false, unique = true)
        val email: String? = null

        @Column(nullable = false)
        val phoneNumber: String? = null

        @Column(nullable = false)
        val passwordHash: String? = null

        val profilePicture: String? = null

        val bio: String? = null

//        @ElementCollection
//        @CollectionTable(name = "consultant_expertise", joinColumns = [JoinColumn(name = "consultant_id")])
//        @Column(name = "expertise")
//        val expertise: List<String> = emptyList()

//        val experienceYears: Int = 0

//        @ElementCollection
//        @CollectionTable(name = "consultant_languages", joinColumns = [JoinColumn(name = "consultant_id")])
//        @Column(name = "language")
//        val languages: List<String> = emptyList()

//        val hourlyRate: Double? = null

        // For availability, we store a mapping of day to available time slots as a serialized JSON string or separate table.
        // Here we use ElementCollection for a simple structure. Adjust as needed.
//        @ElementCollection
//        @CollectionTable(name = "consultant_availability", joinColumns = [JoinColumn(name = "consultant_id")])
//        @MapKeyColumn(name = "day")
//        @Column(name = "time_slots")
//        val availability: Map<String, String> = emptyMap() // Storing comma-separated times for simplicity
//
//        val rating: Double = 0.0
//
//        @OneToMany(cascade = [CascadeType.ALL], fetch = FetchType.LAZY)
//        @JoinColumn(name = "consultant_id")
//        val reviews: List<Review> = emptyList()
//
//        val sessionsCompleted: Int = 0
//
//        @Enumerated(EnumType.STRING)
//        val status: Status = Status.ACTIVE

//
//        val paymentDetails: PaymentDetails? = null

}



