import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Init_Board {
    private Board boardPanel;
    private JPanel contentPane;
    private JPanel contentPaneLeft;
    private JPanel contentPaneRight;

    private JLabel turtleLabel01;
    private JLabel turtleLabel02;
    private JLabel turtleLabel03;
    private JLabel turtleLabel04;
    private JLabel gemLabel;
    private JLabel sideWallLabel;

    private JPanel turnPane;
    private JPanel cardsPane;
    private JPanel movesPane;
    private JPanel wallsPane;

    private JLabel turnLabel;
    private JLabel movesLabel;
    private JLabel wallsLabel;



    private Case[][] c;
    private JLabel turtleLabel;

    private Case[][] plateau;

    public List<Tortue> listTortues = new ArrayList<> (); // cette liste va permettre de definir la fin de la partie


    public Init_Board(int nbPlayer) {

        ///* INITIALISATION DE LA FENÊTRE *///
        Window boardWindow = new Window();
        boardWindow.setResizable(false);
        boardWindow.setTitle("Robot Turtles - THE GAME");
        boardWindow.setSize(1300, 700);
        boardWindow.setVisible(true);

        /// Initialisation des Panels
        boardPanel = new Board();
        contentPane = new JPanel();
        contentPaneLeft = new JPanel();
        contentPaneRight = new JPanel();


        this.turnPane = new JPanel();
        this.cardsPane = new JPanel();
        this.movesPane = new JPanel();
        this.wallsPane = new JPanel();

        turnLabel = new JLabel("WRITE HERE WHICH PLAYER IS PLAYING");
        movesLabel = new JLabel();
        wallsLabel = new JLabel("Here will be shown the walls left of the player playing");

        c = new Case[8][8];


        boardWindow.setContentPane(contentPane);

        /// Initialisation des Layout *///
        contentPane.setLayout(new BorderLayout());
        contentPaneLeft.setLayout(new BorderLayout());
        contentPaneRight.setLayout(new BorderLayout());
        boardPanel.setLayout(new GridLayout(8, 8));
        turnPane.setLayout(new BorderLayout());
        cardsPane.setLayout(new GridLayout(2, 1));
        movesPane.setLayout(new GridLayout(1, 5));
        wallsPane.setLayout(new GridLayout(1, 2));


        /// Set des couleurs */// osef des couleurs, ici c'est pour se repérer
        contentPane.setBackground(Color.PINK);
        contentPaneLeft.setBackground(Color.YELLOW);
        contentPaneRight.setBackground(Color.ORANGE);
        //boardPanel.setBackground(Color.DARK_GRAY);
        turnPane.setBackground(Color.BLUE);
        cardsPane.setBackground(Color.CYAN);
        movesPane.setBackground(Color.GRAY);
        wallsPane.setBackground(Color.red);




        /// Set des dimensions
        //contentPaneLeft.setPreferredSize(new Dimension(530,530)); pas besoin de préciser la taille, il me met automatiquement à la taille de la hauteur
        contentPaneRight.setPreferredSize(new Dimension(600, 730));
        boardPanel.setPreferredSize(new Dimension(700, 700));
        turnPane.setPreferredSize(new Dimension(600, 200));
        cardsPane.setPreferredSize(new Dimension(600, 200));



        /// Ajout des Panels

        contentPaneRight.add(cardsPane, BorderLayout.CENTER);
        contentPaneRight.add(turnPane, BorderLayout.NORTH);
        contentPaneLeft.add(boardPanel);
        contentPane.add(contentPaneLeft, BorderLayout.WEST);
        contentPane.add(contentPaneRight, BorderLayout.EAST);
        turnPane.add(turnLabel, BorderLayout.EAST);
        movesPane.add(movesLabel, BorderLayout.EAST);
        wallsPane.add(wallsLabel);
        cardsPane.add(movesPane);
        cardsPane.add(wallsPane);


        turnPane.repaint();

        /*
        if (nbPlayer == 2) {
            System.out.println("2 PLAYERS");
            twoPlayersInit();
        } else if (nbPlayer == 3) {
            System.out.println("3 PLAYERS");
            threePlayersInit();
        } else if (nbPlayer == 4) {
            System.out.println("4 PLAYERS");
            fourPlayersInit();
        }

         */


        this.plateau = new Case[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boardPanel.add(plateau[i][j] = new Case());
                plateau[i][j].setBackground(Color.CYAN);
                plateau[i][j].setBorder(new LineBorder(Color.black));
            }
        }
        initPlateau(2);

    }


    public void setCase(int x, int y) {
        try {
            Image case_image = ImageIO.read(new File("res/images/walls/stone.png"));
            turtleLabel = new JLabel(new ImageIcon(case_image));
        } catch (IOException e) {
            e.printStackTrace();
        }
        plateau[x][y].add(turtleLabel);
    }


    public void refreshBoard() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                boardPanel.add(plateau[i][j] = new Case());
            }
        }
    }



    public void initPlateau (int nbPlayer) {
        switch (nbPlayer) {
            case 2:
                for (int i = 0; i < 8; i++) {
                    try {
                        Image case_image = ImageIO.read(new File("res/images/walls/stone.png"));
                        sideWallLabel = new JLabel(new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    plateau[i][7].add(sideWallLabel);
                }

                try {
                    Image case_image = ImageIO.read(new File("res/images/turtles/turtle01red_south.png"));
                    turtleLabel01 = new JLabel(new ImageIcon(case_image));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //plateau[0][1].add(turtleLabel01);
                Player joueur1 = new Player (0, 1, new Tortue ("TV", 'N', turtleLabel01), null, null, null, null, null);
                setPlayerPlateau (joueur1);
                listTortues.add(joueur1.getTortue ());


                try {
                    Image case_image = ImageIO.read(new File("res/images/turtles/turtle04yellow_south.png"));
                    turtleLabel02 = new JLabel(new ImageIcon(case_image));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                //plateau[0][5].add(turtleLabel02);
                Player joueur2 = new Player (0, 5, new Tortue ("TJ", 'O', turtleLabel02), null, null, null, null, null);
                setPlayerPlateau (joueur2);
                listTortues.add (joueur2.getTortue ());


                try {
                    Image case_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                    gemLabel = new JLabel(new ImageIcon(case_image));
                } catch (IOException e) {
                    e.printStackTrace();
                }
                plateau[7][3].add(gemLabel);

                break;


            /*
            case 3:
                for (int i = 0; i < 8; i++) {
                    plateau[i][7] = "X";
                }

                Player J1 = new Player (0, 0, new Tortue ("TV", 'S'), null, null, null, null, null);
                setPlayerPlateau (J1);

                Player J2 = new Player (0, 3, new Tortue ("TJ", 'S'), null, null, null, null, null);
                setPlayerPlateau (J2);

                Player J3 = new Player (0, 6, new Tortue ("TB", 'S'), null, null, null, null, null);
                setPlayerPlateau (J3);

                plateau[7][0] = "joyau";
                plateau[7][3] = "joyau";
                plateau[7][6] = "joyau";
                break;
            case 4:
                Player player1 = new Player (0, 0, new Tortue ("TV", 'S'), null, null, null, null, null);
                setPlayerPlateau (player1);

                Player player2 = new Player (0, 2, new Tortue ("TJ", 'S'), null, null, null, null, null);
                setPlayerPlateau (player2);

                Player player3 = new Player (0, 5, new Tortue ("TB", 'S'), null, null, null, null, null);
                setPlayerPlateau (player3);

                Player player4 = new Player (0, 7, new Tortue ("TR", 'S'), null, null, null, null, null);
                setPlayerPlateau (player4);

                plateau[7][1] = "joyau";
                plateau[7][6] = "joyau";

                break;

             */

        }
    }





    public void setPlayerPlateau (Player joueur) {
        plateau[joueur.getCoordX ()][joueur.getCoordY ()].add(joueur.getTortue().getImage());
    }





    
    
    
    
    
    

    public Board getBoardPanel() {
        return boardPanel;
    }

    public void setBoardPanel(Board boardPanel) {
        this.boardPanel = boardPanel;
    }

    public JPanel getContentPane() {
        return contentPane;
    }

    public void setContentPane(JPanel contentPane) {
        this.contentPane = contentPane;
    }

    public JPanel getContentPaneLeft() {
        return contentPaneLeft;
    }

    public void setContentPaneLeft(JPanel contentPaneLeft) {
        this.contentPaneLeft = contentPaneLeft;
    }

    public JPanel getContentPaneRight() {
        return contentPaneRight;
    }

    public void setContentPaneRight(JPanel contentPaneRight) {
        this.contentPaneRight = contentPaneRight;
    }

    public JPanel getTurnPane() {
        return turnPane;
    }

    public void setTurnPane(JPanel turnPane) {
        this.turnPane = turnPane;
    }

    public JPanel getCardsPane() {
        return cardsPane;
    }

    public void setCardsPane(JPanel cardsPane) {
        this.cardsPane = cardsPane;
    }

    public JPanel getMovesPane() {
        return movesPane;
    }

    public void setMovesPane(JPanel movesPane) {
        this.movesPane = movesPane;
    }

    public JPanel getWallsPane() {
        return wallsPane;
    }

    public void setWallsPane(JPanel wallsPane) {
        this.wallsPane = wallsPane;
    }


    public JLabel getTurnLabel() {
        return turnLabel;
    }

    public void setTurnLabel(JLabel turnLabel) {
        this.turnLabel = turnLabel;
    }

    public JLabel getMovesLabel() {
        return movesLabel;
    }

    public void setMovesLabel(JLabel movesLabel) {
        this.movesLabel = movesLabel;
    }

    public JLabel getWallsLabel() {
        return wallsLabel;
    }

    public void setWallsLabel(JLabel wallsLabel) {
        this.wallsLabel = wallsLabel;
    }


    public Case[][] getC() {
        return c;
    }

    public void setC(Case[][] c) {
        this.c = c;
    }

    public JLabel getTurtleLabel() {
        return turtleLabel;
    }

    public void setTurtleLabel(JLabel turtleLabel) {
        this.turtleLabel = turtleLabel;
    }
}





