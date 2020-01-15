import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.swing.border.Border;


public class Menu implements ActionListener {

    ///* DÉCLARATION DES DIFFÉRENTS OBJETS *///
    private Window menuWindow;

    private JPanel menuPanel;
    private JPanel imagePanel;
    private JPanel buttonsPanel;

    private BufferedImage logoImage;
    private JLabel logoLabel;

    private JButton button2;
    private JButton button3;
    private JButton button4;


    public Menu() {

        ///* CRÉATION DE LA FENÊTRE *///
        menuWindow = new Window ();
        menuWindow.setTitle("Robot Turtles MENU");
        menuWindow.setSize(400, 400);

        ///* INSTANCIATION DES OBJETS *///
        menuPanel = new JPanel();

        imagePanel = new JPanel();
        buttonsPanel = new JPanel();

        button2 = new JButton("2 PLAYERS");
        button3 = new JButton("3 PLAYERS");
        button4 = new JButton("4 PLAYERS");

        ///* QUEL TYPE DE LAYOUT CHAQUE LABEL PREND *///
        menuWindow.setContentPane(menuPanel); // définit menuPanel comme étant le contentPane de la fenêtre
        menuWindow.setLayout(new BorderLayout());
        menuPanel.setLayout(new BorderLayout());
        imagePanel.setLayout(new BorderLayout());
        buttonsPanel.setLayout(new GridLayout(3,1));


        ///* AJOUT PANELS *///
        imagePanel.setPreferredSize(new Dimension(400,150));
        //imagePanel.setBackground(Color.LIGHT_GRAY);

        try {
            logoImage = ImageIO.read(new File("logo.png"));
            logoLabel = new JLabel(new ImageIcon(logoImage));

        } catch (IOException e) {
            e.printStackTrace();
        }

        imagePanel.add(logoLabel);
        menuPanel.add(imagePanel,BorderLayout.NORTH);


        ///* AJOUT BOUTONS *///
        buttonsPanel.setBackground(Color.GREEN);

        button2.setContentAreaFilled(false);
        buttonsPanel.add(button2);
        buttonsPanel.add(button3);

        buttonsPanel.add(button4);
        menuPanel.add(buttonsPanel);


        //menuPanel.setLayout(null);
        //menuPanel.repaint();

        button2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Initialisation_Board Initialisation_boardGame = new Initialisation_Board();
            }

        });

        button3.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Initialisation_Board Initialisation_boardGame = new Initialisation_Board();
            }

        });

        button4.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Initialisation_Board Initialisation_boardGame = new Initialisation_Board();
            }

        });

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
