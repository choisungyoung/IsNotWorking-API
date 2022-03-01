package com.notworking.isnt.controller.auth.dto

import javax.validation.constraints.NotEmpty

data class AuthUpdatePasswordRequestDTO(
    @field:NotEmpty
    var userId: String,
    @field:NotEmpty
    var password: String,
    @field:NotEmpty
    var authNum: Int,
) {
}