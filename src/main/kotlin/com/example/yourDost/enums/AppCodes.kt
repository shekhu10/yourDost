package com.example.yourDost.enums

import lombok.AllArgsConstructor

@AllArgsConstructor
enum class AppCodes {
    SUCCESS_RESPONSE("DOST_101"), DB_SERVICE_UNAVAILABLE("DOST_102"), INVALID_REQUEST("DOST_103"),
    FORBIDDEN("DOST_104"), DOWNSTREAM_ERROR("DOST_105"), INTERNAL_SERVER_ERROR("DOST_500");

    // custom properties with default values
    var code: String? = null

    constructor()

    // custom constructors
    constructor(
            appCode: String
    ) {
        this.code = appCode
    }
}