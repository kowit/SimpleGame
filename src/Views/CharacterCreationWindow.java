package Views;

import Controllers.CharacterCreationController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterCreationWindow {
    private static JFrame frame;
    private static JLabel characterNameLabel;
    private static JTextField characterNameTextField;
    private static JButton submitCharacterButton;

    /**
     * NOTE:
     * Create frame -> panel -> add components to panel -> add panel to frame.
     */
    public static void render() {
        frame = new JFrame("Chacter Creation");
        frame.setSize(300, 300);
        frame.setLocation(90, 90);
        frame.setResizable(false);
        frame.setVisible(true);

        characterNameLabel = new JLabel("Character Name: ");
        characterNameTextField = new JTextField(16);
        submitCharacterButton = new JButton("Create");
        submitCharacterButton.setBackground(Color.white);
        submitCharacterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.setVisible(false);
                // Get the character's name from the form
                // Send it to the controller
                String characterTextValue = characterNameTextField.getText();
                if (!characterTextValue.equals("")) {
                    CharacterCreationController.post(characterTextValue);
                }
            }
        });

        // Create a panel for the components
        JPanel panel = new JPanel();
        panel.add(characterNameLabel);
        panel.add(characterNameTextField);
        panel.add(submitCharacterButton);

        // Add the panel
        frame.add(panel);
    }
}
