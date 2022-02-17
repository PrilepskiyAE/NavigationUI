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
import com.example.navigationui.databinding.FragmentBlankBinding
import com.example.navigationui.viewmodel.BlankViewModel
import com.example.navigationui.viewmodel.BlankViewModelFactory
import com.example.navigationui.viewmodel.LatestNavigateUiState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class BlankFragment : BaseFragment<FragmentBlankBinding>() {

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBlankBinding {
        return FragmentBlankBinding.inflate(layoutInflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        actionId = R.id.action_blankFragment_to_blankFragment2

        commonButton = binding.button

        super.onViewCreated(view, savedInstanceState)

    }
}
