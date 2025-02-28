package com.example.yourDost.constants

object ApiConstants {
    const val CONSULTANT_REQUEST_PATH = "/consultant"
    const val DATA_FRESHNESS_CONTROLLER_PATH = "/dataFreshnessHandler"
    @JvmStatic
    fun isContains(path: String): Boolean {
        return path.contains(CONSULTANT_REQUEST_PATH) ||
                path.contains(DATA_FRESHNESS_CONTROLLER_PATH)
    }
}