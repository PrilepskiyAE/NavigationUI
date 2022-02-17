package com.example.navigationui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationui.databinding.FragmentBlank5Binding

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