package com.robbie.textadventure;

public enum WeaponType {

    FISTS("Fists", 5, 0),
    SWORD("Sword", 15, 10),
    MAGIC_STAFF("Magic Staff", 10, 5),
    BASIC_STAFF("Basic Staff", 5, 5),
    DAGGER("Dagger", 8, 2),
    WOODEN_BOW("Wooden Bow", 10, 5),
    LUTE("Lute", 7, 8);

    private final String name;
    private final int damage;
    private final int weight;
    //TODO: other stuff like weapon type


    WeaponType(String name, int damage, int weight) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getWeight() {
        return weight;
    }
}
