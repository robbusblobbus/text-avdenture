package com.robbie.textadventure.items;

public class Armour extends EquippableItem {

    //TODO: Top, bottom, shoes, gloves, shield etc.

    ArmourType armourType;
    int defenceModifier;

    {usableInBattle = false;}

    public Armour(ArmourType armourType) {
        this.armourType = armourType;
        this.name = armourType.getName();
        this.defenceModifier = armourType.getDefenceModifier();
        this.weight = armourType.getWeight();
    }

    @Override
    public void use() {
        //
    }

    @Override
    public void displayDetails() {
        System.out.printf("%s: %n", name.toUpperCase());
        System.out.printf("Weight: %d %n", weight);
        System.out.printf("Defense modifier: %+d %n", defenceModifier);
    }

    @Override
    void equip() {
        //cannot equip in battle
    }

    public int getDefenceModifier() {
        return defenceModifier;
    }

    public void setDefenceModifier(int defenceModifier) {
        this.defenceModifier = defenceModifier;
    }
}
