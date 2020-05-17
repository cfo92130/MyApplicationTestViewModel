package com.example.myapplicationtestviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myapplicationtestviewmodel.ui.main.MainViewModel
import kotlinx.android.synthetic.main.main_activity.*



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        val nameObserver = Observer<String> { newName ->
            println("Observer !!!! NewName =" + newName)
            textView.text = "Observe value ="+newName
        }
        // Observe the LiveData, passing in this activity as the LifecycleOwner and the observer.
        val viewModel: MainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.currentText.observe(this, nameObserver)
     }
}
