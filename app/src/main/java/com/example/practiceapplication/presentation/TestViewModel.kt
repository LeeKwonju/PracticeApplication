package com.example.practiceapplication.presentation

import androidx.lifecycle.ViewModel
import com.example.practiceapplication.domain.TestRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    val testRepository: TestRepository
): ViewModel()
