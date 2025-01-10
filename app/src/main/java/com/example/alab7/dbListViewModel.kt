package com.example.alab7

import androidx.lifecycle.ViewModel

class dbListViewModel : ViewModel(){
    private val crimeRepository = PhotoRepository.get()
    val photoListLiveData = crimeRepository.getPhotos()
}