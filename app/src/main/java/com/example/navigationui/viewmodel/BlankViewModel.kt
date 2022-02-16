package com.example.navigationui.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel

class BlankViewModel : ViewModel(){
    private val _navigateToBlank=SingleLiveEvent<Int>()
    val  navigateToBlank:LiveData<Int>
        get() = _navigateToBlank

    fun userClicksOnButton(nav:Int){
        _navigateToBlank.value = nav
    }
}