package com.ysn.shared.tracking.di

import com.ysn.shared.models.tracking.TrackingService
import com.ysn.shared.tracking.TrackingServiceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Singleton
@Module
class TrackingServiceModule {
    @Provides
    fun provideTrackingService(trackingServiceImpl: TrackingServiceImpl): TrackingService = trackingServiceImpl
}