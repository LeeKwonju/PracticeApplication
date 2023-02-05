package com.example.practiceapplication.domain

import com.example.practiceapplication.TestCar

interface TestRepository {
    fun getData(): TestCar
}
