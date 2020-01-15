import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Initialisation_Board {

    private Board boardPanel;
    private Case caseBoard;
    private JButton buttonTest1;
    //private JButton buttonTest2 = new JButton();

    public Initialisation_Board() {
        ///* INITIALISATION DE LA FENÊTRE BOARD *///
        Window boardWindow = new Window();
        boardWindow.setTitle("Robot Turtles - THE GAME");
        boardWindow.setSize(800,800);
        boardWindow.setVisible(true);

        boardPanel = new Board();
        boardWindow.setContentPane(boardPanel); // définit boardPanel comme étant le contentPane de la fenêtre

        boardPanel.setLayout(new GridLayout(8, 8));

        //boardPanel.setBackground(Color.orange); TEST


        //boardPanel.add(this.buttonTest1);
        //boardPanel.add(this.buttonTest2);


        ///* CRÉATION DES CASES *///
        //Case caseBoard = new Case();


        for (int ligne = 0; ligne < 8; ligne++) {
            for (int colonne = 0; colonne < 8; colonne++) {
                buttonTest1 = new JButton();
                buttonTest1.setPreferredSize(new Dimension(50,50));
                buttonTest1.setText("O");
                buttonTest1.setOpaque(false);
                buttonTest1.setContentAreaFilled(false);
                buttonTest1.setBorderPainted(false);
                boardPanel.add(buttonTest1);
                }
            }
        }

}





