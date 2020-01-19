import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Player {
    private Tortue tortue;
    private ArrayList<Card> deck;
    private ArrayList<Card> cimetiere;
    private ArrayList<Card> hand;
    private ArrayList<Card> currentAlgorithm; //algorithme caché
    private ArrayList<String> blocsList;
    private int coordX;
    private int coordY;

    private JLabel blueLabel;
    private JLabel purpleLabel;
    private JLabel yellowLabel;
    private JLabel laserLabel;


    private Init_Board init_board;

    public Player (int coordX, int coordY, Tortue tortue, ArrayList<Card> deck, ArrayList<Card> cimetiere, ArrayList<Card> hand, ArrayList<Card> currentAlgorithm, ArrayList<Card> blocsList) {
        this.coordX = coordX;
        this.coordY = coordY;
        this.tortue = tortue;
        this.deck = deck;
        //this.cimetiere = new ArrayList<> ();
        this.hand = new ArrayList<> ();
        this.currentAlgorithm = new ArrayList<> ();
        this.blocsList = new ArrayList<> ();



    }

    public int getCoordX () {
        return coordX;
    }

    public void setCoordX (int coordX) {
        this.coordX = coordX;
    }

    public int getCoordY () {
        return coordY;
    }

    public void setCoordY (int coordY) {
        this.coordY = coordY;
    }

    public Tortue getTortue () {
        return tortue;
    }

    public void setTortue (Tortue tortue) {
        this.tortue = tortue;
    }

    public ArrayList<Card> getDeck () {
        return deck;
    }

    public void setDeck (ArrayList<Card> deck) {
        this.deck = deck;
    }

    public ArrayList<Card> getCimetiere () {
        return cimetiere;
    }

    public void setCimetiere (ArrayList<Card> cimetiere) {
        //this.cimetiere = cimetiere;
    }

    public ArrayList<Card> getHand () {
        return hand;
    }

    public void setHand (ArrayList<Card> hand) {
        this.hand = hand;
    }

    public ArrayList<Card> getCurrentAlgorithm () {
        return currentAlgorithm;
    }

    public void setCurrentAlgorithm (ArrayList<Card> currentAlgorithm) {
        this.currentAlgorithm = currentAlgorithm;
    }

    public ArrayList<String> getBlocsList () {
        return blocsList;
    }

    public void setBlocsList (ArrayList<String> blocsList) {
        this.blocsList = blocsList;
    }

    public void initialisationDeck () {
        this.deck = new ArrayList<> ();
        //initialisation du deck avec les 37 cartes
        /*if(deck.size ()==0){
            for(int i=0; i<cimetiere.size ();i++){
                deck.add (cimetiere.get (i));
            }
        }*/
        for (int i = 0; i < 18; i++) {
            try {
                Image case_image = ImageIO.read(new File("res/images/moves/move_blue.png"));
                blueLabel = new JLabel(new ImageIcon(case_image));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Card carteBleue = new Card ("bleue", "moveForward", blueLabel);
            this.deck.add (carteBleue);
        }

        for (int i = 0; i < 8; i++) {
            try {
                Image case_image = ImageIO.read(new File("res/images/moves/move_purple.png"));
                purpleLabel = new JLabel(new ImageIcon(case_image));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Card carteViolette = new Card ("violette", "sensHoraire", purpleLabel);
            this.deck.add (carteViolette);
        }

        for (int i = 0; i < 8; i++) {
            try {
                Image case_image = ImageIO.read(new File("res/images/moves/move_yellow.png"));
                yellowLabel = new JLabel(new ImageIcon(case_image));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Card carteJaune = new Card ("jaune", "sensAntiHoraire", yellowLabel);
            this.deck.add (carteJaune);
        }

        for (int i = 0; i < 3; i++) {
            try {
                Image case_image = ImageIO.read(new File("res/images/moves/move_laser.png"));
                laserLabel = new JLabel(new ImageIcon(case_image));
            } catch (IOException e) {
                e.printStackTrace();
            }
            Card carteLaser = new Card ("laser", "destroy", laserLabel);
            this.deck.add (carteLaser);
        }
        //Fonction pour mélanger le deck
        Collections.shuffle (this.deck);
    }

    public void initialisationHand () {
        for (int i = 0; i < 5; i++) {
            this.hand.add (i, this.deck.get (i));
            this.deck.remove (i);
        }
    }

    public void initialisationBlockList () {
        for (int i = 0; i < 3; i++) {
            String blocPierre;
            this.blocsList.add ("blocPierre");
        }
        for (int i = 0; i < 2; i++) {
            String  blocGlace;
            this.blocsList.add ("blocGlace");
        }
    }

    public void completeHand () { // complete la main du joueur à la fin de son tour avec le nombre de cartes qu'il lui manque
        int i = 0;
        while (this.hand.size () < 5) {
            this.hand.add (i, this.deck.get (i));
            this.deck.remove (i);
            i += 1;
        }
    }

    public void shuffleCimetiere(){
        Collections.shuffle (this.cimetiere);
    }

    public ArrayList<Card> setDefausseCard () {

        // refaire cet algorithme avec une boucle for et faire indice - 1 pour la saisie

        System.out.println ("Voici votre main actuel\n");
        for (int i = 0; i < this.getHand ().size (); i++) {

        }
        System.out.println (" ");

        // rajouter que les cartes defausser vont au cimetiere

        Scanner clavier = new Scanner (System.in);
        System.out.println ("De combien de cartes voulez-vous vous défausser ?");
        int nbrCardDef = clavier.nextInt ();
        switch (nbrCardDef) {
            case 0:
                System.out.println ("Vous ne voulez donc pas vous défausser de cartes.\n");
                break;
            case 1:
                System.out.println ("De quelle carte voulez-vous vous défausser ? Choisissez 1 pour la premiere carte par exemple\n");
                int carteDefausse = clavier.nextInt ();
                //this.cimetiere.add(carteDefausse,null);
                this.hand.remove (carteDefausse - 1);
                break;
            case 2:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple\n");
                int carteDefausse1 = clavier.nextInt ();
                //this.cimetiere.add(carteDefausse1,null);
                this.hand.remove (carteDefausse1);
                this.hand.add (carteDefausse1, null); //on ajoute un élément qui remplace la carte détruite
                int carteDefausse2 = clavier.nextInt ();
                //this.cimetiere.add(carteDefausse2,null);
                this.hand.remove (carteDefausse2);
                this.hand.add (carteDefausse2, null);
                this.hand.remove (null); //on retire l'élément inexistant, cela permet de garder la même longueure de liste
                this.hand.remove (null);
                break;
            case 3:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple\n");
                int carteDefausse3 = clavier.nextInt ();
                ////this.cimetiere.add(carteDefausse3,null);
                this.hand.remove (carteDefausse3);
                this.hand.add (carteDefausse3, null);
                int carteDefausse4 = clavier.nextInt ();
                this.hand.remove (carteDefausse4);
                this.hand.add (carteDefausse4, null);
                int carteDefausse5 = clavier.nextInt ();
                this.hand.remove (carteDefausse5);
                this.hand.add (carteDefausse5, null);
                this.hand.remove (null);
                this.hand.remove (null);
                this.hand.remove (null);
                //this.cimetiere.add(carteDefausse4,null);
                //this.cimetiere.add(carteDefausse5,null);
                break;
            case 4:
                System.out.println ("De quelles cartes voulez-vous vous défausser ? Choisissez 0 pour la premiere carte par exemple\n");
                int carteDefausse6 = clavier.nextInt ();
                this.hand.remove (carteDefausse6);
                this.hand.add (carteDefausse6, null);
                int carteDefausse7 = clavier.nextInt ();
                this.hand.remove (carteDefausse7);
                this.hand.add (carteDefausse7, null);
                int carteDefausse8 = clavier.nextInt ();
                this.hand.remove (carteDefausse8);
                this.hand.add (carteDefausse8, null);
                int carteDefausse9 = clavier.nextInt ();
                this.hand.remove (carteDefausse9);
                this.hand.add (carteDefausse9, null);
                this.hand.remove (null);
                this.hand.remove (null);
                this.hand.remove (null);
                this.hand.remove (null);
                //this.cimetiere.add(carteDefausse6,null);
                //this.cimetiere.add(carteDefausse7,null);
                //this.cimetiere.add(carteDefausse8,null);
                //this.cimetiere.add(carteDefausse9,null);
                break;
            case 5:
                for(int i= 0; i< hand.size ();i++){
                    //this.cimetiere.add(hand.get (i));
                }
                this.hand.clear ();
                break;
        }
        completeHand ();
        System.out.println ("Voici votre nouvelle main\n");
        for (int i = 0; i < 5; i++) {
            System.out.println (this.hand.get (i).getColor ());
        }
        return this.hand;
    }

    public ArrayList<Card> completeAlgorithm () {


        //le joueur choisi une carte à rajouter à l'algorithme
        System.out.println ("Combien de carte veux tu rajouter à ton algorithme? Les choisir dans l'ordre par numérotation\n");
        Scanner clavier = new Scanner (System.in);
        int nbrAlgo = clavier.nextInt (); // le nombre de carte choisis à mettre dans l'algorithme

        switch (nbrAlgo) {
            case 0:
                System.out.println ("Tu as choisi de ne pas compléter ton algorithme\n");
                break;
            case 1:
                System.out.println ("Quel est l'indiceCard de la carte choisie en partant de 0 ?\n");
                int indiceCard = clavier.nextInt (); // indice de l carte à choisir de défausser -1
                this.currentAlgorithm.add (this.hand.get (indiceCard));
                this.hand.remove (indiceCard);
                break;

            case 2:
                System.out.println ("Choisis l'indiceCard des cartes choisis en partant de 0 puis cliques sur entrée\n");
                for (int i = 0; i < 2; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des cartes restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 2; compteur++) {
                    this.hand.remove (null);
                }
                break;

            case 3:
                System.out.println ("Choisis l'indiceCard des cartes choisis en partant de 0 puis cliques sur entrée\n");
                for (int i = 0; i < 3; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des cartes restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 3; compteur++) {
                    this.hand.remove (null);
                }
                break;
            case 4:
                System.out.println ("Choisis l'indiceCard des cartes choisis en partant de 0 puis cliques sur entrée\n");
                for (int i = 0; i < 4; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des cartes restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 4; compteur++) {
                    this.hand.remove (null);
                }
                break;
            case 5:
                System.out.println ("Choisis l'indiceCard des cartes choisis en partant de 0 puis cliques sur entrée\n");
                for (int i = 0; i < 5; i++) {
                    int indCard = clavier.nextInt ();
                    this.currentAlgorithm.add (this.hand.get (indCard));
                    this.hand.remove (indCard);
                    this.hand.add (indCard, null);//on rajoute un élément null pour que les indices des cartes restent les memes (ils sertont de toutes facons supprimés à la fin)
                }
                for (int compteur = 0; compteur < 5; compteur++) {
                    this.hand.remove (null);
                }
                break;
        }
        return this.hand;
    }

    public void clearAlgorithm () {
        System.out.println (this.currentAlgorithm);
        if (this.currentAlgorithm != null) {
            this.currentAlgorithm.clear ();
        }
    }

    public void initialisationCards () { // permet d'initialiser tout du joueur d'un coup
        initialisationDeck ();
        initialisationHand ();
        initialisationBlockList ();
    }
}

