public class Joueur {

    private int nbrJoueur;

    public int getNbrJoueur() {
        return nbrJoueur;
    }

    private int nbrJoyaux;

    public int getNbrJoyaux(){
        if (nbrJoueur == 2){
            return 1;
        }
        else if(nbrJoueur == 3){
            return 3;
        }
        else if(nbrJoueur == 4){
            return 2;
        }
        return 0;
    }

    enum tortues{
        tortueBleu, tortueRouge, tortueVerte, tortueRose
    }

    private int[] positionTortue;
    public void initialisationTortue (){
        Plateau.initialisation ();
        positionTortue[0] = 0; // on prend comme position initiale 1 en ligne pour désigner la premiere ligne
        positionTortue[1] = 7; // de meme pour la colonne, la 7e position veut dire la 8e colonne
    }

}
