public class Tortue {

    private String tortueCouleur;
    private int[] positionTortue;
    private char orientationTortue;
    private Cases uneCase;

    public Tortue (String tortueCouleur, Cases uneCase, char orientationTortue) {
        this.uneCase = uneCase;
        this.tortueCouleur = tortueCouleur;
        this.orientationTortue = orientationTortue;
    }

    public String getCouleur () {
        return this.tortueCouleur;
    }

    public Cases getUneCase () {
        return this.uneCase;
    }

    public String getTortueCouleur () {
        return this.tortueCouleur;
    }

    public int[] getPositionTortue () {
        return this.positionTortue;
    }

    public char getOrientationTortue () {
        return this.orientationTortue;
    }

    public void setOrientationTortue (String couleurTortue) {
        this.orientationTortue = 'S'; // l'orientation de la tortue est sud par défaut
    }

    public void avance(){
        switch (this.orientationTortue){
            case 'S':
                this.uneCase.setY (this.uneCase.getY ()+1);
        }
    }

}

