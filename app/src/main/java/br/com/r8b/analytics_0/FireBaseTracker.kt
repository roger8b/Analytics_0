package br.com.r8b.analytics_0

import android.util.Log
import io.reactivex.disposables.Disposable

class FireBaseTracker : Tracker {


    private var subscribe: Disposable? = null

    override fun subscribeOnEventStream() {
        val eventObservable = Analytics.instance.getEventObservable()
        subscribe = eventObservable.subscribe { eventObservable ->
            Log.i("FirebaseTracker", "EventButton")
        }
    }

    fun onDestroy() {
        subscribe?.dispose()
    }

}
