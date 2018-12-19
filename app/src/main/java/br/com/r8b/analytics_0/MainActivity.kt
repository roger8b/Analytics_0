package br.com.r8b.analytics_0

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_evento.setOnClickListener {
            val event = EventFactory().getButtonEvent()
            Analytics.instance.trackEvent(event)

        }
    }
}
