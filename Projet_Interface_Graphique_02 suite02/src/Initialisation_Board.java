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

    private Case[][] c;
    private JLabel turtleLabel;


    public Initialisation_Board(int nbPlayer) {

        ///* INITIALISATION DE LA FENÊTRE BOARD *///
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
        turnPane = new JPanel();
        cardsPane = new JPanel();
        movesPane = new JPanel();
        wallsPane = new JPanel();
        c = new Case[8][8];

        turnLabel = new JLabel("WRITE HERE WHICH PLAYER IS PLAYING");
        movesLabel = new JLabel("Here will be shown the hand of the player which is playing");
        wallsLabel = new JLabel("Here will be shown the walls left of the player playing");

        boardWindow.setContentPane(contentPane);

        /// Initialisation des Layout *///
        contentPane.setLayout(new BorderLayout());
        contentPaneLeft.setLayout(new BorderLayout());
        contentPaneRight.setLayout(new BorderLayout());
        boardPanel.setLayout(new GridLayout(8, 8));
        turnPane.setLayout(new BorderLayout());
        cardsPane.setLayout(new GridLayout(2,1));
        movesPane.setLayout(new GridLayout(1,5));
        wallsPane.setLayout(new GridLayout(1,2));
        

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
        contentPaneRight.setPreferredSize(new Dimension(600,730));
        turnPane.setPreferredSize(new Dimension(600,200));
        cardsPane.setPreferredSize(new Dimension(600,200));
        boardPanel.setPreferredSize(new Dimension(700, 700));


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



        if (nbPlayer == 2) {
            System.out.println("2 PLAYERS");
            twoPlayersInit();
        }

        else if (nbPlayer == 3) {
            System.out.println("3 PLAYERS");
            threePlayersInit();
        }

        else if (nbPlayer == 4) {
            System.out.println("4 PLAYERS");
            fourPlayersInit();
        }

    }

    public void twoPlayersInit() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                if (row == 0 && col == 1) {
                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle01red_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel, BorderLayout.CENTER);
                }


                else if (row == 0 && col == 5) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle02blue_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 7 && col == 3) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (col == 7) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/walls/stone.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }



                else {
                    boardPanel.add(c[row][col] = new Case());
                }
            }
        }

        //boardPanel.repaint();
        contentPane.add(boardPanel, BorderLayout.CENTER);
    }


    public void threePlayersInit() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                if (row == 0 && col == 0) { //tortue 1
                    //remplacer ça par une classe maybe
                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle01red_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel, BorderLayout.CENTER);
                }


                else if (row == 0 && col == 3) {
                    //remplacer ça par une classe maybe
                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle02blue_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 0 && col == 6) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle03purple_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 7 && col == 0) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 7 && col == 3) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 7 && col == 6) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (col == 7) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/walls/stone.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }



                else {
                    boardPanel.add(c[row][col] = new Case());
                }
            }
        }

        //boardPanel.repaint();
        contentPane.add(boardPanel, BorderLayout.CENTER);

    }



    public void fourPlayersInit() {
        for (int row = 0; row < 8; row++) {
            for (int col = 0; col < 8; col++) {

                if (row == 0 && col == 0) { //tortue 1
                    //remplacer ça par une classe maybe
                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle01red_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel, BorderLayout.CENTER);
                }


                else if (row == 0 && col == 2) {
                    //remplacer ça par une classe maybe
                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle02blue_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 0 && col == 5) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle03purple_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 0 && col == 7) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/turtles/turtle04yellow_south.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }


                else if (row == 7 && col == 1) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }

                else if (row == 7 && col == 6) {
                    //remplacer ça par une classe maybe

                    boardPanel.add(c[row][col] = new Case());

                    try {
                        Image case_image = ImageIO.read(new File("res/images/gems/gem01green.png"));
                        turtleLabel = new JLabel (new ImageIcon(case_image));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    c[row][col].add(turtleLabel);
                }


                else {
                    boardPanel.add(c[row][col] = new Case());
                }
            }
        }

        //boardPanel.repaint();
        contentPane.add(boardPanel, BorderLayout.CENTER);

    }

}





