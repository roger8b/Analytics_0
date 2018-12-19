package br.com.r8b.analytics_0

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject

class Analytics {


    private val eventPublishSubject = PublishSubject.create<Event>()

    companion object {
        val instance = Analytics()
    }

    fun trackEvent(event: Event) {
        eventPublishSubject.onNext(event)
    }

    fun getEventObservable() : Observable<Event> {
        return eventPublishSubject

    }


}
