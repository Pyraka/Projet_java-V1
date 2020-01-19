import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Card {

    private String color;
    private String action;
    private JLabel image;

    public Card (String color, String action, JLabel image) {
        this.color = color;
        this.action = action;
        this.image = image;
    }

    public String getColor () {
        return color;
    }

    public String getAction () {
        return action;
    }

    public void setColor (String color) {
        this.color = color;
    }

    public void setAction (String action) {
        this.action = action;
    }

    public JLabel getImage() {
        return image;
    }

    public void setImage(JLabel image) {
        this.image = image;
    }
}