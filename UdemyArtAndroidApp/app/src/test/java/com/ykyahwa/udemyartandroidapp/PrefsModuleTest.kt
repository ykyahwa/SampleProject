package com.ykyahwa.udemyartandroidapp

import android.app.Application
import com.ykyahwa.udemyartandroidapp.di.PrefsModule
import com.ykyahwa.udemyartandroidapp.util.SharedPreferenceHelper

class PrefsModuleTest(val mockPrefs: SharedPreferenceHelper) : PrefsModule() {

    override fun proviceSharedPreference(app: Application): SharedPreferenceHelper {
        return mockPrefs
    }

}