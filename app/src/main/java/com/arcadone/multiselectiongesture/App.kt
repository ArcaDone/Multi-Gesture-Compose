package com.arcadone.multiselectiongesture

import android.app.Application
import com.arcadone.multiselectiongesture.di.gridModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App: Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@App)
            modules(
                listOf(gridModule)
            )
        }
    }
}