package com.robbie.textadventure.items;

import java.util.Locale;

public class Weapon extends EquippableItem {

    WeaponType weaponType;
    int attackModifier;

    public Weapon(WeaponType weaponType) {
        this.weaponType = weaponType;
        this.name = this.weaponType.getName();
        this.attackModifier = this.weaponType.getDamage();
        this.weight = this.weaponType.getWeight();
    }

    @Override
    public void use() {
        // Equips or uses in battle
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s: %n", name.toUpperCase());
        System.out.printf("Weight: %d %n", weight);
        System.out.printf("Attack modifier: %d %n", attackModifier);
    }

    @Override
    void equip() {
        //TODO: in battle this will change turn
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public void setAttackModifier(int attackModifier) {
        this.attackModifier = attackModifier;
    }
}
