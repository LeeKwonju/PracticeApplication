package com.example.practiceapplication.data

import com.example.practiceapplication.domain.TestRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    abstract fun providesTestRepository(
        impl: TestRepositoryImpl
    ): TestRepository
}
