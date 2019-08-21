package com.ykyahwa.udemyartandroidapp

import com.ykyahwa.udemyartandroidapp.di.ApiModule
import com.ykyahwa.udemyartandroidapp.model.AnimalApiService

class ApiModuleTest(val mockService: AnimalApiService) : ApiModule() {

    override fun provideAnimalApiService(): AnimalApiService {
        return mockService
    }
}