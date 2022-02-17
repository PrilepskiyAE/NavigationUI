package com.example.navigationui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationui.databinding.FragmentBlank2Binding

class BlankFragment2 : BaseFragment<FragmentBlank2Binding>() {

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBlank2Binding {
        return FragmentBlank2Binding.inflate(layoutInflater, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        actionId = R.id.action_blankFragment2_to_blankFragment3

        commonButton = binding.button

        super.onViewCreated(view, savedInstanceState)

    }
}