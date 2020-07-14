package Game.keyboard;

import javax.swing.*;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Keyboard extends JPanel {
    public Keyboard() {
        KeyListener listener = new MyKeyListener();
        addKeyListener(listener);
        setFocusable(true);
    }
}
