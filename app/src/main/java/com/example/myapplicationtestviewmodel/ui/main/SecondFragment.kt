package com.example.myapplicationtestviewmodel.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider

import com.example.myapplicationtestviewmodel.R
import kotlinx.android.synthetic.main.second_fragment.*

class SecondFragment : Fragment() {

      override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.second_fragment, container, false)

        val viewModel: MainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
        val nameObserver = Observer<String> { newName ->
              println("Second Fragment Observer !!!! NewName ="+newName)
              secondText.text = "Observe Value ="+newName
        }
        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        viewModel.currentText.observe(viewLifecycleOwner, nameObserver)

        return rootView
    }
}
