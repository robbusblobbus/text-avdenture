package com.robbie.textadventure;

public enum WeaponType {

    FISTS("Fists", 5, 0),
    SWORD("Sword", 15, 10);

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
