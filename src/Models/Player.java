package Models;

import javax.swing.*;
import java.awt.*;

public class Player {
    private JPanel panel;
    private JLabel label;

    public Player(User user) {
        panel = new JPanel();
        label = new JLabel(user.getName());
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 2));
        panel.setLocation(100, 100);
        panel.add(label);
    }

    public JPanel getPanel() {
        return this.panel;
    }

    // Move player
    public void move(String direction) {
    }
}
