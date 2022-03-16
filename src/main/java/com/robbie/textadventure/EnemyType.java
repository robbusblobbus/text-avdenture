//TODO Incorporate rarity (appearance rate) into random enemy

package com.robbie.textadventure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum EnemyType {
    GOBLIN ("Goblin",75, 25,  5),
    BAT ("Bat",50, 12, 10),
    UNICORN ("Unicorn",150, 30, 20); // etc.

    private final String name;
    private final int enemyHitPoints;
    private final int enemyBaseAttack;
    private final int experienceDrop;

    private static final List<EnemyType> ENEMY_TYPES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = ENEMY_TYPES.size();
    private static final Random RANDOM = new Random();

    // Maybe base drop rate or drop item?
    // Rarity

    EnemyType(String name, int enemyHitPoints, int enemyBaseAttack, int experienceDrop) {
        this.name = name;
        this.enemyHitPoints = enemyHitPoints;
        this.enemyBaseAttack = enemyBaseAttack;
        this.experienceDrop = experienceDrop;
    }

    public static EnemyType randomEnemy() {
        return ENEMY_TYPES.get(RANDOM.nextInt(SIZE));
    }

    public String getName() {
        return name;
    }

    public int getEnemyHitPoints() {
        return enemyHitPoints;
    }

    public int getEnemyBaseAttack() {
        return enemyBaseAttack;
    }

    public int getExperienceDrop() {
        return experienceDrop;
    }
}
