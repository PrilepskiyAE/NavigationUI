package com.example.navigationui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationui.databinding.FragmentBlank2Binding
import com.example.navigationui.databinding.FragmentBlankBinding

class BlankFragment2 : BaseFragment() {
    private var _binding: FragmentBlank2Binding? = null
    private val mBinding get() = _binding ?: throw RuntimeException("FragmentBlankBinding fragment error")

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
        mBinding.button.setOnClickListener {
         //   val navController = Navigation.findNavController(view)
          //  navController.navigate(R.id.action_blankFragment2_to_blankFragment3)
            BaseFragment.navigate(view,R.id.action_blankFragment2_to_blankFragment3)
        }
    }
}