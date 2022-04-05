package com.robbie.textadventure.npcs;

//TODO Add enemy status (normal/dead/poisoned/etc. etc.)

public class Enemy {

    EnemyType enemyType;
    private String name;
    private int maxHealth;
    private int health;
    private int attackStat;
    private int defenceStat;
    private int speedStat;
    private int experienceDrop;

    public Enemy() {
        this.enemyType = EnemyType.randomEnemy();
        this.name = enemyType.getName();
        this.maxHealth = enemyType.getMaxHealth();
        this.health = maxHealth;
        this.attackStat = enemyType.getAttackStat();
        this.defenceStat = enemyType.getDefenceStat();
        this.speedStat = enemyType.getSpeedStat();
        this.experienceDrop = enemyType.getExperienceDrop();
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getAttackStat() {
        return attackStat;
    }

    public void setAttackStat(int attackStat) {
        this.attackStat = attackStat;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDefenceStat() {
        return defenceStat;
    }

    public void setDefenceStat(int defenceStat) {
        this.defenceStat = defenceStat;
    }

    public int getExperienceDrop() {
        return experienceDrop;
    }

    public void setExperienceDrop(int experienceDrop) {
        this.experienceDrop = experienceDrop;
    }

    public int getSpeedStat() {
        return speedStat;
    }

    public void setSpeedStat(int speedStat) {
        this.speedStat = speedStat;
    }
}
