import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Initialisation_Board {

    private Board boardPanel;
    private JPanel contentPane;
    private JPanel contentPaneLeft;
    private JPanel contentPaneRight;
    private JPanel turnPane;
    private JPanel cardsPane;
    private JPanel movesPane;
    private JPanel wallsPane;

    private Case caseJ;
    private Case caseV;

    private JLabel turnLabel;
    private JLabel movesLabel;
    private JLabel wallsLabel;


    private JButton buttonCase;
    //private JButton buttonTest2 = new JButton();


    private List<List<JButton>> boardList = new ArrayList<>();


    public Initialisation_Board(int nbPlayer) {

        ///* INITIALISATION DE LA FENÊTRE BOARD *///
        Window boardWindow = new Window();
        boardWindow.setResizable(false);
        boardWindow.setTitle("Robot Turtles - THE GAME");
        boardWindow.setSize(1300, 730);
        boardWindow.setVisible(true);

        /// Initialisation des Panels
        boardPanel = new Board();
        contentPane = new JPanel();
        contentPaneLeft = new JPanel();
        contentPaneRight = new JPanel();
        turnPane = new JPanel();
        cardsPane = new JPanel();
        movesPane = new JPanel();
        wallsPane = new JPanel();

        turnLabel = new JLabel("WRITE HERE WHICH PLAYER IS PLAYING");
        movesLabel = new JLabel("Here will be shown the hand of the player which is playing");
        wallsLabel = new JLabel("Here will be shown the walls left of the player playing");

        boardWindow.setContentPane(contentPane);

        /// Initialisation des Layout *///
        contentPane.setLayout(new BorderLayout());
        contentPaneRight.setLayout(new BorderLayout());
        turnPane.setLayout(new BorderLayout());
        cardsPane.setLayout(new GridLayout(2,1));
        movesPane.setLayout(new GridLayout(1,5));
        wallsPane.setLayout(new GridLayout(1,2));
        

        /// Set des couleurs */// osef des couleurs, ici c'est pour se repérer
        contentPane.setBackground(Color.PINK);
        contentPaneRight.setBackground(Color.YELLOW);
        turnPane.setBackground(Color.GREEN);
        cardsPane.setBackground(Color.black);
        movesPane.setBackground(Color.GRAY);
        wallsPane.setBackground(Color.red);
        boardPanel.setLayout(new GridLayout(8, 8));


        /// Set des dimensions
        //contentPaneLeft.setPreferredSize(new Dimension(530,530)); pas besoin de préciser la taille, il me met automatiquement à la taille de la hauteur
        contentPaneRight.setPreferredSize(new Dimension(600,730));
        turnPane.setPreferredSize(new Dimension(600,200));
        cardsPane.setPreferredSize(new Dimension(600,200));
        boardPanel.setPreferredSize(new Dimension(690, 700));


        ///* CE QU'IL VA FALLOIR FAIRE *///
        turnPane.add(turnLabel, BorderLayout.EAST);
        movesPane.add(movesLabel, BorderLayout.EAST);
        wallsPane.add(wallsLabel);


        /// Ajout des Panels
        cardsPane.add(movesPane);
        cardsPane.add(wallsPane);
        contentPaneRight.add(cardsPane, BorderLayout.CENTER);
        contentPaneRight.add(turnPane, BorderLayout.NORTH);
        contentPaneLeft.add(boardPanel);
        contentPane.add(contentPaneLeft, BorderLayout.WEST);
        contentPane.add(contentPaneRight, BorderLayout.EAST);

        turnPane.repaint();







        /*
        /// essayer de créer le plateau avec une liste de listes de boutons ///
        for (int ligne = 0; ligne < 8; ligne++) {
            for (int colonne = 0; colonne < 8; colonne++) {
                List<JButton> lignes = new ArrayList<>();
                buttonCase = new JButton();
                buttonCase.setPreferredSize(new Dimension(50, 50));
                buttonCase.setText("°-°");
                buttonCase.setContentAreaFilled(false);
                lignes.add(buttonCase);
            }
        }

         */







        /*
        caseJ = new Case();
        caseJ.setBackground(Color.YELLOW);

        caseV = new Case();
        caseV.setBackground(Color.GREEN);


        ///// POURQUOI ÇA ADD PAS MES CASEJ ET CASEV DANS LE GRIDLAYOUT DU BOARDPANEL ????????????????????????????????
        ///// ÇA FONCTIONNE AVEC LES BOUTONS (voir plus bas) MAIS PAS AVEC LES PANEL AAAAHHHH POURQUOI ???????????????????????????????
        for (int i=0; i<8; i++) {
            for (int j=0; j<8; j++) {
                if((j%2==0 && i%2==0) || (j%2!=0 && i%2!=0)){
                    caseJ = new Case();
                    caseJ.setPreferredSize(new Dimension(50,50));
                    System.out.println("J A U N E");
                    System.out.println("j = " + j + " i = " + i);
                    System.out.println(" ");
                    boardPanel.add(caseJ);
                    // faire l'ajout de button dans la list
                }

                else {
                    caseV = new Case();
                    caseV.setPreferredSize(new Dimension(50,50));
                    System.out.println("V E R T");
                    System.out.println("j = " + j + " i = " + i);
                    System.out.println(" ");
                    boardPanel.add(caseV);
                }
            }
        }

         */


        ///* CRÉATION DES CASES *///
        //Case caseBoard = new Case();

        /// ajout des boutons dans les cases ///




        /*
        JPanel[][] panelHolder = new JPanel[rows][cols];
        panelHolder[rows][cols].setPreferredSize(new Dimension(40, 50));

         */

        //boardPanel.add(this.buttonCase);
        //boardPanel.add(this.buttonTest2);


        if (nbPlayer == 2) {
            System.out.println("2 PLAYERS");
            twoPlayersInit();
        }

        else if (nbPlayer == 3) {
            System.out.println("3 PLAYERS");
        }

        else if (nbPlayer == 4) {
            System.out.println("4 PLAYERS");
        }

    }

    public void twoPlayersInit() {
        for (int ligne = 0; ligne < 8; ligne++) {
            for (int colonne = 0; colonne < 8; colonne++) {

                if (ligne == 0 && colonne == 1) {
                    //remplacer ça par une classe
                    buttonCase = new JButton();
                    try {
                        Image turtle01_image = ImageIO.read(new File("res/images/turtles/turtle01red_south.png"));
                        buttonCase.setIcon(new ImageIcon(turtle01_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    buttonCase.setPreferredSize(new Dimension(50, 50));
                    buttonCase.setContentAreaFilled(false);
                    boardPanel.add(buttonCase);
                }

                else if (ligne == 0 && colonne == 5) {
                    //remplacer ça par une classe
                    buttonCase = new JButton();
                    try {
                        Image turtle01_image = ImageIO.read(new File("res/images/turtles/turtle02blue_south.png"));
                        buttonCase.setIcon(new ImageIcon(turtle01_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    buttonCase.setPreferredSize(new Dimension(50, 50));
                    //buttonCase.setText("°-°");
                    buttonCase.setContentAreaFilled(false);
                    boardPanel.add(buttonCase);
                }

                else if (ligne == 7 && colonne == 3) {
                    buttonCase = new JButton();
                    buttonCase.setPreferredSize(new Dimension(50, 50));
                    //buttonCase.setText("°-°");
                    buttonCase.setFocusPainted(true);
                    buttonCase.setContentAreaFilled(false);
                    buttonCase.setMargin(new Insets(0,0,0,0));

                    try {
                        Image turtle01_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                        buttonCase.setIcon(new ImageIcon(turtle01_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    boardPanel.add(buttonCase);
                }

                else if (colonne == 7) {
                    //remplacer ça par une classe
                    buttonCase = new JButton();
                    try {
                        Image turtle01_image = ImageIO.read(new File("res/images/walls/stone.png"));
                        buttonCase.setIcon(new ImageIcon(turtle01_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    buttonCase.setPreferredSize(new Dimension(50, 50));
                    //buttonCase.setText("°-°");
                    buttonCase.setContentAreaFilled(false);
                    boardPanel.add(buttonCase);
                }

                else {
                    buttonCase = new JButton();

                    buttonCase.setPreferredSize(new Dimension(50, 50));
                    buttonCase.setText("°-°");
                    buttonCase.setContentAreaFilled(false);
                    boardPanel.add(buttonCase);
                }
            }
        }
    }

    /*
    public JButton addTurtle1() {
        JButton buttonTurtle1 = new JButton();
        try {
            Image turtle01_image = ImageIO.read(new File("test01.png"));
            buttonTurtle1.setIcon(new ImageIcon(turtle01_image));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return buttonTurtle1;
    }

     */


}





