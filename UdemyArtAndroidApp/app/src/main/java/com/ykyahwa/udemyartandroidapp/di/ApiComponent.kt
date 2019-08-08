package com.ykyahwa.udemyartandroidapp.di

import com.ykyahwa.udemyartandroidapp.model.AnimalApiService
import dagger.Component

@Component(modules = [ApiModule::class])
interface ApiComponent {

    fun inject(service: AnimalApiService)
}