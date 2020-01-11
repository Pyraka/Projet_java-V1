import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Joueur {

    private Tortue tortue;
    //private List<Carte> listeDeCartes;
    private ArrayList<Carte> deck = new ArrayList<Carte> (37);
    public ArrayList<Carte> hand = new ArrayList<Carte> (5);
    private ArrayList<Carte> currentAlgorithm = new ArrayList<> (); //algorithme caché

    public Joueur (Tortue tortue, ArrayList<Carte> hand, ArrayList<Carte> deck ){
        this.deck = deck;
        this.hand = hand;
        this.tortue = tortue;
    }


    public Tortue getTortue () {
        return tortue;
    }

    public ArrayList<Carte> getDeck(){
        return this.deck;
    }

    public void setDeck (ArrayList<Carte> deck) {
        this.deck = deck;
    }

    public void initialisationDeck(){
        this.deck = new ArrayList<Carte> ();
        //initialisation du deck avec les 37 cartes
        for (int i=0 ; i<18; i++) {
            Carte carteBleue = new Carte ("bleue", "moveForward");
            this.deck.add(carteBleue);
        }
        for (int i=0 ; i<8; i++) {
            Carte carteViolette = new Carte ("violette","sensHoraire" );
            this.deck.add(carteViolette);
        }
        for (int i=0 ; i<8; i++) {
            Carte carteJaune = new Carte("jaune","sensAntiHoraire");
            this.deck.add(carteJaune);
        }
        for (int i=0 ; i<3; i++) {
            Carte carteLaser = new Carte("laser","destroy");
            this.deck.add (carteLaser);
        }
        //Fonction pour mélanger le deck
        Collections.shuffle (this.deck);
    }
    public ArrayList<Carte> getHand (){
        return this.hand;
    }


    public void setHand(){
        this.hand = new ArrayList<Carte> ();
        for (int i = 0; i < 5 ;i++){
            this.hand.add(i, this.deck.get (i));
            this.deck.remove(i);
        }
    }

    public void completeHand(){
        int i=0;
        while (this.hand.size ()<5 ){
            this.hand.add(i, this.deck.get (i));
            this.deck.remove(i);
            i+=1;
        }
    }
    public ArrayList<Carte> setDefausseCarte() {
        System.out.println (this.hand);
        Scanner clavier = new Scanner (System.in);
        System.out.println ("De combien de cartes voulez-vous vous défausser ?");
        int nbrCarteDef = clavier.nextInt ();
        switch (nbrCarteDef) {
            case 0:
                System.out.println ("Vous ne voulez donc pas vous défausser de cartes.");
                break;
            case 1:
                System.out.println ("De quelle carte voulez-vous vous défausser ? Choisissez 1 pour la premiere carte par exemple");
                int carteDefausse = clavier.nextInt ();
                this.hand.remove(carteDefausse - 1);
                break;
            case 2:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple");
                int carteDefausse1 = clavier.nextInt ();
                this.hand.remove (carteDefausse1);
                this.hand.add (carteDefausse1,null); //on ajoute un élément qui remplace la carte détruite
                int carteDefausse2 = clavier.nextInt ();
                this.hand.remove (carteDefausse2);
                this.hand.add (carteDefausse2, null);
                this.hand.remove (null); //on retire l'élément inexistant, cela permet de garder la même longueure de liste
                this.hand.remove (null);
                break;
            case 3:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple");
                int carteDefausse3 = clavier.nextInt ();
                this.hand.remove (carteDefausse3);
                this.hand.add (carteDefausse3,null);
                int carteDefausse4 = clavier.nextInt ();
                this.hand.remove (carteDefausse4);
                this.hand.add (carteDefausse4, null);
                int carteDefausse5 = clavier.nextInt ();
                this.hand.remove (carteDefausse5);
                this.hand.add (carteDefausse5, null);
                this.hand.remove (null);
                this.hand.remove (null);
                this.hand.remove (null);
                break;
            case 4:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple");
                int carteDefausse6 = clavier.nextInt ();
                this.hand.remove (carteDefausse6);
                this.hand.add (carteDefausse6,null);
                int carteDefausse7 = clavier.nextInt ();
                this.hand.remove (carteDefausse7);
                this.hand.add (carteDefausse7, null);
                int carteDefausse8 = clavier.nextInt ();
                this.hand.remove (carteDefausse8);
                this.hand.add (carteDefausse8, null);
                int carteDefausse9 = clavier.nextInt ();
                this.hand.remove (carteDefausse9);
                this.hand.add (carteDefausse9,null);
                this.hand.remove (null);
                this.hand.remove (null);
                this.hand.remove (null);
                this.hand.remove (null);
                break;
            case 5:
                this.hand.clear ();
                break;
        }
        completeHand ();
        System.out.println ("Voici votre nouvelle main " + this.hand);
        return this.hand;
    }
}
