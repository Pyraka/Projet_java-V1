import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Jeu {
    Scanner clavier = new Scanner (System.in);

    private int nbJoueur;
    private List<Joueur> listJoueurs = new ArrayList<Joueur> ();
    private Plateau plateau;
    private int end = 0;


    public Jeu () {
        System.out.println ("Combien de joueur ?");
        nbJoueur = clavier.nextInt ();
        start ();

    }


    public void start () {
        Plateau plateau = new Plateau (2);
        plateau.initPlateau (nbJoueur);
        createPlayer ();
        plateau.display ();

        do {
            for (int niemeJoueur = 0; niemeJoueur < this.nbJoueur; niemeJoueur++) {
                    System.out.println ("C'est à vous de jouer, Joueur" + (niemeJoueur + 1) + "\n"
                            + "(1) Si vous voulez compléter le programme\n"
                            + "(2) Si vous voulez construire un mûr\n"
                            + "(3) Si vous voulez exécuter le programme, taper 3\n");
                    int choix = clavier.nextInt ();

                    switch (choix) {
                        case 1:
                            System.out.println ("Voici vos cartes, Joueur" + (niemeJoueur + 1) + "\n");

                            for (int j = 0; j < 5; j++) { // compteur j permet d'indiquer toutes les cartes du joueur
                                System.out.println (this.listJoueurs.get (niemeJoueur).getHand ().get (j).getColor ());
                            }
                            System.out.println (" ");
                            this.listJoueurs.get (niemeJoueur).completeAlgorithm (); // complete l'algorithme  pour le joueuer qui est en train de joueur
                            this.listJoueurs.get (niemeJoueur).setCurrentAlgorithm (this.listJoueurs.get (niemeJoueur).getCurrentAlgorithm ());
                            break;
                        case 2:
                            plateau.poseBloc (listJoueurs.get (niemeJoueur));
                            break;
                        case 3:
                            for (int niemeCarte = 0; niemeCarte < this.listJoueurs.get (niemeJoueur).getCurrentAlgorithm ().size (); niemeCarte++) {
                                switch (this.listJoueurs.get (niemeJoueur).getCurrentAlgorithm ().get (niemeCarte).getColor ()) {
                                    case "bleue":
                                        plateau.deplacer (listJoueurs.get (niemeJoueur));
                                        break;
                                    case "jaune":
                                        plateau.tourneGauche (listJoueurs.get (niemeJoueur));
                                        break;
                                    case "violette":
                                        plateau.tourneDroite (listJoueurs.get(niemeJoueur));
                                        break;
                                    case "laser":
                                        break;
                                }
                            }
                            this.listJoueurs.get (niemeJoueur).clearAlgorithm ();
                            break;

                    }

                    plateau.display ();
                    this.listJoueurs.get (niemeJoueur).setDefausseCarte ();
                    this.listJoueurs.get (niemeJoueur).setHand (this.listJoueurs.get (niemeJoueur).getHand ()); // permet de mettre en mémoire la main du joueur
                    System.out.println (" ");

                }
        }
            while(plateau.listTortues.size ()>=1);

        System.out.println ("La partie est finie");
    }

    public void createPlayer () {
        switch (nbJoueur) {
            case 2:
                Joueur joueur1 = new Joueur (0, 1, new Tortue ("TV", 'S'), null, null, null, null, null);
                listJoueurs.add (joueur1);
                joueur1.initialisationCartes ();

                Joueur joueur2 = new Joueur (0, 5, new Tortue ("TJ", 'S'), null, null, null, null, null);
                listJoueurs.add (joueur2);
                joueur2.initialisationCartes ();
                break;
            case 3:
                Joueur J1 = new Joueur (0, 0, new Tortue ("TV", 'S'), null, null, null, null, null);
                listJoueurs.add (J1);
                J1.initialisationCartes ();


                Joueur J2 = new Joueur (0, 3, new Tortue ("TJ", 'S'), null, null, null, null, null);
                listJoueurs.add (J2);
                J2.initialisationCartes ();

                Joueur J3 = new Joueur (0, 6, new Tortue ("TB", 'S'), null, null, null, null, null);
                listJoueurs.add (J3);
                J3.initialisationCartes ();
                break;
            case 4:
                Joueur player1 = new Joueur (0, 0, new Tortue ("TV", 'S'), null, null, null, null, null);
                listJoueurs.add (player1);
                player1.initialisationCartes ();

                Joueur player2 = new Joueur (0, 3, new Tortue ("TJ", 'S'), null, null, null, null, null);
                listJoueurs.add (player2);
                player2.initialisationCartes ();

                Joueur player3 = new Joueur (0, 6, new Tortue ("TB", 'S'), null, null, null, null, null);
                listJoueurs.add (player3);
                player3.initialisationCartes ();

                Joueur player4 = new Joueur (0, 6, new Tortue ("TR", 'S'), null, null, null, null, null);
                listJoueurs.add (player4);
                player4.initialisationCartes ();


        }
    }




    /*public void isFinPartie(Joueur joueur){
        switch (joueur.getTortue ().getOrientationTortue ()){
            case 'S':
                if(plateau.getCase (joueur.getCoordY (), joueur.getCoordY ()+1,joueur).equals ("joyau")){
                    listJoueurs.remove (joueur);
                    break;
            }

        }
    }*/



}