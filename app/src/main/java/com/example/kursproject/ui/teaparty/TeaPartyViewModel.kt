package com.example.kursproject.ui.teaparty

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TeaPartyViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is tea party Fragment"
    }
    val text: LiveData<String> = _text
}