package com.example.navigationui

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.Navigation
import androidx.viewbinding.ViewBinding
import com.example.navigationui.viewmodel.BlankViewModel
import com.example.navigationui.viewmodel.LatestNavigateUiState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


abstract class BaseFragment<T: ViewBinding> : Fragment() {
    val blankViewModel: BlankViewModel by viewModels()
    var actionId: Int = 0

    private var _binding: T? = null
    val binding:T
        get() = _binding?: throw NullPointerException("Erorr Binding!!!")

    var commonButton: Button? = null

    abstract fun getBinding(inflater: LayoutInflater,container: ViewGroup?): T

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



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = getBinding(inflater, container)

        return _binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        blankViewModel.userClicksOnButton(actionId)

        commonButton?.setOnClickListener {
            lifecycleScope.launch {
                blankViewModel.uiState.collect {
                    NavigateState(it, view)
                }
            }
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }
}