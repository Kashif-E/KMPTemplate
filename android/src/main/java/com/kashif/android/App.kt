package com.kashif.android

import android.app.Application
import com.kashif.common.di.initKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        // TODO: Change your base url from here
        initKoin(enableNetworkLogs = true, baseUrl = "Your base url here") {}
    }
}
