package com.robbie.textadventure;

public class Armour extends EquippableItem {

    //TODO: Top, bottom, shoes, gloves, shield etc.

    ArmourType armourType;
    int defenceModifier;

    public Armour(ArmourType armourType){
        this.armourType = armourType;
        this.name = this.armourType.getName();
        this.defenceModifier = this.armourType.getDefenceModifier();
        this.weight = this.armourType.getWeight();
    }

    @Override
    void use() {
        //
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
