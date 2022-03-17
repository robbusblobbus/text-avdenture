// TODO Custom player creation
// TODO Battle mechanics
// TODO Input checker
// TODO Levels?
// TODO Enemy strengths/weaknesses

package com.robbie.textadventure;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to the dungeon");
        Player player = Setup.playerSetup();

        System.out.printf("Welcome %s, noble %s %n", player.getName(), player.playerType.getTypeName());

        while(running) {
            System.out.println("---------------------------------------------------------------------");

            Battle battle = new Battle(player);
            battle.execute();
            running = false;
        }
    }
}
