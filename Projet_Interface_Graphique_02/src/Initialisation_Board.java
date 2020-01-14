import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Initialisation_Board {

    private Board boardPanel;
    
    public Initialisation_Board() {
        ///* INITIALISATION DE LA FENÊTRE BOARD *///
        Window boardWindow = new Window();
        boardWindow.setTitle("Robot Turtles - THE GAME");
        boardWindow.setSize(800,800);
        boardWindow.setVisible(true);

        boardPanel = new Board();
        boardWindow.setContentPane(boardPanel); // définit boardPanel comme étant le contentPane de la fenêtre
        boardPanel.setLayout(new BorderLayout());

        //boardPanel.setBackground(Color.orange); TEST


    }
}
