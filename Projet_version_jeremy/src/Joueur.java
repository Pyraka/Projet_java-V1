import java.util.Scanner;


public class Joueur {


    private Tortue tortue;

    public Joueur (String tortueCouleur, int[] positionTortue, char orientationTortue) {
        this.tortue = new Tortue(tortueCouleur, positionTortue, orientationTortue);
    }
    public Tortue getTortue () {
        return tortue;
    }



    public class Tortue{
        private String tortueCouleur;
        private  int[] positionTortue;
        private char orientationTortue;

        public Tortue (String tortueCouleur, int[] positionTortue, char orientationTortue){
            this.tortueCouleur = tortueCouleur;
            this.positionTortue = positionTortue;
            this.orientationTortue = orientationTortue;
        }

        public String getCouleur(){
            return tortueCouleur;
        }

        public String getTortueCouleur () {
            return tortueCouleur;
        }

        public int[] getPositionTortue () {
            return positionTortue;
        }

        public char getOrientationTortue () {
            return orientationTortue;
        }

        public void setOrientationTortue (String couleurTortue){
            orientationTortue = 'S'; // l'orientation de la tortue est sud par défaut
        }

    }
}
