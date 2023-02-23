package com.kashif.common.di

import com.kashif.common.platformModule
import org.koin.core.context.startKoin
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module

fun initKoin(
    enableNetworkLogs: Boolean = false,
    baseUrl: String,
    appDeclaration: KoinAppDeclaration = {},
) = startKoin {
    appDeclaration()
    modules(commonModule(enableNetworkLogs = enableNetworkLogs, baseUrl))
}

// called by iOS, Desktop etc
fun initKoin(baseUrl: String) = initKoin(enableNetworkLogs = true, baseUrl = baseUrl) {}

fun commonModule(
    enableNetworkLogs: Boolean,
    baseUrl: String,
) =   platformModule() + getDataModule(enableNetworkLogs, baseUrl)

fun getDataModule(
    enableNetworkLogs: Boolean,
    baseUrl: String,
) = module {



}
