package ru.nsu.fit.android.lab_1.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.addCallback
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityOptionsCompat
import ru.nsu.fit.android.lab_1.R

class ActivityC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_c)

        onBackPressedDispatcher.addCallback(this) {
            finish()
            overridePendingTransition(R.anim.slide_in, R.anim.slide_out)
        }
    }

    fun goToA(view: View) {
        val intent = Intent(this, ActivityA::class.java)
        val options = ActivityOptionsCompat.makeSceneTransitionAnimation(this) // Создайте объект для анимации
        startActivity(intent, options.toBundle())
    }
}