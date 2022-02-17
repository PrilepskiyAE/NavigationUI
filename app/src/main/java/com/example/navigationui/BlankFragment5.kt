package com.example.navigationui

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.Navigation
import com.example.navigationui.databinding.FragmentBlank3Binding
import com.example.navigationui.databinding.FragmentBlank5Binding
import com.example.navigationui.databinding.FragmentBlankBinding
import com.example.navigationui.viewmodel.BlankViewModel
import com.example.navigationui.viewmodel.BlankViewModelFactory
import com.example.navigationui.viewmodel.LatestNavigateUiState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class BlankFragment5 : BaseFragment<FragmentBlank5Binding>() {

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBlank5Binding {
        return FragmentBlank5Binding.inflate(layoutInflater, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        actionId = R.id.action_blankFragment5_to_blankFragment

        commonButton = binding.button

        super.onViewCreated(view, savedInstanceState)

    }
}
