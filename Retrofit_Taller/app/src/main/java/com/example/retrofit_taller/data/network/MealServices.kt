package com.example.retrofit_taller.data.network

import com.example.retrofit_taller.data.model.Meal
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealServices : BaseServices() {

    suspend fun getRandomMeal(
        onSuccess: (Meal) -> Unit,
        onError: (String) -> Unit
    ) {
        withContext(Dispatchers.IO) {
            try {
                val response = getRetrofit()
                    .create(MealEndpoints::class.java)
                    .getRandomMeal()

                val meal = response.body()?.meals?.firstOrNull()
                if (meal != null) {
                    onSuccess(meal)
                } else {
                    onError("No se encontró ninguna receta.")
                }
            } catch (e: Exception) {
                onError(e.message ?: "Error desconocido al obtener la receta.")
            }
        }
    }
}