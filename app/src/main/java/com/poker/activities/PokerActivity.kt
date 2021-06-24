package com.poker.activities

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.poker.R
import com.poker.models.PokerHand

class PokerActivity : AppCompatActivity() {

    val pokerhand1 = PokerHand(intArrayOf(14, 2, 3, 4, 5))
    val pokerhand2 = PokerHand(intArrayOf(9, 10, 11, 12, 13))
    val pokerhand3 = PokerHand(intArrayOf(2, 7, 8, 5, 10, 9, 11))
    val pokerhand4 = PokerHand(intArrayOf(7, 8, 12, 13, 14))
    val hands = arrayOf(pokerhand1,pokerhand2,pokerhand3,pokerhand4)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            buttonClick()
        }
    }

    fun buttonClick() {
        var getLucky =  hands.random()
        val handText = findViewById<TextView>(R.id.textHandView)
        var cards = ""
        for (i in getLucky.cards.indices) {
            cards += getLucky.cards[i].toString() +", "
        }
        handText.text = cards

        var validation = getLucky.winnerSequence()
        val winnrTextView = findViewById<TextView>(R.id.textResultView2)
        if (validation) {
            winnrTextView.text = this.getText(R.string.winner_text)
        } else {
            winnrTextView.text = this.getText(R.string.loser_text)
        }
    }

}