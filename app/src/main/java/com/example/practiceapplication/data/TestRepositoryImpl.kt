package com.example.practiceapplication.data

import com.example.practiceapplication.TestCar
import com.example.practiceapplication.TestWheel
import com.example.practiceapplication.domain.TestRepository
import javax.inject.Inject

class TestRepositoryImpl @Inject constructor(): TestRepository {

    override fun getData(): TestCar {
        return TestCar(
            TestWheel(
                id = 8,
                length = 7
            )
        )
    }
}
