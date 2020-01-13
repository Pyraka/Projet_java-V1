import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;
import java.awt.*;

public class Fenetre extends JFrame {

    public Fenetre() {
        this.setTitle("Fenêtre type");
        this.setSize(600, 700);
        this.setResizable(true); //true : permet de repositionner la fenêtre; sinon : false

        this.setLocationRelativeTo(null); //l'objet fenêtre centrée
        this.setAlwaysOnTop(true); //fenetre toujours au premier plan, sinon : false
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //termine le programme quand on ferme la fenêtre
    }

}
