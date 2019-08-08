package com.ykyahwa.udemyartandroidapp.di

import com.ykyahwa.udemyartandroidapp.viewmodel.ListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ApiModule::class, PrefsModule::class, AppModule::class])
interface ViewModelComponent {

    fun inject(viewMode: ListViewModel)
}