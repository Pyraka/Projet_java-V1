import java.util.Scanner;

public class Main {

    private static int nbrJoueur;

    public static void main (String[] args) {
        /*Joueur[] joueurs = new Joueur[4];
        for (int i=0;i<4; i++){
            joueurs[i] = new Joueur();
            joueurs[i].getTortue ().getOrientationTortue ();
        }
        Joueur.setNbrJoueur ();
        Joueur.setNbrJoyaux ();
        Plateau.iniialisationPlateau ();

        Carte carte = new Carte();
        carte.setDeck();

        Carte.setDeck();
        Carte.setHand ();
        Carte.setDefausseCarte ();

         */
    }


    public int getNbrJoueur() {
        return nbrJoueur;
    }

    public void setNbrJoueur(){
        Scanner clavier = new Scanner(System.in);
        System.out.println ("Combien de joueur vont jouer ?");
        nbrJoueur = clavier.nextInt ();
    }
}
