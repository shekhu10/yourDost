package com.example.yourDost.controllers

import com.example.yourDost.constants.ApiConstants
import com.example.yourDost.constants.AttributeConstants
import com.example.yourDost.dto.request.ConsultantOnboardingRequest
import com.example.yourDost.dto.request.UserOnboardingRequest
import com.example.yourDost.dto.response.*
import com.example.yourDost.services.IConsultantService
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.models.responses.ApiResponse
import jakarta.validation.Valid
import org.apache.commons.lang3.StringUtils
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.data.web.SortDefault
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController("consultantController")
@RequestMapping(ApiConstants.CONSULTANT_REQUEST_PATH)
@Validated
@Tag(name = "Consultant", description = "Operations related to consultants")
class ConsultantController {
    @Autowired
    private val consultantService: IConsultantService? = null

//    private val log = KotlinLogging.logger {}

    @GetMapping("/")
    @Operation(summary = "Get all consultants", description = "Returns a list of all consultants")
    fun getConsultant(): List<String> {
        return listOf("Consultant1", "Consultant2")
    }





    @Operation(
            summary = "onboard cunsultant on this platform",
    )
    @RequestMapping(value = ["/onboard/dimension"], method = [RequestMethod.POST], produces = ["application/json"])
    fun addConsultant(@RequestBody consultantOnboardingRequest: @Valid ConsultantOnboardingRequest?)
            : ConsultantOnboardingResponse? {
//        log.info("Dimension onboarding request received: {}", consultantOnboardingRequest)
            return ConsultantOnboardingResponse();
//        return dataFreshnessHandlerService!!.addDimension(consultantOnboardingRequest)
    }




    @RequestMapping(value = ["/onboard/user"], method = [RequestMethod.POST], produces = ["application/json"])
    @Operation(summary = "add users", description = "add a user")
    fun addUsers(@RequestBody userOnboardingRequest: @Valid UserOnboardingRequest): UserOnboardingResponse? {
        return consultantService!!.addUser(userOnboardingRequest)
    }








    @Operation(
            summary = "get all users in pagination format",
    )
    @RequestMapping(value = ["/user"], method = [RequestMethod.GET], produces = ["application/json"])
    fun fetchUser(
            @RequestParam(value = "name", required = false) name: String?,
            @RequestParam(value = "rollNo", required = false) rollNo: String?,
            @PageableDefault(page = 0, size = 5) @SortDefault.SortDefaults(
                    SortDefault(
                            sort = arrayOf(AttributeConstants.DEFAULT_SORT_BY)
                    )
            ) pageable: Pageable?

    ): UserResponse? {
        var name = if (StringUtils.isNotEmpty(name)) name else null
        var rollNo = if (StringUtils.isNotEmpty(rollNo)) rollNo else null

        return consultantService!!.fetchUserBasedOnFilter(
                name,
                rollNo,
                pageable
        )
    }



//
////    @ApiOperation(httpMethod = "GET", value = "Fetch dimensions", response = DimensionResponse::class)
//    @RequestMapping(value = ["/fetch/dimension"], method = [RequestMethod.GET], produces = ["application/json"])
//fun fetchDimension(
//        @PageableDefault(page = 0, size = 10) @SortDefault.SortDefaults(
//                SortDefault(
//                         sort = arrayOf(AttributeConstants.DEFAULT_SORT_BY),
//                        direction = Sort.Direction.DESC
//                )
//        ) pageable: Pageable?
//): ConsultantResponse? {
//    return ConsultantResponse()
//}



}