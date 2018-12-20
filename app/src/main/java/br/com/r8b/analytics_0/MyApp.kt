package br.com.r8b.analytics_0

import android.app.Application
import br.com.r8b.analytics_0.analytics.tracker.AnyBaseTracker
import br.com.r8b.analytics_0.analytics.tracker.FireBaseTracker
import br.com.r8b.analytics_0.analytics.tracker.Tracker

class MyApp : Application(){



    override fun onCreate() {
        super.onCreate()

        val fireBaseTracker: Tracker =
            FireBaseTracker()
        fireBaseTracker.subscribeOnEventStream()

        val anyBaseTracker: Tracker =
            AnyBaseTracker()
        anyBaseTracker.subscribeOnEventStream()
    }



}