package com.ykyahwa.udemyartandroidapp.di

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.ykyahwa.udemyartandroidapp.util.SharedPreferenceHelper
import dagger.Module
import dagger.Provides
import javax.inject.Qualifier
import javax.inject.Singleton

@Module
open class PrefsModule {

    @Provides
    @Singleton
    @TypeOfContext(CONTEXT_APP)
    open fun proviceSharedPreference(app: Application) : SharedPreferenceHelper {
        return SharedPreferenceHelper(app)
    }

    @Provides
    @Singleton
    @TypeOfContext(CONTEXT_ACTIVITY)
    fun provideActivitySharedPreference(activity: AppCompatActivity) : SharedPreferenceHelper {
        return SharedPreferenceHelper(activity)
    }
}

const val CONTEXT_APP = "Application context"
const val CONTEXT_ACTIVITY = "Activity context"

@Qualifier
annotation class TypeOfContext(val type: String)