package Game.keyboard;

import javax.swing.*;
import java.awt.event.KeyListener;

@SuppressWarnings("serial")
public class Keyboard extends JPanel {
    private KeyListener keyListener;

    public Keyboard() {
        keyListener = new MyKeyListener();
        // addKeyListener(keyListener);
        // setFocusable(true);
    }

    public KeyListener getKeyListener() {
        return this.keyListener;
    }
}
