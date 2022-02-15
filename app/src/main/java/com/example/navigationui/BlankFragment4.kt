package com.example.navigationui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationui.databinding.FragmentBlank4Binding
import com.example.navigationui.databinding.FragmentBlankBinding


class BlankFragment4 : Fragment() {

    private var _binding: FragmentBlank4Binding? = null
    private val mBinding get() = _binding ?: throw RuntimeException("FragmentBlankBinding fragment error")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentBlank4Binding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.button.setOnClickListener {
            val navController = Navigation.findNavController(view)
            navController.navigate(R.id.action_blankFragment4_to_blankFragment5)
        }
    }
}