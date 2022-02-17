package com.example.navigationui


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationui.databinding.FragmentBlankBinding



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
