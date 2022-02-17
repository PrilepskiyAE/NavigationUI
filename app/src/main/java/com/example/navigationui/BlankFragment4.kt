package com.example.navigationui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationui.databinding.FragmentBlank4Binding

class BlankFragment4 : BaseFragment<FragmentBlank4Binding>() {

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBlank4Binding {
        return FragmentBlank4Binding.inflate(layoutInflater, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        actionId = R.id.action_blankFragment4_to_blankFragment5

        commonButton = binding.button

        super.onViewCreated(view, savedInstanceState)

    }
}
