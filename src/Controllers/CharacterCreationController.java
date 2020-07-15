package Controllers;

import Models.User;
import Views.GameView;
import com.kowit.ApplicationDatabase;

public class CharacterCreationController extends ApplicationController {
    public static void post(String characterName) {
        // Build the user
        User user = new User.Builder(1).withName(characterName).build();

        // Add the user to the DB
        ApplicationDatabase.addUser(user);

        // Create the User object/player

        // return (render) the GameView Pass the user to the view
        redirectToGameView(user);
    }

    public static void redirectToGameView(User user) {
        GameView.View.render(user);
    }
}
