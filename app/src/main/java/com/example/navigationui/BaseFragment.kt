package com.example.navigationui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation


abstract class BaseFragment() : Fragment() {



    companion object{
        fun navigate(view:View, nav:Int ){
            val navController = Navigation.findNavController(view)
            navController.navigate(nav)
        }
    }
}