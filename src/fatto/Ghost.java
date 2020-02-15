package fatto;

import java.awt.*;
import java.util.Random;

public class Ghost extends GameObject {
    public Ghost(int x, int y, ID id) {
        super(x, y, id);
        velX = 5;
        velY = 5;
    }

    @Override
    public void tick() {
        x += velX;
        y += velY;
        if (y<=0||y>=Game.getHEIGHT()-46){
            velY*=-1;
        }
        if (x<=0||x>=Game.getWIDTH()-30){
            velX*=-1;
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(x, y, 16, 16);
    }
}