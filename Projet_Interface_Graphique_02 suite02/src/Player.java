import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Player {

    //private Tortue tortue;
    private ArrayList<Card> deck = new ArrayList<Card> (37);
    private ArrayList<Card> hand = new ArrayList<Card> (5);
    private ArrayList<Card> currentAlgorithm = new ArrayList<> (); //algorithme caché
    private ArrayList<Card> blocsList = new ArrayList<> ();
    //private ArrayList<Card> cimetiere = new ArrayList<> ();
/*
    public Player (Tortue tortue, ArrayList<Card> hand, ArrayList<Card> deck, ArrayList<Card> blocsList, ArrayList<Card> currentAlgorithm) {
        this.deck = deck;
        this.hand = hand;
        //this.tortue = tortue;
        this.blocsList = blocsList;
        this.currentAlgorithm = currentAlgorithm;
    }


 */

    /*
    public Tortue getTortue () {
        return this.tortue;
    }
     */

    public ArrayList<Card> getDeck () {
        return this.deck;
    }

    public ArrayList<Card> getCurrentAlgorithm () {
        return this.currentAlgorithm;
    }

    public ArrayList<Card> getHand () {
        return this.hand;
    }

    public ArrayList<Card> getBlocsList(){ return this.blocsList;}

    /*
    public void setTortue (Tortue tortue) {
        this.tortue = tortue;
    }

     */

    public void setHand (ArrayList<Card> hand) {
        this.hand = hand;
    }

    public void setCurrentAlgorithm (ArrayList<Card> currentAlgorithm) {
        this.currentAlgorithm = currentAlgorithm;
    }

    public void setDeck (ArrayList<Card> deck) {
        this.deck = deck;
    }

    public void setBlocsList(ArrayList<Card> blocsList){this.blocsList = blocsList;}

    public void initialisationDeck () {
        this.deck = new ArrayList<Card> ();
        //initialisation du deck avec les 37 Cards
        for (int i = 0; i < 18; i++) {
            Card CardBleue = new Card ("bleue", "moveForward");
            this.deck.add (CardBleue);
        }
        for (int i = 0; i < 8; i++) {
            Card CardViolette = new Card ("violette", "sensHoraire");
            this.deck.add (CardViolette);
        }
        for (int i = 0; i < 8; i++) {
            Card CardJaune = new Card ("jaune", "sensAntiHoraire");
            this.deck.add (CardJaune);
        }
        for (int i = 0; i < 3; i++) {
            Card CardLaser = new Card ("laser", "destroy");
            this.deck.add (CardLaser);
        }
        //Fonction pour mélanger le deck
        Collections.shuffle (this.deck);
    }

    public void initialisationHand () {
        this.hand = new ArrayList<Card> ();
        for (int i = 0; i < 5; i++) {
            this.hand.add (i, this.deck.get (i));
            this.deck.remove (i);
        }
    }

    public void initialisationBlockList(){
        this.blocsList = new ArrayList<Card> ();
        for( int i=0; i<3;i++){
            Card CardBlocPierre = new Card("blocPierre","blocPierre");
            this.blocsList.add(CardBlocPierre);
        }
        for( int i=0; i<2;i++){
            Card CardBlocGlace = new Card("blocGlace","blocGlace");
            this.blocsList.add(CardBlocGlace);
        }
    }

    public void completeHand () { // complete la main du Player à la fin de son tour avec le nombre de Cards qu'il lui manque
        int i = 0;
        while (this.hand.size () < 5) {
            this.hand.add (i, this.deck.get (i));
            this.deck.remove (i);
            i += 1;
        }
    }

    /*
    public ArrayList<Card> setDefausseCard () {

        // refaire cet algorithme avec une boucle for et faire indice - 1 pour la saisie

        for (int i = 0; i < this.getHand ().size (); i++) {
            System.out.println (this.hand.get (i).getColor ());
        }

        // rajouter que les Cards defausser vont au cimetiere

        Scanner clavier = new Scanner (System.in);
        System.out.println ("De combien de Cards voulez-vous vous défausser ?");
        int nbrCardDef = clavier.nextInt ();
        switch (nbrCardDef) {
            case 0:
                System.out.println ("Vous ne voulez donc pas vous défausser de Cards.");
                break;
            case 1:
                System.out.println ("De quelle Card voulez-vous vous défausser ? Choisissez 1 pour la premiere Card par exemple");
                int CardDefausse = clavier.nextInt ();
                this.hand.remove (CardDefausse - 1);
                break;
            case 2:
                System.out.println ("De quelles Cards voulez-vous vous défausser ? Choisissez 0 pour la premiere Card par exemple");
                int CardDefausse1 = clavier.nextInt ();
                this.hand.remove (CardDefausse1);
                this.hand.add (CardDefausse1, null); //on ajoute un élément qui remplace la Card détruite
                int CardDefausse2 = clavier.nextInt ();
                this.hand.remove (CardDefausse2);
                this.hand.add (CardDefausse2, null);
                this.hand.remove (null); //on retire l'élément inexistant, cela permet de garder la même longueure de liste
                this.hand.remove (null);
                break;
            case 3:
                System.out.println ("De quelles Cards voulez-vous vous défausser ? Choisissez 0 pour la premiere Card par exemple");
                int CardDefausse3 = clavier.nextInt ();
                this.hand.remove (CardDefausse3);
                this.hand.add (CardDefausse3, null);
                int CardDefausse4 = clavier.nextInt ();
                this.hand.remove (CardDefausse4);
                this.hand.add (CardDefausse4, null);
                int CardDefausse5 = clavier.nextInt ();
                this.hand.remove (CardDefausse5);
                this.hand.add (CardDefausse5, null);
                this.hand.remove (null);
                this.hand.remove (null);
                this.hand.remove (null);
                break;
            case 4:
                System.out.println ("De quelles Cards voulez-vous vous défausser ? Choisissez 0 pour la premiere Card par exemple");
                int CardDefausse6 = clavier.nextInt ();
                this.hand.remove (CardDefausse6);
                this.hand.add (CardDefausse6, null);
                int CardDefausse7 = clavier.nextInt ();
                this.hand.remove (CardDefausse7);
                this.hand.add (CardDefausse7, null);
                int CardDefausse8 = clavier.nextInt ();
                this.hand.remove (CardDefausse8);
                this.hand.add (CardDefausse8, null);
                int CardDefausse9 = clavier.nextInt ();
                this.hand.remove (CardDefausse9);
                this.hand.add (CardDefausse9, null);
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
        System.out.println ("Voici votre nouvelle main");
        for (int i = 0; i < 5; i++) {
            System.out.println (this.hand.get (i).getColor ());
        }
        return this.hand;
    }

     */

    /*
    public ArrayList<Card> completeAlgorithm () {

        this.currentAlgorithm = new ArrayList<> ();
        //le Player choisi une Card à rajouter à l'algorithme
        System.out.println ("Combien de Card veux tu rajouter à ton algorithme? Les choisir dans l'ordre par numérotation");
        Scanner clavier = new Scanner (System.in);
        int nbrAlgo = clavier.nextInt (); // le nombre de Card choisis à mettre dans l'algorithme

        switch (nbrAlgo) {
            case 0:
                System.out.println ("Tu as choisi de ne pas compléter ton algorithme");
                break;
            case 1:
                System.out.println ("Quel est l'indiceCard de la Card choisie en partant de 0 ?");
                int indiceCard = clavier.nextInt (); // indice de l Card à choisir de défausser -1
                this.currentAlgorithm.add (this.hand.get (indiceCard));
                this.hand.remove (indiceCard);
                break;

            case 2:
                System.out.println ("Choisis l'indiceCard des Cards choisis en partant de 0 puis cliques sur entrée");
                for (int i = 0; i < 2; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des Cards restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 2; compteur++) {
                    this.hand.remove (null);
                }
                break;

            case 3:
                System.out.println ("Choisis l'indiceCard des Cards choisis en partant de 0 puis cliques sur entrée");
                for (int i = 0; i < 3; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des Cards restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 3; compteur++) {
                    this.hand.remove (null);
                }
                break;
            case 4:
                System.out.println ("Choisis l'indiceCard des Cards choisis en partant de 0 puis cliques sur entrée");
                for (int i = 0; i < 4; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des Cards restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 4; compteur++) {
                    this.hand.remove (null);
                }
                break;
            case 5:
                System.out.println ("Choisis l'indiceCard des Cards choisis en partant de 0 puis cliques sur entrée");
                for (int i = 0; i < 5; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des Cards restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 5; compteur++) {
                    this.hand.remove (null);
                }
                break;
        }
        return this.hand;
    }

     */

    /*
    public void poseBloc(){
        System.out.println ("Quel type de bloc voulez vous poser ? Repondre pierre ou glace");
        Scanner sc = new Scanner (System.in);
        String choixBloc = sc.nextLine ();
        System.out.println ("Où voulez-vous placer votre bloc? Indiquer X puis entrée puis Y puis entrée");
        int coordX = sc.nextInt ();
        int coordY = sc.nextInt ();
        if (choixBloc.equals ("pierre")) {
            Case cases = new Case (coordX,coordY,true,"pierre");
        }
        else if(choixBloc.equals ("glace")){
            Case cases = new Case(coordX,coordY,true,"glace");
        }
    }

     */

    public void clearAlgorithm(){
        this.currentAlgorithm.clear ();
    }

}