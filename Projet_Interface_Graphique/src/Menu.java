import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;


public class Menu implements ActionListener {

    ///* DÉCLARATION DES DIFFÉRENTS OBJETS *///
    private Fenetre menuFenetre;
    private JButton startButton;
    private Bouton openButton;
    private JPanel startPanel;
    private JPanel openPanel;
    private Panneau menuPanel;
    private JLabel label1;
    private JLabel label2;

    public Menu () {

        ///* CRÉATION DE LA FENÊTRE *///
        menuFenetre = new Fenetre();
        menuFenetre.setTitle("menuu robot turtles");

        ///* INSTANCIATION DES OBJETS *///
        startButton = new JButton("START");
        openButton = new Bouton();
        menuPanel = new Panneau();
        startPanel = new JPanel();
        openPanel = new JPanel();
        label1 = new JLabel("Jouons !");
        label2 = new JLabel("OUI !");

        ///* IMPORTATION DE L'IMAGE DE FOND *///
        menuFenetre.setContentPane(menuPanel); //On prévient notre JFrame que notre JPanel sera son content pane
        menuFenetre.setLayout(new BorderLayout());
        menuPanel.setLayout(new BorderLayout());

        //menuPanel.setLayout(null);

        ///* AJOUT DE LABEL *///
        //menuPanel.add(label1, BorderLayout.CENTER); //ça fonctionne mais je peux pas repositionner
        //menuFenetre.getContentPane().add(label2); //même chose qu'au dessus, mais juste que j'ai pas besoin d'indiquer que c'est le menuPanel, il sait directement que je veux ajouter au panel de la fenêtre
        Dimension size = label2.getPreferredSize();
        label2.setBounds(300,500, size.width, size.height);



        ///* AJOUT D'UN BOUTON *///  trouver un moyen de changer la taille du panel comme on veut
        menuPanel.add(startPanel);
        //Dimension boutonSize = boutonPanel.getPreferredSize();
        startPanel.setPreferredSize(new Dimension(300,100)); //ça prend en largeur la largeur de la fenêtre
        startPanel.setBackground(Color.CYAN);
        startPanel.add(startButton);
        startButton.setPreferredSize(new Dimension(600,100));
        menuPanel.add(startPanel,BorderLayout.SOUTH);

        //// Ajout d'un bouton EXIT qui ouvre une autre fenêtre ////

        openButton.setText("OPEN");
        openPanel.setPreferredSize(new Dimension(300,50));
        openPanel.setBackground(Color.RED);
        openPanel.add(openButton);
        openButton.setPreferredSize(new Dimension(400,40));
        menuPanel.add(openPanel, BorderLayout.NORTH);

        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Fenetre secondeFenetre = new Fenetre();
                secondeFenetre.setTitle("OH YEAH");
                secondeFenetre.setVisible(true);
            }
        });


        //Dimension boutonSize = boutonPanel.getPreferredSize();

        //menuPanel.add(boutonStart, BorderLayout.SOUTH);
        //this.getContentPane().add(boutonStart, BorderLayout.SOUTH);

        menuPanel.repaint();


        menuFenetre.setVisible(true); //rend la fenetre visible
/*
        /*
        boutonStart.setMaximumSize(new Dimension(100,500));
        boutonStart.setMinimumSize(new Dimension(300,200));
        */

    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        if (arg0.getSource() == openButton)
            menuPanel.add(label1, BorderLayout.CENTER);
            menuPanel.repaint();
    }
}
