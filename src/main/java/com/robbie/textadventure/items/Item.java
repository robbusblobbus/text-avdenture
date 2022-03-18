package com.robbie.textadventure.items;

public abstract class Item {

    int weight;
    String name;

    public abstract void use();

    public abstract void displayDetails();

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
