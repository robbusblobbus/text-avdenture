//TODO Incorporate rarity (appearance rate) into random enemy

package com.robbie.textadventure;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum EnemyType {
    GOBLIN ("Goblin",75, 25, 12,  5),
    BAT ("Bat",50, 12, 5, 10),
    UNICORN ("Unicorn",150, 10, 20, 20);

    private final String name;
    private final int maxHealth;
    private final int attackStat;
    private final int defenceStat;
    private final int experienceDrop;

    private static final List<EnemyType> ENEMY_TYPES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = ENEMY_TYPES.size();
    private static final Random RANDOM = new Random();

    // Maybe base drop rate or drop item?
    // Rarity

    EnemyType(String name, int maxHealth, int attackStat, int defenceStat, int experienceDrop) {
        this.name = name;
        this.maxHealth = maxHealth;
        this.attackStat = attackStat;
        this.defenceStat = defenceStat;
        this.experienceDrop = experienceDrop;
    }

    public static EnemyType randomEnemy() {
        return ENEMY_TYPES.get(RANDOM.nextInt(SIZE));
    }

    public String getName() {
        return name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getAttackStat() {
        return attackStat;
    }

    public int getExperienceDrop() {
        return experienceDrop;
    }

    public int getDefenceStat() {
        return defenceStat;
    }
}
