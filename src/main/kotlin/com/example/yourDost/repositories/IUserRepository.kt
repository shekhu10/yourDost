package com.example.yourDost.repositories

import com.example.yourDost.model.domain.User
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.CrudRepository
import org.springframework.data.repository.PagingAndSortingRepository
import org.springframework.stereotype.Repository

@Repository
interface IUserRepository: CrudRepository<User, Long?>, PagingAndSortingRepository<User, Long?> {
    @Query("select t from userDetails t where (:name = t.name)")
    fun findByName(name: String?): List<User?>?



    @Query("select t from userDetails t where" +
        "(:name is null or t.name = :name) and " +
        "(:rollNo is null or t.rollNo = :rollNo) "
    )
    fun findAllByFilters(
        name: String?,
        rollNo: String?,
        pageable: Pageable?
    ): Page<User?>

}
