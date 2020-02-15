package vero;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Pacman  {
    private static final int DIAMETER = 30;
    int x = 0;
    int y = 0;
    int xa = 1;
    int ya = 1;
    JPacman game;

    public Pacman(JPacman game) {
        this.game= game;
    }

    public void paint(Graphics2D g) {
        g.fillOval(x, y, DIAMETER, DIAMETER);
    }
    public Rectangle getBounds() {
        return new Rectangle(x, y, DIAMETER, DIAMETER);
    }
/*
    void keyPressed() {//controls for pacman
        switch(key) {
            case CODED:
                switch(keyCode) {
                    case UP:
                        pacman.turnTo = new PVector(0, -1);
                        pacman.turn = true;
                        break;
                    case DOWN:
                        pacman.turnTo = new PVector(0, 1);
                        pacman.turn = true;
                        break;
                    case LEFT:
                        pacman.turnTo = new PVector(-1, 0);
                        pacman.turn = true;
                        break;
                    case RIGHT:
                        pacman.turnTo = new PVector(1, 0);
                        pacman.turn = true;
                        break;
                }
        }
    }*/



    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT)
            xa = -1;
        if (e.getKeyCode() == KeyEvent.VK_RIGHT)
            xa = 1;
        if (e.getKeyCode() == KeyEvent.VK_UP)
            ya = -1;
        if (e.getKeyCode() == KeyEvent.VK_DOWN)
            ya = 1;
    }
}
