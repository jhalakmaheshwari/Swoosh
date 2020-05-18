package com.jm.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import com.jm.swoosh.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Intent is to communicate between activities
        getStartedBtn.setOnClickListener {
            // explicit Intent
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }
    }
}
