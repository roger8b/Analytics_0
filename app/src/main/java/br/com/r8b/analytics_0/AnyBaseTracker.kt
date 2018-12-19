package br.com.r8b.analytics_0

import android.util.Log
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
