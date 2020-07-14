package Views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartMenuForm implements ActionListener {
    private static JFrame frame;
    private static JPanel panel;
    private static JLabel title;
    private static JLabel textLabel;
    private static JButton startButton;
    private static JButton exitButton;
    private static JPanel headerPanel;

    private static final int X_PADDING = 100;

    public StartMenuForm() {
        frame = new JFrame();
        panel = new JPanel();

        frame.setTitle("Simple Game - Start Menu");
        frame.setBounds(20, 90, 480, 480);
        frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        title = new JLabel("Start Menu");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setForeground(Color.black);
        title.setSize(420, 30);
        // title.setLocation(30, 30);
        // panel.add(title);

        textLabel = new JLabel("Start game (y/n)? ");
        textLabel.setFont(new Font("Arial", Font.PLAIN, 15));
        textLabel.setForeground(Color.black);
        textLabel.setSize(650, 20);
        textLabel.setLocation(X_PADDING, 100);
        panel.add(textLabel);

        startButton = new JButton("Start Game");
        startButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        startButton.setBounds(X_PADDING, 140, 100, 30);
        startButton.setBackground(Color.white);
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                // CharacterCreationWindow characterCreationWindow = new CharacterCreationWindow();
                CharacterCreationWindow.render();
            }
        });
        panel.add(startButton);

        exitButton = new JButton("Exit Game");
        exitButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        exitButton.setBounds(X_PADDING, 190, 100, 30);
        exitButton.setBackground(Color.white);
        exitButton.addActionListener(e -> {
            System.exit(0);
        });
        panel.add(exitButton);

        // Add panel to frame
        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
