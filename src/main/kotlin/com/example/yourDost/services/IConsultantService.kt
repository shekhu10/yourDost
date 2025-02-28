package com.example.yourDost.services

import com.example.yourDost.dto.request.UserGetRequest
import com.example.yourDost.dto.request.UserOnboardingRequest
import com.example.yourDost.dto.response.UserGetResponse
import com.example.yourDost.dto.response.UserOnboardingResponse
import com.example.yourDost.dto.response.UserResponse
import org.springframework.data.domain.Pageable

interface IConsultantService {

    fun addUser(userOnboardingRequest: UserOnboardingRequest?): UserOnboardingResponse?
    fun fetchUser(userGetRequest: UserGetRequest?): UserGetResponse?
    fun fetchUserBasedOnFilter(name: String?, rollNo: String?, pageable: Pageable?): UserResponse?

}