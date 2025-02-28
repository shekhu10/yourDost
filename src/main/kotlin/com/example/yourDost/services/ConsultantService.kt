package com.example.yourDost.services

import com.example.yourDost.dto.request.UserGetRequest
import com.example.yourDost.dto.request.UserOnboardingRequest
import com.example.yourDost.dto.response.UserDetailResponse
import com.example.yourDost.dto.response.UserGetResponse
import com.example.yourDost.dto.response.UserOnboardingResponse
import com.example.yourDost.dto.response.UserResponse
import com.example.yourDost.model.domain.User
import com.example.yourDost.repositories.IUserRepository
import com.example.yourDost.utils.AppUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service

@Service
class ConsultantServiceImpl: IConsultantService {
    @Autowired
    private val userRepository: IUserRepository? = null

    override fun addUser(userOnboardingRequest: UserOnboardingRequest?): UserOnboardingResponse? {
        val isUserPresent = userRepository?.findByName(userOnboardingRequest?.name)

        // create a user
        var user = User()
        user.name = userOnboardingRequest?.name
        user.rollNo = userOnboardingRequest?.rollNo
        userRepository?.save(user)
        // add user to db

        // create a response
        var userOnboardingResponse = UserOnboardingResponse()
        userOnboardingResponse.userId = user.id
        userOnboardingResponse.name = user.name

        return userOnboardingResponse
    }

    override fun fetchUser(userGetRequest: UserGetRequest?): UserGetResponse? {
        return UserGetResponse()
    }

    override fun fetchUserBasedOnFilter(name: String?, rollNo: String?, pageable: Pageable?,): UserResponse?{
        val userPage = userRepository!!.findAllByFilters(name, rollNo, pageable)
        val userResponse = UserResponse()
        val userDetailResponsePage = userPage!!.map { user: User? -> convert(user) }
        AppUtils.setSuccessResponse(userResponse, userDetailResponsePage )
        return userResponse
    }

    private fun convert(user: User?): UserDetailResponse {
        var userDetailResponse = UserDetailResponse()
        userDetailResponse.name = user!!.name
        userDetailResponse.rollNo = user!!.rollNo
        userDetailResponse.id = user!!.id.toString()
        return userDetailResponse
    }
}