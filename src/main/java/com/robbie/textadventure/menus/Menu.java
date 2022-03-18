package com.robbie.textadventure.menus;

import java.util.Scanner;

public abstract class Menu {

    boolean validInput = false;
    boolean menuOpen = true;
    Scanner sc = new Scanner(System.in);

    abstract void execute();
}
