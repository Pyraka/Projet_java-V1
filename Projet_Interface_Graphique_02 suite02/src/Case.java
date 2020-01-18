import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;

public class Case extends JPanel {

    public Case() {
        this.setLayout((new GridLayout(1,0)));
        this.setBackground(Color.yellow);
        this.setOpaque(false);
        this.setBorder(new LineBorder(Color.black));
        //addMouseListener(new MyMouseListener());
    }


}
