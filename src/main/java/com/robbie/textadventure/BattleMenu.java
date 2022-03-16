package com.robbie.textadventure;

import java.util.Scanner;

public class BattleMenu {

    Player player;
    Enemy enemy;

    public BattleMenu(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);
        boolean menuOpen = true;
        System.out.println("---------------------------------------------------------------------");

        while(menuOpen) {

            System.out.println("Battle Menu: \n A) Player Info \n B) Enemy Info \n C) Back ");

            boolean validInput = false;

            while (!validInput) {

                String input = sc.nextLine();
                switch (input) {
                    case ("a"), ("A") -> {
                        validInput = true;
                        System.out.printf("Name: %s, Level %d %n", player.getName(), player.getLevel());
                        System.out.printf("HP: %d/%d %n", player.getHealth(), player.getMaxHealth());
                        System.out.printf("Base attack: %d %n", player.getBaseAttack());
                        System.out.printf("Base defense: %d %n", player.getBaseDefence());
                        System.out.printf("Equipped weapon: %s, Attack modifier: +%d %n",
                                player.getEquippedWeapon().getName(), player.equippedWeapon.getAttackModifier());
                        System.out.printf("Equipped armour: %s, Defense modifier: +%d %n",
                                player.getEquippedArmour().getName(), player.equippedArmour.getDefenceModifier());
                        System.out.printf("XP: %d %n", player.getExperiencePoints());
                        //TODO: XP to next level
                    }
                    case ("b"), ("B") -> {
                        validInput = true;
                        System.out.printf("Enemy: %s %n", enemy.getName());
                        System.out.printf("HP: %d/%d %n", enemy.getHealth(), enemy.getMaxHealth());
                        System.out.printf("Base attack: %d %n", enemy.getAttackStat());
                        System.out.printf("Base defense: %d %n", enemy.getDefenceStat());
                        //TODO: add type or similar
                    }
                    case ("c"), ("C") -> {
                        validInput = true;
                        menuOpen = false;
                    }
                    default -> System.out.println("Please enter a valid input");
                }
                System.out.println("---------------------------------------------------------------------");
            }
        }
    }
}
