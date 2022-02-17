package com.example.navigationui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import java.lang.Exception

class BlankViewModel : ViewModel(){
    private val _uiState = MutableStateFlow(LatestNavigateUiState.Success(0))
    val uiState: StateFlow<LatestNavigateUiState> = _uiState

    fun userClicksOnButton(nav:Int){

        viewModelScope.launch {
            _uiState.collect {
                it.nav=nav
            }
        }
    }

}
sealed class LatestNavigateUiState {
    data class Success(var nav : Int):LatestNavigateUiState()
    data class Error(var exception: Throwable):LatestNavigateUiState()
}