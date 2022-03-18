//TODO Add attack choice?
//TODO Add speed function - atm player always goes first
//TODO Enemy depends on circumstance - feeds into constructor

package com.robbie.textadventure.events;

import com.robbie.textadventure.utils.DamageCalculator;
import com.robbie.textadventure.menus.BagMenu;
import com.robbie.textadventure.menus.BattleMenu;
import com.robbie.textadventure.npcs.Enemy;
import com.robbie.textadventure.player.Player;
import com.robbie.textadventure.utils.InputAnalyser;
import com.robbie.textadventure.utils.SpeedCalculator;

import java.util.Random;
import java.util.Scanner;

public class Battle {

    Player player;
    Enemy enemy = new Enemy();
    int turnNumber = 1;
    int playerSpeed;
    Random rand = new Random();

    public Battle(Player player) {
        this.player = player;
    }

    public void execute() {

        Scanner sc = new Scanner(System.in);
        boolean battleOver = false;
        DamageCalculator damageCalculator = new DamageCalculator(player, enemy);

        System.out.printf("A wild %s appeared!%n", enemy.getName());
        System.out.println("---------------------------------------------------------------------");

        while(!battleOver) {

            System.out.printf("--Turn %d-- %n", turnNumber);
            System.out.println("What would you like to do? \n A) Attack \n B) Bag \n C) Run \n D) Menu ");
            System.out.printf("%s's health: %d/%d     Enemy health: %d/%d %n",
                    player.getName(), player.getHealth(), player.getMaxHealth(),
                    enemy.getHealth(), enemy.getMaxHealth());

            boolean validInput = false;

            while (!validInput) {

                String input = sc.nextLine();
                switch (input) {
                    //TODO: Attack can use weapon or power
                    case ("a"), ("A") -> {
                        validInput = true;
                        turnNumber++;
                        playerSpeed = SpeedCalculator.calculatePlayerSpeed(player.getBaseSpeed());

                        if (playerSpeed >= enemy.getSpeedStat()) {
                            enemy.setHealth(enemy.getHealth() - damageCalculator.calculateEnemyDamageTaken());
                            if (enemy.getHealth() <= 0) break;
                            player.setHealth(player.getHealth() - damageCalculator.calculatePlayerDamageTaken());

                        } else {
                            player.setHealth(player.getHealth() - damageCalculator.calculatePlayerDamageTaken());
                            if (player.getHealth() <= 0) break;
                            enemy.setHealth(enemy.getHealth() - damageCalculator.calculateEnemyDamageTaken());
                        }
                    }
                    case ("b"), ("B") -> {
                        validInput = true;
                        BagMenu bagMenu = new BagMenu(player);
                        bagMenu.execute();
                    }
                    case ("c"), ("C") -> {
                        validInput = true;
                        if (!InputAnalyser.areYouSure("Are you sure?")) break;
                        playerSpeed = SpeedCalculator.calculatePlayerSpeed(player.getBaseSpeed());
                        if (playerSpeed < enemy.getSpeedStat() && rand.nextBoolean()) {
                            System.out.println("You couldn't get away!");
                            player.setHealth(player.getHealth() - damageCalculator.calculatePlayerDamageTaken());
                            if (player.getHealth() <= 0) break;
                        } else {
                            battleOver = true;
                            System.out.println("You narrowly escaped!");
                        }
                    }
                    case ("d"), ("D") -> {
                        validInput = true;
                        BattleMenu battleMenu = new BattleMenu(player, enemy);
                        battleMenu.execute();
                    }
                    default -> System.out.println("Please enter a valid input");
                }
                System.out.println("---------------------------------------------------------------------");

                if (enemy.getHealth() <= 0) {
                    battleOver = true;
                    System.out.printf("%s killed the enemy %s! %n", player.getName(), enemy.getName());
                } else if (player.getHealth() <= 0) {
                    battleOver = true;
                    System.out.printf("Noble %s %s was slain by the enemy %s! %n",
                            player.getPlayerType().getTypeName(), player.getName(), enemy.getName());
                }
            }
        }
    }
}
