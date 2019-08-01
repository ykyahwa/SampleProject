package com.ykyahwa.udemyartandroidapp.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.ykyahwa.udemyartandroidapp.model.Animal

class ListViewModel(application: Application) : AndroidViewModel(application) {

    val animals by lazy { MutableLiveData<List<Animal>>() }
    val loadError by lazy { MutableLiveData<Boolean>() }
    val loading by lazy { MutableLiveData<Boolean>() }


    fun refresh() {
        getAnimals()
    }


    private fun getAnimals() {
        val a1 = Animal("aligator")
        val a2 = Animal("bee")
        val a3 = Animal("cat")
        val a4 = Animal("dog")
        val a5 = Animal("flamingo")


        val animalList = arrayListOf(a1,a2,a3,a4,a5)

        animals.value = animalList
        loadError.value = false
        loading.value = false
    }


}