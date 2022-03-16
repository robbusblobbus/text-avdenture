package com.robbie.textadventure;

public enum ArmourType {

    NUDE("Nude", 0, 0),
    COTTON_CLOTHING("Cotton clothing", 5, 10),
    METAL_ARMOUR("Metal Armour", 15, 40);

    private final String name;
    private final int defenceModifier;
    private final int weight;
    //TODO: other stuff like weapon type


    ArmourType(String name, int defenceModifier, int weight) {
        this.name = name;
        this.defenceModifier = defenceModifier;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getDefenceModifier() {
        return defenceModifier;
    }

    public int getWeight() {
        return weight;
    }
}
