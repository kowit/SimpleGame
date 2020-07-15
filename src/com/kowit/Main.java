package com.kowit;

import Controllers.ApplicationController;
import Game.Game;

/**
 * This is the main entry point.
 * Main
 *  -> Game
 *  -> StartMenuController
 *  -> StartMenu View
 */
public class Main {

    public static void main(String[] args) {
        // Game -> StartMenu -> StartMenuForm
        // Initialize the game

        Game.initialize();
    }
}
