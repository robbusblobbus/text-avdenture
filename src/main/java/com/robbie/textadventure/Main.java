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

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean running = true;
        Player player;

        System.out.println("Welcome to the dungeon");
        System.out.println("What is your name?");
        String input = sc.nextLine();
//        System.out.println("/// Placeholder input");
//        String input = "Robbie";

        player = new Player(input, WeaponType.FISTS, ArmourType.NUDE);

        //TODO: Remove below items from bag - only there for testing
        player.getBag().addToBag(new Weapon(WeaponType.SWORD));
        player.getBag().addToBag(new Armour(ArmourType.COTTON_CLOTHING));

        GAME:
        while(running) {
            System.out.println("---------------------------------------------------------------------");

            Battle battle = new Battle(player);
            battle.execute();
            running = false;
        }

    }
}
