package br.com.r8b.analytics_0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.r8b.analytics_0.analytics.Analytics
import br.com.r8b.analytics_0.analytics.Event
import br.com.r8b.analytics_0.analytics.EventFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_evento_i.setOnClickListener { onButtonIClicked() }

        bt_evento_ii.setOnClickListener { onButtonIIClicked() }
    }

    private fun onButtonIIClicked() {
        val event = EventFactory().getButtonEventII()
        trackEvent(event)
    }

    private fun onButtonIClicked() {
        val event = EventFactory().getButtonEventI()
        trackEvent(event)
    }

    private fun trackEvent(event: Event) {
        Analytics.instance.trackEvent(event)
    }
}
