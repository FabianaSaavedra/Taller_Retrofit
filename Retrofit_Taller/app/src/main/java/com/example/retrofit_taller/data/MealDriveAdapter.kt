package com.example.retrofit_taller.data

import com.example.retrofit_taller.data.model.Meal
import com.example.retrofit_taller.data.network.MealServices

class MealDriverAdapter {

    private val mealServices = MealServices()

    suspend fun loadRandomMeal(
        onSuccess: (Meal) -> Unit,
        onError: (String) -> Unit
    ) {
        mealServices.getRandomMeal(
            onSuccess = { meal -> onSuccess(meal) },
            onError   = { msg  -> onError(msg)    }
        )
    }
}