package com.ysn.belajarmodularization.navigator

import android.content.Context
import android.content.Intent
import com.ysn.shared.models.navigation.NavigationProvider
import com.ysn.shared.models.navigation.features.FeatureOneNavigator
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class NavigationProviderImpl @Inject constructor(private val context: Context): NavigationProvider {
    override fun provideFeatureOneNavigator(): FeatureOneNavigator = object : FeatureOneNavigator {
        override fun showFeatureTwo() {
            /*context.startActivity(Intent(context, FeatureTwoActivity::class.java))*/
        }
    }
}