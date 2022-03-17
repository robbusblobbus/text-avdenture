package com.robbie.textadventure;

//TODO Add player status (normal/dead/poisoned/etc. etc.)

public class Player {

    //Anything added here must be added to battle menu

    String name;
    PlayerType playerType;
    int maxHealth;
    int health;
    int baseAttack;
    int baseDefence;
    Bag bag = new Bag();
    int level = 1;
    int experiencePoints = 0;
    int maxCarryWeight;

    //TODO: Starting weapon/armour either fists or depends on character
    //TODO: Add mana/some sort of magic store
    Weapon equippedWeapon;
    Armour equippedArmour;

    public Player(String name, PlayerType playerType) {
        this.name = name;
        this.playerType = playerType;
        this.maxHealth = this.playerType.getMaxHealth();
        this.health = maxHealth;
        this.baseAttack = this.playerType.getBaseAttack();
        this.baseDefence = this.playerType.getBaseDefence();
        this.maxCarryWeight = this.playerType.getMaxCarryWeight();
        this.equippedWeapon = new Weapon(this.playerType.getStartingWeapon());
        this.equippedArmour = new Armour(this.playerType.getStartingArmour());
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
