package com.example.kursproject.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class FavoriteViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is favorite fragment"
    }
    val text: LiveData<String> = _text
}