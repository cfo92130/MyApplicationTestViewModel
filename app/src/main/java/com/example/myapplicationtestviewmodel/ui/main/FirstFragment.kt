package com.example.myapplicationtestviewmodel.ui.main


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationtestviewmodel.R
import kotlinx.android.synthetic.main.first_fragment.*
import kotlinx.android.synthetic.main.first_fragment.view.*

class FirstFragment : Fragment() {

    lateinit var firstButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val rootView = inflater.inflate(R.layout.first_fragment, container, false)

        rootView.firstButton.setOnClickListener {
            val viewModel: MainViewModel = ViewModelProvider(requireActivity()).get(MainViewModel::class.java)
            println("Button click !!!"+firstText.text.toString() )
            viewModel.currentText.postValue(firstText.text.toString()) }

        return rootView
    }
}

