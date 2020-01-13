import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private List<Joueur> listDeJoueurs;
    private int nbJoueur; // permet de determiner le plateau en fonction du nombre de joueur

    public Game () {
        Scanner clavier = new Scanner (System.in);
        System.out.println ("Combien de joueur vont jouer ?");
        this.nbJoueur = clavier.nextInt ();
        listDeJoueurs = createPlayer (); //initialisation du nombre de joueur


        InitialisationPlateau plateau = new InitialisationPlateau (); //initialise plateau
        plateau.initialisationPlateau (nbJoueur);
        plateau.display (); //affiche le plateau

        //affichage du plateau en fonction du nombre de joueurs choisi


        //Algorithme du jeu
// faire un set pour que on puisse cpmpléter l'alogirthme et que ce soit retenu qq part : fait
        while (0 == 0) {
            for (int niemeJoueur = 0; niemeJoueur < nbJoueur; niemeJoueur++) {
                System.out.println ("C'est à vous de jouer, joueur" + (niemeJoueur + 1));
                System.out.println (" ");
                System.out.println ("Si vous voulez compléter le programme, taper 1");
                System.out.println ("Si vous voulez construire un mûr, taper 2");
                System.out.println ("Si vous voulez exécuter le programme, taper 3");
                System.out.println (" ");
                int choix = clavier.nextInt ();
                switch (choix) {
                    case 1:
                        System.out.println ("Voici vos cartes, Joueur" + (niemeJoueur + 1));
                        System.out.println (" ");
                        for (int j = 0; j < 5; j++) { // compteur j permet d'indiquer toutes les cartes du joueur
                            System.out.println (listDeJoueurs.get (niemeJoueur).getHand ().get (j).getColor ());
                        }
                        System.out.println (" ");
                        listDeJoueurs.get (niemeJoueur).completeAlgorithm ();
                        listDeJoueurs.get (niemeJoueur).setDefausseCarte ();
                        listDeJoueurs.get (niemeJoueur).setHand (listDeJoueurs.get (niemeJoueur).getHand ()); // permet de mettre en mémoire la main du joueur
                        listDeJoueurs.get (niemeJoueur).setCurrentAlgorithm (listDeJoueurs.get (niemeJoueur).getCurrentAlgorithm ());
                        break;
                    case 2:
                        int nbreBloc=5;
                        System.out.println ("Voici vos blocs, Joueur"+(niemeJoueur+1)+"\n");
                        for (int j = 0; j < nbreBloc; j++) {
                            System.out.println (listDeJoueurs.get (niemeJoueur).getBlocsList ().get (j).getColor ());
                        }
                        System.out.println ("Voulez vous poser un bloc ? Repondre oui avec un 1 et non avec un 0");
                        int choixBloc = clavier.nextInt ();

                        nbreBloc = nbreBloc-choixBloc;
                        System.out.println ("Cette action n'est pas encore disponible, tu sautes ton tour");
                        break;
                    case 3:
                        System.out.println (listDeJoueurs.get (0).getTortue ().getUneCase ().getX ());
                        System.out.println (listDeJoueurs.get (0).getTortue ().getOrientationTortue ());
                        System.out.println (listDeJoueurs.get (0).getTortue ().getUneCase ().getY () + "\n");
                        for (int niemeCarte = 0; niemeCarte < listDeJoueurs.get (niemeJoueur).getCurrentAlgorithm ().size (); niemeCarte++) {
                            if (listDeJoueurs.get (niemeJoueur).getCurrentAlgorithm ().get (niemeCarte).getColor () == "bleue") {
                                listDeJoueurs.get (niemeJoueur).getTortue ().avance ();
                            } else if (listDeJoueurs.get (niemeJoueur).getCurrentAlgorithm ().get (niemeCarte).getColor () == "jaune") {
                                listDeJoueurs.get (niemeJoueur).getTortue ().tourneGauche ();
                            } else if (listDeJoueurs.get (niemeJoueur).getCurrentAlgorithm ().get (niemeCarte).getColor () == "violette") {
                                listDeJoueurs.get (niemeJoueur).getTortue ().tourneDroite ();
                            } else if (listDeJoueurs.get (niemeJoueur).getCurrentAlgorithm ().get (niemeCarte).getColor () == "laser") {
                                System.out.println ("fonction pas encore disponible désolé");
                            }

                        // affichage des cartes de l'algo caché

                        /*System.out.println ("L'algorithme du joueur" + (niemeJoueur + 1) + " est:");
                        for (int niemeCarte = 0; niemeCarte < listDeJoueurs.get(niemeJoueur).getCurrentAlgorithm ().size (); niemeCarte++) {
                            System.out.println (listDeJoueurs.get (niemeJoueur).getCurrentAlgorithm ().get (niemeCarte ).getColor ());
                        }
                        System.out.println (" ");*/

                        }
                        //Permet l'affichage de la position finale et de son orientation
                        /*System.out.println (listDeJoueurs.get (0).getTortue ().getUneCase ().getX ());
                        System.out.println (listDeJoueurs.get (0).getTortue ().getOrientationTortue ());
                        System.out.println (listDeJoueurs.get (0).getTortue ().getUneCase ().getY () + "\n");*/
                        break;
                }
            }
        }


        //permet d'afficher toutes les cartes de tous les joueurs
/*
        for (int i=0;i<nbJoueur;i++) {
            System.out.println (" ");
            System.out.println ("Cartes de joueur" + (i+1));
            System.out.println (" ");
            for (int j = 0; j < 5; j++) {
                System.out.println (listDeJoueurs.get (i).getHand ().get (j).getColor ());
            }
        }

 */
        }

        public ArrayList<Joueur> createPlayer () {
            ArrayList<Joueur> listDeJoueur = new ArrayList<Joueur> ();
            switch (this.nbJoueur) {
                case 2:
                    Joueur joueur1 = new Joueur (new Tortue ("tortueRouge", new Cases (0, 1, true, "tortueRouge"), 'S'), null, null, null,null);
                    joueur1.initialisationDeck ();
                    joueur1.initialisationHand ();
                    joueur1.initialisationBlockList ();
                    Joueur joueur2 = new Joueur (new Tortue ("tortueVerte", new Cases (0, 5, true, "tortueVerte"), 'S'), null, null, null,null);
                    joueur2.initialisationDeck ();
                    joueur2.initialisationHand ();
                    joueur2.initialisationBlockList ();
                    listDeJoueur.add (joueur1);
                    listDeJoueur.add (joueur2);
                case 3:
                    Joueur J1 = new Joueur (new Tortue ("tortueRouge", new Cases (0, 0, true, "tortueRouge"), 'S'), null, null, null,null);
                    J1.initialisationDeck ();
                    J1.initialisationHand ();
                    J1.initialisationBlockList ();
                    Joueur J2 = new Joueur (new Tortue ("tortueVerte", new Cases (0, 3, true, "tortueVerte"), 'S'), null, null, null,null);
                    J2.initialisationDeck ();
                    J2.initialisationHand ();
                    J2.initialisationBlockList ();
                    Joueur J3 = new Joueur (new Tortue ("tortueRose", new Cases (0, 6, true, "tortueRose"), 'S'), null, null, null,null);
                    J3.initialisationDeck ();
                    J3.initialisationHand ();
                    J3.initialisationBlockList ();
                    listDeJoueur.add (J1);
                    listDeJoueur.add (J2);
                    listDeJoueur.add (J3);
                case 4:
                    Joueur player1 = new Joueur (new Tortue ("tortueRouge", new Cases (0, 0, true, "tortueRouge"), 'S'), null, null, null,null);
                    player1.initialisationDeck ();
                    player1.initialisationHand ();
                    player1.initialisationBlockList ();
                    Joueur player2 = new Joueur (new Tortue ("tortueVerte", new Cases (0, 2, true, "tortueVerte"), 'S'), null, null, null,null);
                    player2.initialisationDeck ();
                    player2.initialisationHand ();
                    player2.initialisationBlockList ();
                    Joueur player3 = new Joueur (new Tortue ("tortueRose", new Cases (0, 5, true, "tortueRose"), 'S'), null, null, null,null);
                    player3.initialisationDeck ();
                    player3.initialisationHand ();
                    player3.initialisationBlockList ();
                    Joueur player4 = new Joueur (new Tortue ("tortueBleue", new Cases (0, 7, true, "tortueBleue"), 'S'), null, null, null,null);
                    player4.initialisationDeck ();
                    player4.initialisationHand ();
                    player4.initialisationBlockList ();
                    listDeJoueur.add (player1);
                    listDeJoueur.add (player2);
                    listDeJoueur.add (player3);
                    listDeJoueur.add (player4);
            }
            return listDeJoueur;
        }


        public List<Joueur> getListDeJoueurs () {
            return listDeJoueurs;
        }


    }

