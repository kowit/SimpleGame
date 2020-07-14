package com.kowit;

import Controllers.ApplicationController;
import Game.Game;

public class Main {

    public static void main(String[] args) {
        // Game -> StartMenu -> StartMenuForm
        // Initialize the game

        Game.initialize(ApplicationController.initialize());
    }
}
