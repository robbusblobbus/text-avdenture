package com.robbie.textadventure;

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
    void use() {
        // Equips or uses in battle
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
