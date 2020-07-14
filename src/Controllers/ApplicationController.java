package Controllers;

import com.kowit.ApplicationDatabase;

public class ApplicationController {
    // private static ApplicationDatabase _db;

    public ApplicationController() { }

    public static ApplicationDatabase initialize() {
        return new ApplicationDatabase();
    }
}
