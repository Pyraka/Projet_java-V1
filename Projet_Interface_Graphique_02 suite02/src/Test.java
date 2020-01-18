import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Test {
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


    private Case[][] c = new Case[8][8];
    private JLabel turtleLabel;


    public Test() throws IOException {
        Window boardWindow = new Window();
        boardWindow.setResizable(false);
        boardWindow.setTitle("Robot Turtles - THE GAME");
        boardWindow.setSize(600, 600);
        boardWindow.setVisible(true);

        contentPane = new JPanel();
        boardPanel = new Board();

        boardWindow.setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout());
        contentPane.setBackground(Color.PINK);

        boardPanel.setPreferredSize(new Dimension(300,500));
        boardPanel.setBackground(Color.GRAY);
        boardPanel.setLayout(new GridLayout(8, 8, 0, 0));

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

                    c[row][col].add(turtleLabel);
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
}
