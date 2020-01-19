import javax.swing.*;

public class Tortue {
    private String tortueCouleur;
    private char orientationTortue;
    private JLabel image;

    public Tortue (String tortueCouleur, char orientationTortue, JLabel image) {
        this.tortueCouleur = tortueCouleur;
        this.orientationTortue = orientationTortue;
        this.image = image;
    }

    public String getTortueCouleur () {
        return tortueCouleur;
    }

    public void setTortueCouleur (String tortueCouleur) {
        this.tortueCouleur = tortueCouleur;
    }

    public char getOrientationTortue () {
        return orientationTortue;
    }

    public void setOrientationTortue (char orientationTortue) {
        this.orientationTortue = orientationTortue;
    }

    public JLabel getImage() {
        return image;
    }

    public void setImage(JLabel image) {
        this.image = image;
    }
}
