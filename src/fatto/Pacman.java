package fatto;

import java.awt.*;
import java.util.Random;

public class Pacman extends GameObject {
Random r = new Random();
    public Pacman(int x, int y, ID id) {
        super(x, y, id);

    }

    @Override
    public void tick() {
        x += velX;
        y += velY;

        x=Game.clamp(x,0,Game.getWIDTH()-46);
        y=Game.clamp(y,0,Game.getHEIGHT()-69);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.yellow);
        g.fillOval(x, y, 32, 32);
    }
}
