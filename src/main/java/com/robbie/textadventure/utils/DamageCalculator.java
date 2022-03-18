package com.robbie.textadventure.utils;

import com.robbie.textadventure.npcs.Enemy;
import com.robbie.textadventure.player.Player;

import java.util.Random;

//TODO Work out damage with items and any multipliers, status effects

public class DamageCalculator {

    Random rand = new Random();
    Player player;
    Enemy enemy;

    public DamageCalculator(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
    }

    public int calculatePlayerDamageTaken() {
        int enemyDamage = enemy.getAttackStat();
        enemyDamage = enemyDamage
                + rand.nextInt(-(enemyDamage/10), enemyDamage/10)
                - (player.getBaseDefence() + player.getEquippedArmour().getDefenceModifier());
        if (enemyDamage < 5) enemyDamage = 5; //TODO: 5 = minimum damage?
        System.out.printf("The enemy %s did %d damage! %n", enemy.getName(), enemyDamage);
        return enemyDamage;
    }

    public int calculateEnemyDamageTaken() {
        int playerDamage = player.getBaseAttack();
        playerDamage = playerDamage
                + rand.nextInt(-(playerDamage/10), playerDamage/10)
                + player.getEquippedWeapon().getAttackModifier();
        System.out.printf("%s did %d damage! %n", player.getName(), playerDamage);
        return playerDamage;
    }
}
