import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
        /*Scanner clavier = new Scanner(System.in);

        ArrayList<Carte.carteCouleur> deck = new ArrayList<> (37); //initialise la liste deck à 0
        ArrayList<Carte.carteCouleur> hand = new ArrayList<> (37); //initialise la liste de la main à 0

        //initialisation du deck avec les 37 cartes
        for (int i=0 ; i<18; i++) {
            deck.add (Carte.carteCouleur.cartBleu);
        }
        for (int i=0 ; i<8; i++) {
            deck.add (Carte.carteCouleur.carteJaune);
        }
        for (int i=0 ; i<8; i++) {
            deck.add (Carte.carteCouleur.carteViolet);
        }
        for (int i=0 ; i<3; i++) {
            deck.add (Carte.carteCouleur.carteLaser);
        }

        //Fonction pour mélanger le deck
        Collections.shuffle (deck);
        System.out.println (deck);
        hand.add(0, deck.get (0));
        deck.remove(0);

         */

        //Carte.setCartePioche ();
        //Carte.getDeck ();
        System.out.println (Carte.getDeck ());
    }

}
