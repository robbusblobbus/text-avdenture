package com.robbie.textadventure;

//TODO Add enemy status (normal/dead/poisoned/etc. etc.)

public class Enemy {

    EnemyType enemyType;
    private String enemyName;
    private int enemyMaxHitPoints;
    private int enemyHitPoints;
    private int enemyBaseAttack;
    private int enemyExperienceDrop;

    public Enemy() {
        this.enemyType = EnemyType.randomEnemy();
        this.enemyName = this.enemyType.getName();
        this.enemyMaxHitPoints = this.enemyType.getEnemyHitPoints();
        this.enemyHitPoints = this.enemyMaxHitPoints;
        this.enemyBaseAttack = this.enemyType.getEnemyBaseAttack();
        this.enemyExperienceDrop = this.enemyType.getExperienceDrop();
    }

    public EnemyType getEnemyType() {
        return enemyType;
    }

    public void setEnemyType(EnemyType enemyType) {
        this.enemyType = enemyType;
    }

    public String getEnemyName() {
        return enemyName;
    }

    public void setEnemyName(String enemyName) {
        this.enemyName = enemyName;
    }

    public int getEnemyMaxHitPoints() {
        return enemyMaxHitPoints;
    }

    public void setEnemyMaxHitPoints(int enemyMaxHitPoints) {
        this.enemyMaxHitPoints = enemyMaxHitPoints;
    }

    public int getEnemyBaseAttack() {
        return enemyBaseAttack;
    }

    public void setEnemyBaseAttack(int enemyBaseAttack) {
        this.enemyBaseAttack = enemyBaseAttack;
    }

    public int getEnemyHitPoints() {
        return enemyHitPoints;
    }

    public void setEnemyHitPoints(int enemyHitPoints) {
        this.enemyHitPoints = enemyHitPoints;
    }
}
