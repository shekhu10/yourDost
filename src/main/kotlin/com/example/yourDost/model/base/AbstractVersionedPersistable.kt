package com.example.yourDost.model.base

import jakarta.persistence.Column
import jakarta.persistence.MappedSuperclass
import jakarta.persistence.Version
import org.springframework.data.jpa.domain.AbstractPersistable
import java.io.Serializable



@MappedSuperclass
abstract class AbstractVersionedPersistable<PK : Serializable?> : AbstractPersistable<PK>() {
    @Version
    @Column(name = "opt_lock")
    var optlock: Long = 0
//    override fun setId(id: PK) {
//        super.setId(id)
//    }

    val businessId: String
        get() = id.toString()

    override fun toString(): String {
        return String.format("%s(%s,%s)", this.javaClass.name, id, optlock)
    }

    companion object {
        private const val serialVersionUID = -5740040475579523635L
    }
}