package com.example.retrofit_taller.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.retrofit_taller.data.MealDriverAdapter
import com.example.retrofit_taller.data.model.Meal
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

sealed class MealUiState {
    object Loading : MealUiState()
    data class Success(val meal: Meal) : MealUiState()
    data class Error(val message: String) : MealUiState()
}

class MealViewModel : ViewModel() {

    private val adapter = MealDriverAdapter()

    private val _uiState = MutableStateFlow<MealUiState>(MealUiState.Loading)
    val uiState: StateFlow<MealUiState> = _uiState

    init {
        fetchRandomMeal()
    }

    fun fetchRandomMeal() {
        _uiState.value = MealUiState.Loading
        viewModelScope.launch {
            adapter.loadRandomMeal(
                onSuccess = { meal -> _uiState.value = MealUiState.Success(meal) },
                onError   = { msg  -> _uiState.value = MealUiState.Error(msg)   }
            )
        }
    }
}
