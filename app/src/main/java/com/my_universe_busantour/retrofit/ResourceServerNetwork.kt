package com.my_universe_busantour.retrofit

import com.my_universe_busantour.model.RequestResultVO
import com.my_universe_busantour.model.User
import retrofit2.http.Body
import retrofit2.http.POST

interface ResourceServerNetwork {
    @POST("user/register")
    fun doRegister(
        @Body user: User
    ): retrofit2.Call<RequestResultVO>
    @POST("user/login")
    fun doLogin(
        @Body user: User
    ): retrofit2.Call<RequestResultVO>
    @POST("user/auth")
    fun getAuthPage(

    ): retrofit2.Call<RequestResultVO>
}