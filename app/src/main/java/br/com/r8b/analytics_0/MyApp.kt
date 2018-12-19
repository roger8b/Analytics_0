package br.com.r8b.analytics_0

import android.app.Application

class MyApp : Application(){



    override fun onCreate() {
        super.onCreate()

        val fireBaseTracker: Tracker = FireBaseTracker()
        fireBaseTracker.subscribeOnEventStream()

        val anyBaseTracker: Tracker = AnyBaseTracker()
        anyBaseTracker.subscribeOnEventStream()
    }



}