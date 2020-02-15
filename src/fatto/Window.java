package fatto;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Window extends Canvas {
    public Window(int width, int height, String title,Game game) throws IOException {
        JFrame frame = new JFrame(title);
        frame.setContentPane(new JLabel(new ImageIcon(ImageIO.read(new File("PacmanLevel-1.png")))));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMaximumSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, height));
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.add(game);
        frame.setVisible(true);
        game.start();
    }
}
