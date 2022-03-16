package com.robbie.textadventure;

import java.util.Random;

//TODO Work out damage with items and any multipliers, status effects
//TODO Include armor in damage calculation

public class DamageCalculator {

    Random rand = new Random();
    Player player;
    Enemy enemy;
    int playerDamage;
    int enemyDamage;

    public DamageCalculator(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        this.playerDamage = this.player.getPlayerBaseAttack(); // Add multipliers here
        this.enemyDamage = this.enemy.getEnemyBaseAttack();
    }

    int calculatePlayerDamageTaken() {
        enemyDamage = enemyDamage + rand.nextInt(-(enemyDamage/10), enemyDamage/10);
        System.out.printf("The enemy %s did %d damage! %n", enemy.getEnemyName(), enemyDamage);
        return enemyDamage;
    }

    int calculateEnemyDamageTaken() {
        playerDamage = playerDamage + rand.nextInt(-(playerDamage/10), playerDamage/10);
        System.out.printf("%s did %d damage! %n", player.getPlayerName(), playerDamage);
        return playerDamage;
    }
}
