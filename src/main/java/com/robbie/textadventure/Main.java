// TODO Custom player creation
// TODO Battle mechanics
// TODO Levels?
// TODO Enemy strengths/weaknesses
// TODO Save game
// TODO Main menu

package com.robbie.textadventure;

import com.robbie.textadventure.events.Battle;
import com.robbie.textadventure.events.Setup;
import com.robbie.textadventure.player.Player;

public class Main {
    public static void main(String[] args) {
        boolean running = true;
        System.out.println("Welcome to the dungeon");
        Player player = Setup.playerSetup();

        System.out.printf("Welcome %s, noble %s %n", player.getName(), player.getPlayerType().getTypeName());

        while(running) {
            System.out.println("---------------------------------------------------------------------");

            Battle battle = new Battle(player);
            battle.execute();
            running = false;
        }
    }
}
