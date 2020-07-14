package Views;

import Models.Player;
import Models.User;

import javax.swing.*;

public class GameView {

    public static class View {
        private static JFrame frame;
        private static JPanel panel;

        public static void render(User user) {
            frame = new JFrame();
            panel = new JPanel();

            frame.setVisible(true);
            frame.setResizable(false);
            frame.setSize(400, 400);

            Player player = new Player(user);
            panel.add(player.getPanel());

            frame.add(panel);
        }
    }
}
