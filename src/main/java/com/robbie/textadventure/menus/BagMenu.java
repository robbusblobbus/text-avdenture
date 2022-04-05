package com.robbie.textadventure.menus;

// TODO Differentiate equippable and non-equippable menu options

import com.robbie.textadventure.items.Item;
import com.robbie.textadventure.player.Bag;
import com.robbie.textadventure.player.Player;

import java.util.Scanner;

public class BagMenu extends Menu {

    Player player;
    Bag bag;
    int bagSize;

    public BagMenu(Player player) {
        this.player = player;
        this.bag = player.getBag();
        this.bagSize = bag.getItems().size();
    }

    @Override
    public void execute() {

        System.out.println("---------------------------------------------------------------------");
        boolean integerInput;

        while(menuOpen) {

            bag.listItems();
            System.out.println("0: Close Bag");
            validInput = false;

            while (!validInput) {

                String input = sc.nextLine();
                int x = 0;

                try {
                    x = Integer.parseInt(input);
                    integerInput = true;
                } catch (Exception e) {
                    integerInput = false;
                }

                if (integerInput == true && x <= bagSize && x >= 0) {
                    switch (x) {
                        case (0) -> {
                            validInput = true;
                            menuOpen = false;
                        }
                        default -> {
                            validInput = true;
                            Item item = bag.getItems().get(x-1);
                            BattleItemMenu battleItemMenu = new BattleItemMenu(item);
                            battleItemMenu.execute();
                        }
                        }
                } else System.out.printf("Please enter an integer between 0 and %d %n", bagSize);
            }
        }
    }
}
