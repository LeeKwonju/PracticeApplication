package com.example.practiceapplication

import javax.inject.Inject

class TestCar @Inject constructor(
    val testWheel: TestWheel
) {
    val carId = 8
}

data class TestWheel(
    val id: Int,
    val length: Int
)
