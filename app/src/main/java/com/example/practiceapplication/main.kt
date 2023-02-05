package com.example.practiceapplication

import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flow
import kotlin.system.measureTimeMillis

fun main() {

    runBlocking {
        val startTime = System.currentTimeMillis()

        val testFlow: Flow<Int> = flow {
            emit(1)
            delay(300)
            emit(2)
            delay(200)
            emit(3)
        }

        val testStateFlow = MutableStateFlow<Int>(
        1
        )

        CoroutineScope(Dispatchers.Default).launch {
            testStateFlow.collect {
                println("stateFlow emitted $it")
            }
        }

        CoroutineScope(Dispatchers.Default).launch {
            testStateFlow.emit(2)
            delay(500)
            testStateFlow.emit(3)
        }


    }

    Thread.sleep(2000)

}
