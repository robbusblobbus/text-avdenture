package com.robbie.textadventure.items;

public enum ArmourType {

    NUDE("Nude", 0, 0),
    COTTON_CLOTHING("Cotton Clothing", 5, 4),
    METAL_ARMOUR("Metal Armour", 15, 25),
    MAGE_ROBES("Mage robes",8, 3),
    PRIEST_ROBES("Priest Robes", 10, 3),
    CLOAK("Cloak", 5, 3),
    FINE_CLOTHING("Fine Clothing", 3, 5);

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
