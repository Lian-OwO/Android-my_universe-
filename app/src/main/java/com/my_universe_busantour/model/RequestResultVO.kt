package com.my_universe_busantour.model

data class RequestResultVO(
    val token : String,
    val result : Boolean,
    val message : String,
    val userDto : UserDto
)
