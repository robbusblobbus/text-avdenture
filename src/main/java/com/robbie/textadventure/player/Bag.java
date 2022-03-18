package com.robbie.textadventure.player;

import com.robbie.textadventure.items.Item;

import java.util.ArrayList;

public class Bag {

    ArrayList<Item> items = new ArrayList<Item>();

    public void addToBag(Item item) {
        items.add(item);
    }

    public void listItems() {
        int i = 1;
        for (Item item : items) {
            System.out.printf("%d: %s %n", i, item.getName());
            i++;
        }
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
