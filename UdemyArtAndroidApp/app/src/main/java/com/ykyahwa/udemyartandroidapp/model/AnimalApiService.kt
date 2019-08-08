package com.ykyahwa.udemyartandroidapp.model

import com.ykyahwa.udemyartandroidapp.di.DaggerApiComponent
import io.reactivex.Single
import javax.inject.Inject

class AnimalApiService {

    @Inject
    lateinit var api: AnimalApi

    init {
        DaggerApiComponent.create().inject(this)
    }

    fun getApiKey(): Single<ApiKey> = api.getApiKey()

    fun getAnimals(key: String) : Single<List<Animal>> = api.getAnimals(key)
}