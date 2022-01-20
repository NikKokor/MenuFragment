package com.example.menuFragment.ui.first

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FirstViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "First"
    }
    val text: LiveData<String> = _text
}