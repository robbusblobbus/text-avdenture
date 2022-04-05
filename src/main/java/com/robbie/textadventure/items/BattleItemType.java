package com.robbie.textadventure.items;

public enum BattleItemType {

    SMALL_HEALTH_POTION("Small Health Potion", 1, 25, 0, 0, 0);

    private final String name;
    private final int weight;
    private final int healthEffect;
    private final int attackEffect;
    private final int defenseEffect;
    private final int effectDuration;

    BattleItemType(String name, int weight, int healthEffect, int attackEffect, int defenseEffect, int effectDuration) {
        this.name = name;
        this.weight = weight;
        this.healthEffect = healthEffect;
        this.attackEffect = attackEffect;
        this.defenseEffect = defenseEffect;
        this.effectDuration = effectDuration;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public int getHealthEffect() {
        return healthEffect;
    }

    public int getAttackEffect() {
        return attackEffect;
    }

    public int getDefenseEffect() {
        return defenseEffect;
    }

    public int getEffectDuration() {
        return effectDuration;
    }
}
