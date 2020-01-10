import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Carte {

    enum carteCouleur{
        carteBleue, carteJaune, carteViolet, carteLaser
    }

    private ArrayList<carteCouleur> deck = new ArrayList<carteCouleur> (37);
    public ArrayList<carteCouleur> hand = new ArrayList<carteCouleur> (5);

    public ArrayList<carteCouleur> getHand (){
        System.out.println ("Voici vos cartes : " + hand);
        return hand;
    }
    public ArrayList<carteCouleur> getDeck(){
        return deck;
    }

    public void setDeck(){
        //initialisation du deck avec les 37 cartes
        for (int i=0 ; i<18; i++) {
            deck.add(carteCouleur.carteBleue);
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

    public void setHand(){
        for (int i = 0; i < 5 ;i++){
            hand.add(i, deck.get (i));
            deck.remove(i);
        }
    }

    public void completeHand(){
        int i=0;
        while (hand.size ()<5 ){
            hand.add(i, deck.get (i));
            deck.remove(i);
            i+=1;
        }
    }

    public ArrayList<carteCouleur> setDefausseCarte() {
        System.out.println (hand);
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
                hand.remove(carteDefausse - 1);
                break;
            case 2:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple");
                int carteDefausse1 = clavier.nextInt ();
                hand.remove (carteDefausse1);
                hand.add (carteDefausse1,null); //on ajoute un élément qui remplace la carte détruite
                int carteDefausse2 = clavier.nextInt ();
                hand.remove (carteDefausse2);
                hand.add (carteDefausse2, null);
                hand.remove (null); //on retire l'élément inexistant, cela permet de garder la même longueure de liste
                hand.remove (null);
                break;
            case 3:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple");
                int carteDefausse3 = clavier.nextInt ();
                hand.remove (carteDefausse3);
                hand.add (carteDefausse3,null);
                int carteDefausse4 = clavier.nextInt ();
                hand.remove (carteDefausse4);
                hand.add (carteDefausse4, null);
                int carteDefausse5 = clavier.nextInt ();
                hand.remove (carteDefausse5);
                hand.add (carteDefausse5, null);
                hand.remove (null);
                hand.remove (null);
                hand.remove (null);
                break;
            case 4:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple");
                int carteDefausse6 = clavier.nextInt ();
                hand.remove (carteDefausse6);
                hand.add (carteDefausse6,null);
                int carteDefausse7 = clavier.nextInt ();
                hand.remove (carteDefausse7);
                hand.add (carteDefausse7, null);
                int carteDefausse8 = clavier.nextInt ();
                hand.remove (carteDefausse8);
                hand.add (carteDefausse8, null);
                int carteDefausse9 = clavier.nextInt ();
                hand.remove (carteDefausse9);
                hand.add (carteDefausse9,null);
                hand.remove (null);
                hand.remove (null);
                hand.remove (null);
                hand.remove (null);
                break;
            case 5:
                hand.clear ();
                break;
        }
        completeHand ();
        System.out.println ("Voici votre nouvelle main " + hand);
        return hand;
    }


    /*private void moveForward(Joueur joueur){
      if( joueur == 'N') {
          joueur.Tortue.();
          Tortue.getPositionTortue ()[0] += 1;
      }
    }

     */

    private void seeLeft(){
        //tortue à gauche
    }

    private void seeRight(){
        //tortue à droite
    }

    private void laser(){
        //torte détruit bloc
    }

    private void shuffleCards(){
        //mélange les cartes
    }

}


// selectionner les cartes à défausser et cbn de cartes 