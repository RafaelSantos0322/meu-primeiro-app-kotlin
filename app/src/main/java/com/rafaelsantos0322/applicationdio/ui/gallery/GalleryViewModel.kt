package com.rafaelsantos0322.applicationdio.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class GalleryViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Aqui Estarão as Fotos"
    }
    val text: LiveData<String> = _text
}