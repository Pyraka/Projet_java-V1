import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.border.Border;
import java.awt.*;

public class MenuWindow {
    private JButton boutonStart = new JButton("START");
    private JButton boutonExit = new JButton("EXIT");
    private Panneau menuPan = new Panneau();

    public static void main(String[] args) {
        JFrame fenetre = new JFrame();
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //fenetre.setContentPane(new MyContentPane());
        fenetre.pack();
        fenetre.setLocationByPlatform(true);
        fenetre.setVisible(true);
    }

    public MenuWindow() {

    }
}
