package Views;

import Models.Player;
import Models.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameView {
    public static class View {
        enum KEYS { Up, Down, Left, Right };

        private static JFrame frame;
        private static JPanel panel;

        public static void render(User user) {
            frame = new JFrame();
            panel = new JPanel();

            frame.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {
                    KeyboardHandler.parseKeys(e);
                }

                @Override
                public void keyPressed(KeyEvent e) {
                    KeyboardHandler.parseKeys(e);
                }

                @Override
                public void keyReleased(KeyEvent e) {
                    KeyboardHandler.parseKeys(e);
                }
            });
            frame.setLayout(new BorderLayout());
            frame.setVisible(true);
            frame.setResizable(false);
            frame.setSize(400, 400);
            panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));

            Player player = new Player(user);
            panel.add(player.getPanel());
            frame.add(panel);
        }
    }

    public static class KeyboardHandler
    {
        public static void parseKeys(KeyEvent event) {
            String key = KeyEvent.getKeyText(event.getKeyCode());
            System.out.println(key);
        }
    }
}
