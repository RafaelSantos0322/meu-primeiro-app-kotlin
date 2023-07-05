package com.rafaelsantos0322.applicationdio.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SlideshowViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Esta é a aba para Slides"
    }
    val text: LiveData<String> = _text
}