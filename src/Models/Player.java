package Models;

import javax.swing.*;
import java.awt.*;

public class Player {
    private JPanel panel;
    private JLabel label;

    public Player(User user) {
        panel = new JPanel();
        label = new JLabel(user.getName());
        panel.setLocation(40, 40);
        panel.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        panel.setBackground(Color.white);
        panel.add(label);
    }

    public JPanel getPanel() {
        return this.panel;
    }
}
