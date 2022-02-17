package com.example.navigationui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationui.viewmodel.LatestNavigateUiState


abstract class BaseFragment() : Fragment() {



    companion object{
        fun navigate(view:View, nav:Int ){
            val navController = Navigation.findNavController(view)
            navController.navigate(nav)
        }
    }
     fun NavigateState(
        navigate: LatestNavigateUiState,
        view: View
    ) {
        when (navigate) {
            is LatestNavigateUiState.Success -> navigate(view, navigate.nav)
            is LatestNavigateUiState.Error -> Log.e(
                "TAG",
                "Navigate Error: ${navigate.exception}"
            )
        }
    }
}