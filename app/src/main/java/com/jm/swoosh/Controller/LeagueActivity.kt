package com.jm.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.jm.swoosh.Model.Player
import com.jm.swoosh.R
import com.jm.swoosh.utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {
    var player = Player("", "")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun leagueNextClick(view: View) {
        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }
        else {
            Toast.makeText(this, "Please select a league", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMensBtnClick(view: View) {
        womenLeagutBtn.isChecked = false
        coedLeagutBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomenBtnClick(view: View) {
        mensLeagutBtn.isChecked = false
        coedLeagutBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedBtnClick(view: View) {
        womenLeagutBtn.isChecked = false
        mensLeagutBtn.isChecked = false

        player.league = "coed"
    }


}
