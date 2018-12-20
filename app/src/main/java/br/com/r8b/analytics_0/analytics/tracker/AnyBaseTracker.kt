package br.com.r8b.analytics_0.analytics.tracker

import android.util.Log
import br.com.r8b.analytics_0.analytics.Analytics
import io.reactivex.disposables.Disposable

class AnyBaseTracker : Tracker {

    private var subscribe: Disposable? = null

    override fun subscribeOnEventStream() {
        val eventObservable = Analytics.instance.getEventObservable()
        subscribe = eventObservable.subscribe { eventObservable ->
            Log.i("Tracker", eventObservable.title + " " + eventObservable.title)
        }

    }

}
