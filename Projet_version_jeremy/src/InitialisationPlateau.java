import java.lang.management.PlatformLoggingMXBean;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InitialisationPlateau {

    private List<List<Case>> plateau; // une liste de liste définie un tableau

    public InitialisationPlateau (/*Tortue tortue*/) { // je ne suis pas sûr
        this.plateau = new ArrayList<> (); //initialisation du plateau
    }

    public void initialisationPlateau (int nbJoueur) {
        for (int colonne = 0; colonne < 8; colonne++) { //on commence à compter à 0 donc il y a bien 8 lignes
            List<Case> colo = new ArrayList<> ();
            for (int ligne = 0; ligne < 8; ligne++) { // de meme pour les colonnes
                Case cases = null;
                if (nbJoueur == 2) {
                    cases = new Case (colonne, ligne, false, " _______ ");
                    if (ligne == 7 && colonne < 8) {
                        cases = new Case (colonne, ligne, true, "    X    ");
                    }
                    else if (colonne == 0  && ligne == 1 ) {
                        cases = new Case (colonne, ligne, true, " tortueRouge ");

                    } else if (colonne == 0 && ligne == 5) {
                        cases = new Case (colonne, ligne, true, "tortueVerte");


                    } else if (colonne == 7 && ligne == 3) {
                        cases = new Case (colonne, ligne, true, " joyauVert ");
                        //Joyau joyauxVert = new Joyau (new Case(colonne, ligne, true, " joyauVert ")); version qui ne s'affiche pas mais qui peut être utile
                    } else {
                        cases = new Case (colonne, ligne, false, " ____ ");
                    }
                    colo.add(cases); // on ajoute des colonnes a chaque fois
                }


                else if (nbJoueur == 3) {
                    cases = new Case (colonne, ligne, false, " ____ ");
                    if (ligne == 7 && colonne < 8) {
                        cases = new Case (colonne, ligne, true, "    X    ");
                    }
                    else if (colonne == 0 && ligne == 0) {
                        cases = new Case (colonne, ligne, true, " tortueRouge ");
                    } else if (colonne == 0 && ligne == 3) {
                        cases = new Case (colonne, ligne, true, "tortueVerte");
                    } else if (colonne == 0 && ligne == 6) {
                        cases = new Case (colonne, ligne, true, "tortueRose");
                    } else if (colonne == 7 && ligne == 0) {
                        cases = new Case (colonne, ligne, true, " joyauRose ");
                    } else if (colonne == 7 && ligne == 3) {
                        cases = new Case (colonne, ligne, true, "joyauVert");
                    } else if (colonne == 7 && ligne == 6) {
                        cases = new Case (colonne, ligne, true, "joyauBleu");
                    } else {
                        cases = new Case (colonne, ligne, false, " ____ ");
                    }
                    colo.add(cases);
                }

                else if (nbJoueur == 4) {
                    cases = new Case (colonne, ligne, false, " ____ ");
                    if (colonne == 0 && ligne == 0) {
                        cases = new Case (colonne, ligne, true, " tortueRouge ");
                    } else if (colonne == 0 && ligne == 2) {
                        cases = new Case (colonne, ligne, true, "tortueVerte");
                    } else if (colonne == 0 && ligne == 5) {
                        cases = new Case (colonne, ligne, true, "tortueRose");
                    } else if (colonne == 0 && ligne == 7) {
                        cases = new Case (colonne, ligne, true, "tortueBleue");
                    } else if (colonne == 7 && ligne == 1) {
                        cases = new Case (colonne, ligne, true, " joyauRose ");
                    } else if (colonne == 7 && ligne == 6) {
                        cases = new Case (colonne, ligne, true, "joyauBleu");
                    } else {
                        cases = new Case (colonne, ligne, false, " ____ ");
                    }
                    colo.add(cases);
                }

            }

            plateau.add(colo); // permet de faire une liste de colonne ce qui donne un tableau de 8 par 8
        }
    }

    public void display (){ // permet de creer une fonction pour afficher le plateau en console
        for(List<Case> listColonnes : plateau ){ // list de case
            for(Case uneCase: listColonnes ){ // la case
                System.out.print (uneCase.getSee ());
            }
            System.out.println ("");
        }
    }

    /*public void newPLateau(int nbJoueur){
        Game game = new Game ();
        Plateau plateau = new Plateau ();
        for (int colonne = 0; colonne < 8; colonne++) { //on commence à compter à 0 donc il y a bien 8 lignes
            List<Case> colo = new ArrayList<> ();
            for (int ligne = 0; ligne < 8; ligne++) { // de meme pour les colonnes
                Cases cases = null;
                if (nbJoueur == 2) {
                    cases = new Cases (colonne, ligne, false, " _______ ");
                    if (ligne == game.getListDeJoueurs ().get (0).getTortue ().getUneCase ().getX () && game.getListDeJoueurs ().get (0).getTortue ().getUneCase ().getY () < 8) {
                        cases = new Cases (colonne, ligne, true, "    X    ");
                    }
                    else if (colonne == 0 && ligne == 1) {
                        cases = new Cases (colonne, ligne, true, " tortueRouge ");

                    } else if (colonne == 0 && ligne == 5) {
                        cases = new Cases (colonne, ligne, true, "tortueVerte");


                    } else if (colonne == 7 && ligne == 3) {
                        cases = new Cases (colonne, ligne, true, " joyauVert ");
                    } else {
                        cases = new Cases (colonne, ligne, false, " ____ ");
                    }
                    colo.add(cases); // on ajoute des colonnes a chaque fois
                }

    }

     */

}



