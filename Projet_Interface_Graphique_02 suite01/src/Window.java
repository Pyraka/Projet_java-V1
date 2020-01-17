import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

    public Window() {
        this.setTitle("Fenêtre type");
        this.setSize(500, 500);
        this.setResizable(true); //true : permet d'étirer la fenêtre; sinon : false

        this.setLocationRelativeTo(null); //l'objet fenêtre centrée
        this.setAlwaysOnTop(true); //fenetre toujours au premier plan, sinon : false
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //termine le programme quand on ferme la fenêtre

        /*
        JPanel pan = new JPanel();
        //Définition de sa couleur de fond
        pan.setBackground(Color.ORANGE);
        this.setContentPane(pan);


         */
        this.setVisible(true);
    }
}

