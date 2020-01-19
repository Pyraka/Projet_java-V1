import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Board extends JPanel {


    public void paintComponent (Graphics g) {
        try {
            Image boardImage = ImageIO.read(new File("board.png"));
            //g.drawImage(turtle2, 0, 0, this);
            //pour avoir une image de fond qui prend l'intégralité du conteneur
            g.drawImage(boardImage, 0, 0, this.getWidth(), this.getHeight(), this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
