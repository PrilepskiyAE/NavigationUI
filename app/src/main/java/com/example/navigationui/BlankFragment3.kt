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
import com.example.navigationui.databinding.FragmentBlankBinding
import com.example.navigationui.viewmodel.BlankViewModel
import com.example.navigationui.viewmodel.BlankViewModelFactory
import com.example.navigationui.viewmodel.LatestNavigateUiState
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch


class BlankFragment3 : BaseFragment() {
    private var _binding: FragmentBlank3Binding? = null
    private val mBinding get() = _binding ?: throw RuntimeException("FragmentBlankBinding fragment error")
    private lateinit var blankViewModel: BlankViewModel
    private lateinit var viewModelFactory: ViewModelProvider.Factory




    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlank3Binding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    @SuppressLint("UnsafeRepeatOnLifecycleDetector")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelFactory = BlankViewModelFactory()
        blankViewModel = ViewModelProvider(this, viewModelFactory).get(BlankViewModel::class.java)
        blankViewModel.userClicksOnButton(R.id.action_blankFragment3_to_blankFragment4)
        mBinding.button.setOnClickListener {
            lifecycleScope.launch {
                repeatOnLifecycle(Lifecycle.State.STARTED) {
                        blankViewModel.uiState.collect {
                            NavigateState(it, view)
                        }
                }
                //BaseFragment.navigate(view,R.id.action_blankFragment2_to_blankFragment3)


            }
        }
    }
}