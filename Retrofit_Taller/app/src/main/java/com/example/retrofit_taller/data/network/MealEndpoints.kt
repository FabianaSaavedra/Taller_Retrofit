package com.example.retrofit_taller.data.network

import com.example.retrofit_taller.data.model.MealResponse
import retrofit2.Response
import retrofit2.http.GET

interface MealEndpoints {

    @GET("api/json/v1/1/random.php")
    suspend fun getRandomMeal(): Response<MealResponse>
}