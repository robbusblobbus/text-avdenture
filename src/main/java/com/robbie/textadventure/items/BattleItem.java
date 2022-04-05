package com.robbie.textadventure.items;

public class BattleItem extends Item {

    BattleItemType battleItemType;
    private int healthEffect;
    private int attackEffect;
    private int defenseEffect;
    private int effectDuration;
//    private StatusModifier statusModifier;

    public BattleItem (BattleItemType battleItemType) {
        this.battleItemType = battleItemType;
        this.healthEffect = battleItemType.getHealthEffect();
        this.name = battleItemType.getName();
        this.weight = battleItemType.getWeight();
        this.attackEffect = battleItemType.getAttackEffect();
        this.defenseEffect = battleItemType.getDefenseEffect();
        this.effectDuration = battleItemType.getEffectDuration();
        this.usableInBattle = true;
    }

    @Override
    public void use() {

    }

    @Override
    public void displayDetails() {
        System.out.printf("%s: %n", name.toUpperCase());
        System.out.printf("Weight: %d %n", weight);
        System.out.printf("Effects: %n");
        if (healthEffect != 0) System.out.printf("   Health: %+d %n", healthEffect);
        if (attackEffect != 0) System.out.printf("   Attack stat effect: %+d %n", attackEffect);
        if (defenseEffect != 0) System.out.printf("   Defense stat effect: %+d %n", defenseEffect);
        if (effectDuration != 0)System.out.printf("   Effect duration: %d turns", effectDuration);
        //TODO        if (statusModifier != NONE) System.out.printf("   Status modifier: %s %n", statusModifier);
    }
}
