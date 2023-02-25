package com.kashif.common.main

import androidx.compose.runtime.Composable
import com.kashif.common.App
import org.koin.core.context.GlobalContext.get

@Composable
fun Application() {
    App(platform = "Android")
}