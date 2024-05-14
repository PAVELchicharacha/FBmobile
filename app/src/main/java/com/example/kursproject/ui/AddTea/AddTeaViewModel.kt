package com.example.kursproject.ui.AddTea

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AddTeaViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is Add Tea Fragment"
    }
    val text: LiveData<String> = _text
}