//TODO Include item speed modifiers

package com.robbie.textadventure.utils;

import java.util.Random;

public class SpeedCalculator {

    static Random rand = new Random();
    public static int calculatePlayerSpeed(int baseSpeed) {

        int playerSpeed = baseSpeed + rand.nextInt(-(baseSpeed/10), baseSpeed/10);
        return playerSpeed;
    }
}
