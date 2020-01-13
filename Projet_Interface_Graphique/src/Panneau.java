import javax.swing.JPanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Panneau extends JPanel {
    public void paintComponent(Graphics g) {
        System.out.println("Je suis exécutée !");

        /*
        int x1 = this.getWidth()/4;
        int y1 = this.getHeight()/4;
        g.drawOval(x1, y1, this.getWidth()/2, this.getHeight()/2);
        */

        try {
            Image menu = ImageIO.read(new File("menu.jpeg"));
            //g.drawImage(turtle2, 0, 0, this);
            //pour avoir une image de fond qui prend l'intégralité du conteneur
            g.drawImage(menu, 0, 0, this.getWidth(), this.getHeight(), this);

        } catch (IOException e) {
            e.printStackTrace();
        }

        Font font = new Font("arial", Font.BOLD, 20);
        g.setFont(font);
        g.setColor(Color.CYAN);
        g.drawString("Bienvenuue dans ROBOT TURTLES !", this.getWidth()/4, 100);




    }
}
