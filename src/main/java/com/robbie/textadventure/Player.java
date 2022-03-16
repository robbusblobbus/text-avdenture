package com.robbie.textadventure;

//TODO Add player status (normal/dead/poisoned/etc. etc.)

public class Player {

    //Anything added here must be added to battle menu

    String playerName;
    int playerMaxHitPoints = 100;
    int playerHitPoints = 100;
    int playerBaseAttack = 50;
    Bag bag = new Bag();
    int playerLevel = 1;
    int playerExperience = 0;

    //TODO: Starting weapon/armour either fists or depends on character
    Weapon equippedWeapon;
    Armour equippedArmour;

    public Player(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerHitPoints() {
        return playerHitPoints;
    }

    public void setPlayerHitPoints(int playerHitPoints) {
        this.playerHitPoints = playerHitPoints;
    }

    public int getPlayerBaseAttack() {
        return playerBaseAttack;
    }

    public void setPlayerBaseAttack(int playerBaseAttack) {
        this.playerBaseAttack = playerBaseAttack;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getPlayerMaxHitPoints() {
        return playerMaxHitPoints;
    }

    public void setPlayerMaxHitPoints(int playerMaxHitPoints) {
        this.playerMaxHitPoints = playerMaxHitPoints;
    }

    public int getPlayerLevel() {
        return playerLevel;
    }

    public void setPlayerLevel(int playerLevel) {
        this.playerLevel = playerLevel;
    }

    public int getPlayerExperience() {
        return playerExperience;
    }

    public void setPlayerExperience(int playerExperience) {
        this.playerExperience = playerExperience;
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
}
