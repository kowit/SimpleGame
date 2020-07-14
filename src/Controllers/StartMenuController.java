package Controllers;

import Views.StartMenu;
import com.kowit.ApplicationDatabase;

public class StartMenuController {

    private static ApplicationDatabase _db;

    public static void initialize(ApplicationDatabase db) {
        StartMenu.render();
    }
}
