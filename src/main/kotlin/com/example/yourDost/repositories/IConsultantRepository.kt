package com.example.yourDost.repositories

import com.example.yourDost.model.domain.Consultant
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface IConsultantRepository: PagingAndSortingRepository<Consultant?, Long> {

    @Query("select t from consulAnts t where (:myName = t.fullName)")
    fun findByName(myName: String?): List<Consultant?>?

}