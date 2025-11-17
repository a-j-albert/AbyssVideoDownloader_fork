package com.abmo

import com.abmo.di.koinModule
import org.koin.core.context.startKoin

suspend fun main(args: Array<String>) {
    startKoin { modules(koinModule) }
    // throw RuntimeException("Condition met, breaking for debug.");
    // Thread.sleep(30000)
    Application(args).run()
}
