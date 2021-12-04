// importing Java AWT class
import java.awt.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

//import java.awt.event.WindowListener;
 class Susanta extends Frame implements KeyListener {
    Susanta() {
        addKeyListener(this);

        setSize(400, 400);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}

     public class AwtFirst {
        public static void main(String[] args) {
            new Susanta();
        }


    }
