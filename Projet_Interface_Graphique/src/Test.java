import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Test extends JFrame implements ActionListener{
    private Panneau pan = new Panneau();
    private JButton bouton = new JButton("bouton 1");
    private JButton bouton2 = new JButton("bouton 2");
    private JPanel container = new JPanel();
    private JLabel label = new JLabel("Le JLabel");
    private int compteur = 0;

    public Test(){
        this.setTitle("Animation");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        container.setBackground(Color.white);
        container.setLayout(new BorderLayout());
        container.add(pan, BorderLayout.CENTER);

        bouton.addActionListener(this);
        bouton2.addActionListener(this);

        JPanel south = new JPanel();
        south.add(bouton);
        south.add(bouton2);
        container.add(south, BorderLayout.SOUTH);

        Font police = new Font("Tahoma", Font.BOLD, 16);
        label.setFont(police);
        label.setForeground(Color.blue);
        label.setHorizontalAlignment(JLabel.CENTER);
        container.add(label, BorderLayout.NORTH);
        this.setContentPane(container);
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent arg0) {
        if(arg0.getSource() == bouton)
            label.setText("Vous avez cliqué sur le bouton 1");

        if(arg0.getSource() == bouton2)
            label.setText("Vous avez cliqué sur le bouton 2");
    }

    //…
}