package com.robbie.textadventure;

//TODO Add player status (normal/dead/poisoned/etc. etc.)

public class Player {

    //Anything added here must be added to battle menu

    String name;
    int maxHealth = 100;
    int health = 100;
    int baseAttack = 25;
    int baseDefence = 5;
    Bag bag = new Bag();
    int level = 1;
    int experiencePoints = 0;
    int maxCarryWeight = 100;

    //TODO: Starting weapon/armour either fists or depends on character
    Weapon equippedWeapon;
    Armour equippedArmour;

    public Player(String name, WeaponType weaponType, ArmourType armourType) {
        this.name = name;
        this.equippedWeapon = new Weapon(weaponType);
        this.equippedArmour = new Armour(armourType);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public void setBaseAttack(int baseAttack) {
        this.baseAttack = baseAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public Item getEquippedWeapon() {
        return equippedWeapon;
    }

    public void setEquippedWeapon(Weapon equippedWeapon) {
        this.equippedWeapon = equippedWeapon;
    }

    public Armour getEquippedArmour() {
        return equippedArmour;
    }

    public void setEquippedArmour(Armour equippedArmour) {
        this.equippedArmour = equippedArmour;
    }

    public int getBaseDefence() {
        return baseDefence;
    }

    public void setBaseDefence(int baseDefence) {
        this.baseDefence = baseDefence;
    }

    public Bag getBag() {
        return bag;
    }
}
