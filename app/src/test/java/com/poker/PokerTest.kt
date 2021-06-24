package com.poker

import com.poker.models.PokerHand
import org.junit.Assert
import org.junit.Test

class PokerTest {
    @Test
    fun testPoker() {
       val hand1 = PokerHand(intArrayOf(2,3,4,5,6))
        Assert.assertTrue(hand1.winnerSequence())
        val hand2 = PokerHand(intArrayOf(14,5,4,2,3))
        Assert.assertTrue(hand2.winnerSequence())

        val hand3 = PokerHand(intArrayOf(7,5,3,4,6,8,4))
        Assert.assertTrue(hand3.winnerSequence())

        val hand4 = PokerHand(intArrayOf(2,2,2,2,2))
        Assert.assertFalse(hand4.winnerSequence())

        val hand5 = PokerHand(intArrayOf(3,4,5,6,8))
        Assert.assertFalse(hand5.winnerSequence())

        val hand6 = PokerHand(intArrayOf(1,2,3))
        Assert.assertFalse(hand6.winnerSequence())
    }
}