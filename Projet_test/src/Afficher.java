import javax.swing.ImageIcon;
import javax.swing.JFrame; //pour les fenêtres
import javax.swing.JLabel; //textes
import javax.swing.JPanel; //sert à stocker des objets

import  java.awt.*;

public class Afficher extends JFrame{
    JLabel jl = new JLabel();
    JPanel jp = new JPanel();

    public Afficher() {

        // AFFICHER UNE IMAGE // ça affiche pas l'image lol

        setTitle("Coucou Jérémy <3");
        setVisible(true);
        setSize(700,700);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jl.setIcon(new ImageIcon("haha.JPG"));

        add(jp);
        //validate(); //permet de ne pas recadrer la fenêtre à la main avec l'image


        // AFFICHER UN MESSAGE TEXTE //
        JPanel pan = new JPanel();
        FlowLayout bl = new FlowLayout(FlowLayout.CENTER);   //layoutManager, permet de définir la position de l'objet dans la fenêtre
        pan.setLayout(bl);
        JLabel  message = new JLabel("Bonjour le monde!!");  //créé un label
        pan.add(message);  //l'ajoute au panel

        setContentPane(pan);  //defini le panel de la JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        Afficher a = new Afficher();
    }
}


/*
https://codes-sources.commentcamarche.net/faq/360-swinguez-jframe-jpanel-jcomponent-layoutmanager-borderlayout
 */


// Un autre équivalent pour afficher une image
/*
public class Afficher_image {
    JLabel jl = new JLabel();
    JPanel jp = new JPanel();

    public Afficher_image() {
        //JFrame  window  = new JFrame("Hello World!!"); //crée une fenêtre qui a pour titre "Hello World!!"
        //window.setSize(new Dimension(200,200));
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //setDefaultCloseOperation permet de définir l'opération par défaut que l'on veut lorsqu'on ferme la fenêtre.
        //                                                          Le paramètre JFrame.EXIT_ON_CLOSE spécifie que l'on quitte le logiciel lorsqu'on ferme la JFrame.
        //window.setVisible(true);
    }
}

 */