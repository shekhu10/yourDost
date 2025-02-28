package com.example.yourDost.model.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.envers.Audited

@Audited
@Getter
@Setter
@NoArgsConstructor
@Entity(name = "userDetails")
@Table(name = "user_details")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column
    var name: String? = null

    @Column
    var rollNo: String? = null

}