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

        System.out.printf("A wild %s appeared!%n", enemy.getEnemyName());
        System.out.println("---------------------------------------------------------------------");

        while(!battleOver) {

            System.out.printf("--Turn %d-- %n", turnNumber);
            System.out.println("What would you like to do? \n A) Attack \n B) Bag \n C) Run \n D) Menu ");
            System.out.printf("%s's health: %d/%d     Enemy health: %d/%d %n",
                    player.getPlayerName(), player.getPlayerHitPoints(), player.getPlayerMaxHitPoints(),
                    enemy.getEnemyMaxHitPoints(), enemy.getEnemyHitPoints());

            boolean validInput = false;

            while (!validInput) {

                String input = sc.nextLine();
                switch (input) {
                    case ("a"), ("A") -> {
                        validInput = true;
                        turnNumber++;
                        enemy.setEnemyHitPoints(enemy.getEnemyHitPoints() - damageCalculator.calculateEnemyDamageTaken());
                        if (enemy.getEnemyHitPoints() <= 0) {
                            System.out.printf("%s killed the enemy %s!", player.getPlayerName(), enemy.getEnemyName());
                            break;
                        }
                        player.setPlayerHitPoints(player.getPlayerHitPoints() - damageCalculator.calculatePlayerDamageTaken());
                    }
                    case ("b"), ("B") ->
                            //validInput = true;
                            // Do bag stuff -- make sure to increment turn if you do something
                            System.out.println("Bag functionality under construction -- enter something else");
                    case ("c"), ("C") -> {
                        validInput = true;
                        battleOver = true;
                        // Add random run effects? E.g. run chance, maybe take some damage
                        System.out.println("You narrowly escaped!");
                    }
                    case ("d"), ("D") -> {
                        // Do menu stuff like see stats
                        validInput = true;
                        BattleMenu battleMenu = new BattleMenu(player, enemy);
                        battleMenu.execute();
                    }
                    default -> System.out.println("Please enter a valid input");
                }
                System.out.println("---------------------------------------------------------------------");
            }

            if (enemy.getEnemyHitPoints() <= 0 || player.getPlayerHitPoints() <=0) battleOver = true;
        }
    }
}
