// TODO Custom player creation
// TODO Battle mechanics
// TODO Input checker
// TODO Equippable weapons and armour
// TODO Levels?
// TODO Enemy strengths/weaknesses

package com.robbie.textadventure;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System objects
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        //Player variables
        boolean running = true;

        System.out.println("Welcome to the dungeon");
        System.out.println("What is your name?");

        Player player = new Player(sc.nextLine());

        GAME:
        while(running) {
            System.out.println("---------------------------------------------------------------------");

            Battle battle = new Battle(player);
            battle.execute();
            running = false;
        }

    }
}
