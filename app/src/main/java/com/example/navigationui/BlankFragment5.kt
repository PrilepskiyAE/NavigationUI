package com.example.navigationui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.navigationui.databinding.FragmentBlank5Binding
import com.example.navigationui.databinding.FragmentBlankBinding
import com.example.navigationui.viewmodel.BlankViewModel
import com.example.navigationui.viewmodel.BlankViewModelFactory


class BlankFragment5 : BaseFragment() {

    private var _binding: FragmentBlank5Binding? = null
    private val mBinding get() = _binding ?: throw RuntimeException("FragmentBlankBinding fragment error")
    private lateinit var blankViewModel: BlankViewModel
    private lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlank5Binding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelFactory= BlankViewModelFactory()
        blankViewModel=ViewModelProvider(this,viewModelFactory).get(BlankViewModel::class.java)
        blankViewModel.userClicksOnButton(R.id.action_blankFragment5_to_blankFragment)
        mBinding.button.setOnClickListener {
            blankViewModel.navigateToBlank.observe(viewLifecycleOwner) {
                navigate(view, it)
            }
        }
    }
}