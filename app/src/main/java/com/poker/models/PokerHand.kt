package com.poker.models

import java.util.*


class PokerHand (private val hand: IntArray) {
    val cards = this.hand

    fun winnerSequence(): Boolean {
        var aux = 0
        Arrays.sort(this.hand)
        if (hand.size >= 5) {
            for (i in hand.indices) {
                if (aux < 5) {
                    if (hand[i] != hand.last()) {
                        if (hand[i] == hand[i + 1] - 1) {
                            aux++
                        } else if (hand.last() == 14 && aux == 3) {
                            aux++
                        }
                    } else {
                        if (hand.last() == 14 && hand.first() == 2) {
                            aux++
                        } else if (i != 0) {
                            if (hand.last() - 1 == hand[i - 1]) {
                                aux++
                            }
                        }
                    }
                }
            }
        }
        return aux == 5
    }

}
