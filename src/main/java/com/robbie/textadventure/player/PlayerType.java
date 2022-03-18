package com.robbie.textadventure.player;

import com.robbie.textadventure.items.ArmourType;
import com.robbie.textadventure.items.WeaponType;

public enum PlayerType {

    WARRIOR("Warrior", 100, 25, 10, 50, 150, WeaponType.SWORD, ArmourType.METAL_ARMOUR),
    MAGE("Mage", 120, 20, 5, 40, 100, WeaponType.MAGIC_STAFF, ArmourType.MAGE_ROBES),
    PRIEST("Priest", 150, 10, 20, 25, 110, WeaponType.BASIC_STAFF, ArmourType.PRIEST_ROBES),
    ASSASSIN("Assassin", 75, 30, 10, 75, 50, WeaponType.DAGGER, ArmourType.COTTON_CLOTHING),
    HUNTER("Hunter", 100, 20, 15, 60, 100, WeaponType.WOODEN_BOW, ArmourType.CLOAK),
    BARD("Bard", 130, 15, 15, 50, 100, WeaponType.LUTE, ArmourType.FINE_CLOTHING);

    private final String typeName;
    private final int maxHealth;
    private final int baseAttack;
    private final int baseDefence;
    private final int baseSpeed;
    private final int maxCarryWeight;
    private final WeaponType startingWeapon;
    private final ArmourType startingArmour;

    PlayerType(String typeName, int maxHealth, int baseAttack, int baseDefence, int baseSpeed, int maxCarryWeight, WeaponType startingWeapon, ArmourType startingArmour) {
        this.typeName = typeName;
        this.maxHealth = maxHealth;
        this.baseAttack = baseAttack;
        this.baseDefence = baseDefence;
        this.baseSpeed = baseSpeed;
        this.maxCarryWeight = maxCarryWeight;
        this.startingWeapon = startingWeapon;
        this.startingArmour = startingArmour;
    }

    public String getTypeName() {
        return typeName;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public int getBaseAttack() {
        return baseAttack;
    }

    public int getBaseDefence() {
        return baseDefence;
    }

    public int getMaxCarryWeight() {
        return maxCarryWeight;
    }

    public WeaponType getStartingWeapon() {
        return startingWeapon;
    }

    public ArmourType getStartingArmour() {
        return startingArmour;
    }

    public int getBaseSpeed() {
        return baseSpeed;
    }
}

