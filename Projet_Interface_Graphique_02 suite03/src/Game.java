import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Game {
    private Init_Board init_board;
    private Player player;
    private int taille;
    private String color_moveCard;

    private JLabel turnLabel;
    private JLabel moveLabel;
    private JLabel wallLabel;

    public Game() {
        int nb_player = 2;
        init_board = new Init_Board(nb_player);
        //player = new Player();

        player.initialisationDeck();
        player.initialisationHand();
        player.completeHand();

        taille = player.getHand().size();

        for (int i = 0; i < taille; i++) {
            System.out.println(player.getHand().get(i).getColor());
            color_moveCard = player.getHand().get(i).getColor();

            if (color_moveCard == "bleue") {

                try {
                    Image case_image = ImageIO.read(new File("res/images/moves/move_blue.png"));
                    moveLabel = new JLabel(new ImageIcon(case_image));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                init_board.getMovesPane().add(moveLabel);
            }

            else if (color_moveCard == "violette") {

                try {
                    Image case_image = ImageIO.read(new File("res/images/moves/move_purple.png"));
                    moveLabel = new JLabel(new ImageIcon(case_image));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                init_board.getMovesPane().add(moveLabel);
            }

            else if (color_moveCard == "jaune") {

                try {
                    Image case_image = ImageIO.read(new File("res/images/moves/move_yellow.png"));
                    moveLabel = new JLabel(new ImageIcon(case_image));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                init_board.getMovesPane().add(moveLabel);
            }

            else {

                try {
                    Image case_image = ImageIO.read(new File("res/images/moves/move_laser.png"));
                    moveLabel = new JLabel(new ImageIcon(case_image));
                } catch (IOException e) {
                    e.printStackTrace();
                }

                init_board.getMovesPane().add(moveLabel);
            }
        }

    }
}
