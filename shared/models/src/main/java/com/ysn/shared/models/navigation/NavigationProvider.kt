package com.ysn.shared.models.navigation

import com.ysn.shared.models.navigation.features.FeatureOneNavigator

interface NavigationProvider {
    fun provideFeatureOneNavigator(): FeatureOneNavigator
}