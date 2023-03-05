package com.earl.composeapplication.di

import com.earl.data.BaseRepository
import com.earl.domain.Interactor
import com.earl.domain.Repository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class MainModule {

    @Singleton
    @Provides
    fun provideRepository() : Repository {
        return BaseRepository()
    }

    @Singleton
    @Provides
    fun provideInteractor(
        repository: Repository
    ) : Interactor {
        return Interactor.Base(
            repository
        )
    }
}