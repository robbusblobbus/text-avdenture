package com.robbie.textadventure.utils;

import java.util.Scanner;

public class InputAnalyser {

    static Scanner sc = new Scanner(System.in);

    public static boolean areYouSure(String text) {

        System.out.printf("%s (Y/N) %n", text);

        while (true) {
            String input = sc.nextLine();

            switch (input) {
                case ("y"), ("Y") -> {
                    return true;
                }
                case ("n"), ("N") -> {
                    return false;
                }
                default -> System.out.println("Please enter Y or N");
            }
        }
    }
}
