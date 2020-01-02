import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Carte {

    private static int cartePioche; //permet de définir combien de carte le joueur veut piocher


    public static int setCartePioche(){
        Scanner clavier = new Scanner(System.in);
        System.out.println ("Combien de carte voulez-vous piocher ?");
        cartePioche = clavier.nextInt ();
        switch (cartePioche){
            case 0:
                System.out.println ("vous avez choisi de ne pas piocher de cartes");
                return 0;
            case 1:
                System.out.println ("vous avez choisi de piocher " + cartePioche + " carte");
                return 1;
        }
        System.out.println ("vous avez choisi de piocher " + cartePioche + " cartes");
        return cartePioche;
    }

    enum carteCouleur{
        carteBleu, carteJaune, carteViolet, carteLaser
    }

    private static ArrayList<carteCouleur> deck;

    public static ArrayList<carteCouleur> getDeck(){
        return deck;
    }

    public static void setDeck(){
        //initialisation du deck avec les 37 cartes
        for (int i=0 ; i<18; i++) {
            deck.add(carteCouleur.carteBleu);
        }
        for (int i=0 ; i<8; i++) {
            deck.add (carteCouleur.carteViolet);
        }
        for (int i=0 ; i<8; i++) {
            deck.add (carteCouleur.carteJaune);
        }
        for (int i=0 ; i<3; i++) {
            deck.add (carteCouleur.carteLaser);
        }
        //Fonction pour mélanger le deck
        Collections.shuffle (deck);
    }


    private static ArrayList<carteCouleur> hand;

    public static ArrayList<carteCouleur> getHand (){
        System.out.println ("Voici vos cartes : " + hand);
        return hand;
    }

    public static void setHand(){
        for (int i = 0; i < cartePioche -1 ;i++){
            hand.add(i, deck.get (i));
            deck.remove(i);
        }
    }

    private void moveForward(){
        //tortue avance
    }

    private void moveLeft(){
        //tortue à gauche
    }

    private void moveRight(){
        //tortue à droite
    }

    private void laser(){
        //torte détruit bloc
    }

    private void shuffleCards(){
        //mélange les cartes
    }

}
