package com.robbie.textadventure;

public abstract class Item {

    int weight;
    String name;

    abstract void use();

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
