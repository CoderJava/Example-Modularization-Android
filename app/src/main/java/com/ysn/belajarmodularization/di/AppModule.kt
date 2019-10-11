package com.ysn.belajarmodularization.di

import android.content.Context
import com.ysn.belajarmodularization.MainApplication
import com.ysn.belajarmodularization.navigator.NavigationProviderImpl
import com.ysn.shared.models.navigation.NavigationProvider
import com.ysn.shared.tracking.di.TrackingServiceModule
import dagger.Module
import dagger.Provides

@Module(includes = [TrackingServiceModule::class])
class AppModule {
    @Provides
    fun providesApplicationContext(application: MainApplication): Context = application

    @Provides
    fun provideNavigationProvider(navigationProvider: NavigationProviderImpl): NavigationProvider = navigationProvider
}