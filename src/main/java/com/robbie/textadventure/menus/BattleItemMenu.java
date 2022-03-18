package com.robbie.textadventure.menus;

import com.robbie.textadventure.items.Item;
import com.robbie.textadventure.utils.InputAnalyser;

public class BattleItemMenu extends Menu {

    Item item;

    public BattleItemMenu(Item item) {
        this.item = item;
    }

    @Override
    void execute() {

        System.out.println("---------------------------------------------------------------------");

        while (menuOpen) {

            validInput = false;
            System.out.printf("What would you like to do with your %s? %n", item.getName().toLowerCase());
            System.out.println(" A) Use/Equip \n B) Inspect \n C) Nothing");

            while (!validInput) {

                String input = sc.nextLine();
                switch (input) {
                    case ("a"), ("A") -> {
                        validInput = true;
                        if (InputAnalyser.areYouSure("Would you like to use your " + item.getName() + "?")) {
                            item.use();
                            menuOpen = false;
                        }
                    }
                    case ("b"), ("B") -> {
                        validInput = true;
                        item.displayDetails();
                    }
                    case ("c"), ("C") -> {
                        validInput = true;
                        menuOpen = false;
                    }
                    default -> System.out.println("Please enter a valid input");
                }
                System.out.println("---------------------------------------------------------------------");
            }
        }
    }
}
