package com.example.myapplicationtestviewmodel.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val currentText: MutableLiveData<String> by lazy {
        MutableLiveData<String>()
    }
}
