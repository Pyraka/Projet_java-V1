public class Tortue {
    private String tortueCouleur;
    private char orientationTortue;

    public Tortue (String tortueCouleur, char orientationTortue) {
        this.tortueCouleur = tortueCouleur;
        this.orientationTortue = orientationTortue;
    }

    public String getTortueCouleur () {
        return tortueCouleur;
    }

    public char getOrientationTortue () {
        return orientationTortue;
    }

    public void setOrientationTortue (char orientationTortue) {
        this.orientationTortue = orientationTortue;
    }
}
