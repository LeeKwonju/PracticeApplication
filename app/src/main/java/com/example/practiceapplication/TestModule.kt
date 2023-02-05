package com.example.practiceapplication

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class TestModule {

    @Provides
    @Singleton
    fun providesTestWheel(): TestWheel {
        return TestWheel(
            id = 10,
            length = 10
        )
    }
}
