package br.com.r8b.analytics_0.analytics

class EventFactory {

    fun getButtonEventI() : Event {
        return Event().apply {
            title = "Button I"
        }
    }

    fun getButtonEventII(): Event {
        return Event().apply {
            title = "Button II"
        }
    }

}