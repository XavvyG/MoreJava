package com.qa.day6;
import java.lang.Math;

public class BlackjackSimple {
    public int play(int dealer, int player) {
        if (dealer > 21 && player > 21) {
            return 0;
        } else if (dealer > 21) {
            return player;
        } else if (player > 21) {
            return dealer;
        }
        return Math.max(dealer, player);
    }
}