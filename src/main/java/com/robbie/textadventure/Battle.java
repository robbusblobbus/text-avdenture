//TODO Add attack choice?
//TODO Add speed function - atm player always goes first

package com.robbie.textadventure;

import java.util.Scanner;

public class Battle {

    Player player;
    Enemy enemy = new Enemy();
    int turnNumber = 1;

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
                    case ("a"), ("A") -> {
                        validInput = true;
                        turnNumber++;
                        enemy.setHealth(enemy.getHealth() - damageCalculator.calculateEnemyDamageTaken());
                        if (enemy.getHealth() <= 0) {
                            System.out.printf("%s killed the enemy %s!", player.getName(), enemy.getName());
                            break;
                        }
                        player.setHealth(player.getHealth() - damageCalculator.calculatePlayerDamageTaken());
                    }
                    case ("b"), ("B") -> {
                        validInput = true;
                        BagMenu bagMenu = new BagMenu(player);
                        bagMenu.execute();
                    }
                    case ("c"), ("C") -> {
                        validInput = true;
                        battleOver = true;
                        // Add random run effects? E.g. run chance, maybe take some damage
                        System.out.println("You narrowly escaped!");
                    }
                    case ("d"), ("D") -> {
                        validInput = true;
                        BattleMenu battleMenu = new BattleMenu(player, enemy);
                        battleMenu.execute();
                    }
                    default -> System.out.println("Please enter a valid input");
                }
                System.out.println("---------------------------------------------------------------------");
            }

            if (enemy.getHealth() <= 0 || player.getHealth() <=0) battleOver = true;
        }
    }
}
