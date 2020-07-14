package Game;

import Controllers.StartMenuController;
import Views.StartMenu;
import com.kowit.ApplicationDatabase;

public class Game {

    private static ApplicationDatabase _db;

    public static void initialize(ApplicationDatabase db) {
        _db = db;
        StartMenuController.initialize(_db);
    }
}

