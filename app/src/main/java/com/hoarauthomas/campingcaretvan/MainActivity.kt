package com.hoarauthomas.campingcaretvan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import androidx.fragment.app.commit
import androidx.fragment.app.replace

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<MapsFragment>(R.id.myFragmentContainer)
            setReorderingAllowed(true)
            addToBackStack(null) // name can be null
        }

    }
}