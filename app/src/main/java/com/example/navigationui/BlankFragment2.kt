package com.example.navigationui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.navigationui.databinding.FragmentBlank2Binding
import com.example.navigationui.viewmodel.BlankViewModel
import com.example.navigationui.viewmodel.BlankViewModelFactory

class BlankFragment2 : BaseFragment() {
    private var _binding: FragmentBlank2Binding? = null
    private val mBinding
        get() = _binding ?: throw RuntimeException("FragmentBlankBinding fragment error")
    private lateinit var blankViewModel: BlankViewModel
    private lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentBlank2Binding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModelFactory = BlankViewModelFactory()
        blankViewModel = ViewModelProvider(this, viewModelFactory).get(BlankViewModel::class.java)
        blankViewModel.userClicksOnButton(R.id.action_blankFragment2_to_blankFragment3)
        mBinding.button.setOnClickListener {

            blankViewModel.navigateToBlank.observe(viewLifecycleOwner) {
                navigate(view, it)
            }
        }
    }
}