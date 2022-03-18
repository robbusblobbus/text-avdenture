package com.robbie.textadventure.menus;

import com.robbie.textadventure.npcs.Enemy;
import com.robbie.textadventure.player.Player;

import java.util.Scanner;

public class BattleMenu extends Menu {

    Player player;
    Enemy enemy;

    public BattleMenu(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    @Override
    public void execute() {

        System.out.println("---------------------------------------------------------------------");

        while(menuOpen) {

            System.out.println("Battle Menu: \n A) Player Info \n B) Enemy Info \n C) Back ");

            while (!validInput) {

                String input = sc.nextLine();
                switch (input) {
                    case ("a"), ("A") -> {
                        validInput = true;
                        System.out.printf("Name: %s, Level %d %s %n",
                                player.getName(), player.getLevel(), player.getPlayerType().getTypeName());
                        System.out.printf("HP: %d/%d %n", player.getHealth(), player.getMaxHealth());
                        System.out.printf("Base attack: %d %n", player.getBaseAttack());
                        System.out.printf("Base defense: %d %n", player.getBaseDefence());
                        System.out.printf("Base speed: %d %n", player.getBaseSpeed());
                        System.out.printf("Equipped weapon: %s, Attack modifier: %+d %n",
                                player.getEquippedWeapon().getName(), player.getEquippedWeapon().getAttackModifier());
                        System.out.printf("Equipped armour: %s, Defense modifier: %+d %n",
                                player.getEquippedArmour().getName(), player.getEquippedArmour().getDefenceModifier());
                        System.out.printf("XP: %d %n", player.getExperiencePoints());
                        //TODO: XP to next level
                    }
                    case ("b"), ("B") -> {
                        validInput = true;
                        System.out.printf("Enemy: %s %n", enemy.getName());
                        System.out.printf("HP: %d/%d %n", enemy.getHealth(), enemy.getMaxHealth());
                        System.out.printf("Base attack: %d %n", enemy.getAttackStat());
                        System.out.printf("Base defense: %d %n", enemy.getDefenceStat());
                        System.out.printf("Base speed: %d %n", enemy.getSpeedStat());
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
