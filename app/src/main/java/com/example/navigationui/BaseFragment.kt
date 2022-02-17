package com.example.navigationui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.viewbinding.ViewBinding
import com.example.navigationui.viewmodel.BlankViewModel
import java.lang.NullPointerException


abstract class BaseFragment<T: ViewBinding> : Fragment() {
    val blankViewModel: BlankViewModel by viewModels()
    private var _binding:T ?=null
    val binding:T
        get() = _binding?: throw NullPointerException("Erorr Binding!!!")
    var actionId: Int = 0

    var commonButton: Button? = null
    abstract fun getBinding(inflater: LayoutInflater,container: ViewGroup?): T



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
            blankViewModel.navigateToBlank.observe(viewLifecycleOwner) {
                navigate(view, it)
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding=null
    }

        fun navigate(view:View, nav:Int ){
            val navController = Navigation.findNavController(view)
            navController.navigate(nav)

    }
}