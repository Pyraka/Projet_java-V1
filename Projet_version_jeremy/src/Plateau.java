import javax.naming.InitialContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Plateau {

    private List<List<Cases>> plateau; // une liste de liste définie un tableau

    public Plateau () {
        this.plateau = new ArrayList<> (); //initialisation du plateau
    }



    public void initialisationPlateau (int nbJoueur) {
        for (int colonne = 0; colonne < 8; colonne++) { //on commence à compter à 0 donc il y a bien 8 lignes
            List<Cases> colo = new ArrayList<> ();
            for (int ligne = 0; ligne < 8; ligne++) { // de meme pour les colonnes
                Cases cases = null;
                if (nbJoueur == 2) {
                    cases = new Cases (colonne, ligne, false, " _______ ");
                        if (ligne == 7 && colonne < 8) {
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


                else if (nbJoueur == 3) {
                    cases = new Cases (colonne, ligne, false, " ____ ");
                    if (ligne == 7 && colonne < 8) {
                        cases = new Cases (colonne, ligne, true, "    X    ");
                    }
                    else if (colonne == 0 && ligne == 0) {
                        cases = new Cases (colonne, ligne, true, " tortueRouge ");
                    } else if (colonne == 0 && ligne == 3) {
                        cases = new Cases (colonne, ligne, true, "tortueVerte");
                    } else if (colonne == 0 && ligne == 6) {
                        cases = new Cases (colonne, ligne, true, "tortueRose");
                    } else if (colonne == 7 && ligne == 0) {
                        cases = new Cases (colonne, ligne, true, " joyauRose ");
                    } else if (colonne == 7 && ligne == 3) {
                        cases = new Cases (colonne, ligne, true, "joyauVert");
                    } else if (colonne == 7 && ligne == 6) {
                        cases = new Cases (colonne, ligne, true, "joyauxBlue");
                    } else {
                        cases = new Cases (colonne, ligne, false, " ____ ");
                    }
                    colo.add(cases);
                }

                else if (nbJoueur == 4) {
                    cases = new Cases (colonne, ligne, false, " ____ ");
                    if (colonne == 0 && ligne == 0) {
                        cases = new Cases (colonne, ligne, true, " tortueRouge ");
                    } else if (colonne == 0 && ligne == 2) {
                        cases = new Cases (colonne, ligne, true, "tortueVerte");
                    } else if (colonne == 0 && ligne == 5) {
                        cases = new Cases (colonne, ligne, true, "tortueRose");
                    } else if (colonne == 0 && ligne == 7) {
                        cases = new Cases (colonne, ligne, true, "tortueBleue");
                    } else if (colonne == 7 && ligne == 1) {
                        cases = new Cases (colonne, ligne, true, " joyauRose ");
                    } else if (colonne == 7 && ligne == 6) {
                        cases = new Cases (colonne, ligne, true, "joyauxBleu");
                    } else {
                        cases = new Cases (colonne, ligne, false, " ____ ");
                    }
                    colo.add(cases);
                }

                }

            plateau.add(colo); // permet de faire une liste de colonne ce qui donne un tableau de 8 par 8
            }
        }

    public void display (){ // permet de creer une fonction pour afficher le plateau en console
        for(List<Cases> listColonnes : plateau ){ // list de case
            for(Cases uneCase: listColonnes ){ // la case
                System.out.print (uneCase.getSee ());
            }
            System.out.println ("");
        }
    }
}



