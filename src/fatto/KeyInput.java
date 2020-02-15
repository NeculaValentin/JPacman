package fatto;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private Handler handler;

    public KeyInput(Handler handler) {
        this.handler = handler;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();
        for (GameObject object : handler.object) {
            if (object.getId() == ID.Pacman) {
                if (key == KeyEvent.VK_W || key == KeyEvent.VK_UP) {
                    object.setVelY(-5);
                    object.setVelX(0);

                }
                if (key == KeyEvent.VK_S || key == KeyEvent.VK_DOWN) {
                    object.setVelY(+5);
                    object.setVelX(0);
                }
                if (key == KeyEvent.VK_D || key == KeyEvent.VK_RIGHT) {
                    object.setVelX(+5);
                    object.setVelY(0);
                }
                if (key == KeyEvent.VK_A || key == KeyEvent.VK_LEFT) {
                    object.setVelX(-5);
                    object.setVelY(0);
                }
            }
            if (key == KeyEvent.VK_ESCAPE) System.exit(0);
        }
    }
   /*@Override
    public void keyReleased(KeyEvent e) {
        int key = e.getKeyCode();
        for (GameObject object : handler.object) {
            if (object.getId() == ID.Pacman) {
                if (key == KeyEvent.VK_W) {
                    object.setVelY(0);
                    up = true;
                }
                if (key == KeyEvent.VK_S) {
                    object.setVelY(0);
                    down = true;
                }
                if (key == KeyEvent.VK_D) {
                    object.setVelX(0);
                    right = true;
                }
                if (key == KeyEvent.VK_A) {
                    object.setVelX(0);
                    left = true;
                }
            }
        }
    }*/
}
