package com.example.navigationui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.navigationui.databinding.FragmentBlank3Binding


class BlankFragment3 : BaseFragment<FragmentBlank3Binding>() {

    override fun getBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentBlank3Binding {
        return FragmentBlank3Binding.inflate(layoutInflater, container, false)
    }



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        actionId = R.id.action_blankFragment3_to_blankFragment4

        commonButton = binding.button

        super.onViewCreated(view, savedInstanceState)

    }
}
