package com.robbie.textadventure;

import java.util.ArrayList;

public class Bag {

    int maxSize; // Maybe don't need this
    int maxWeight; // Maybe don't need this -- can be "carry weight" player variable
    ArrayList<Item> items = new ArrayList<Item>();

    public void addToBag(Item item) {
        items.add(item);
    }

    public void listItems() {
        // Not sure how to do this, need to iterate thru ArrayList<Item> items
    }
}
