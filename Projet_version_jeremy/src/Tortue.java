public class Tortue {

    private String tortueCouleur;
    private char orientationTortue;
    private Case uneCase;

    public Tortue (String tortueCouleur, Case uneCase, char orientationTortue) {
        this.uneCase = uneCase;
        this.tortueCouleur = tortueCouleur;
        this.orientationTortue = orientationTortue;
    }

    public String getCouleur () {
        return this.tortueCouleur;
    }

    public Case getUneCase () {
        return this.uneCase;
    }

    public String getTortueCouleur () {
        return this.tortueCouleur;
    }

    public char getOrientationTortue () {
        return this.orientationTortue;
    }

    public void initialisationOrientationTortue () {
        this.orientationTortue = 'S'; // l'orientation de la tortue est sud par défaut
    }

    public void avance () {
        switch (this.orientationTortue) {
            case 'S':
                this.uneCase.setY (this.uneCase.getY () + 1);
                break;
            case 'N':
                this.uneCase.setY (this.uneCase.getY () - 1);
                break;
            case 'E':
                this.uneCase.setX (this.uneCase.getX () + 1);
                break;
            case 'O':
                this.uneCase.setX (this.uneCase.getX () - 1);
                break;
        }
    }

    public void tourneGauche () {
        switch (this.orientationTortue) {
            case 'S':
                this.orientationTortue = 'E';
                break;
            case 'E':
                this.orientationTortue = 'N';
                break;
            case 'N':
                this.orientationTortue = 'O';
                break;
            case 'O':
                this.orientationTortue = 'S';
                break;
        }
    }

    public void tourneDroite () {
        switch (this.orientationTortue) {
            case 'S':
                this.orientationTortue = 'O';
                break;
            case 'O':
                this.orientationTortue = 'N';
                break;
            case 'N':
                this.orientationTortue = 'E';
                break;
            case 'E':
                this.orientationTortue = 'S';
                break;
        }
    }

}

