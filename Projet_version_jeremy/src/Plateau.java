import java.util.Scanner;

public class Plateau {

    public Plateau(){

    }



    public void iniialisationPlateau (Joueur[] joueurs) {
        String[][] plateau = new String[8][8];
        for (int colonne = 0; colonne < 8; colonne++) { //on commence à compter à 0 donc il y a bien 8 lignes
            for (int ligne = 0; ligne < 8; ligne++) { // de meme pour les colonnes
                plateau[ligne][colonne] = "__________";
            }
        }

        if (getNbrJoueur ()== 2){
            int[] coordRouge = {0,1};
            Joueur.Tortue tortueRouge = joueurs[0].getTortue();
            plateau[0][1] = tortueRouge.getCouleur ();
            int[] coordVert = {0,5};
            Joueur.Tortue tortueVerte = joueurs[0].getTortue();
            plateau[0][5] = tortueVerte.getCouleur ();
            plateau[7][3] = "joyauVert";
            for(int i = 0; i < 8; i++){
                plateau[i][7] = "X";
            }
        }

        if (getNbrJoueur () == 3){
            int[] coordRouge = {0,0};
            Joueur.Tortue tortueRouge = joueurs[0].getTortue();
            plateau[0][0] = tortueRouge.getCouleur ();
            int[] coordVert = {0,3};
            Joueur.Tortue tortueVerte = joueurs[0].getTortue();
            plateau[0][3] = tortueVerte.getCouleur ();
            int[] coordRose = {0,3};
            Joueur.Tortue tortueRose = joueurs[0].getTortue();
            plateau[0][5] = tortueVerte.getCouleur ();
            plateau[0][3] = "tortueRose";
            plateau[7][0] = "joyauRose";
            plateau[7][3] = "joyauVert";
            plateau[7][6] = "joyauBleu";
            for(int i = 0; i < 8; i++) {
                plateau[i][7] = "X";
            }

        }
        if (getNbrJoueur () == 4) {
            int[] coordRouge = {0,0};
            Tortue tortueRouge = new Tortue ("Rouge", coordRouge , 'S');
            plateau[0][0] = "tortueRouge";
            int[] coordVert = {0,2};
            Tortue tortueVerte = new Tortue ("Vert", coordVert , 'S');
            plateau[0][2] = "tortueVerte";
            int[] coordBleu = {0,3};
            Tortue tortueBleue = new Tortue ("Bleu", coordBleu , 'S');
            plateau[0][3] = "tortueBleue";
            int[] coordRose = {0,5};
            Tortue tortueRose = new Tortue ("Rose", coordRose , 'S');
            plateau[0][5] = "tortueRose";
            plateau[0][7] = "joyauRose";
            plateau[7][1] = "joyauRose";
            plateau[7][6] = "joyauBleu";
        }


        // visualisation du plateau

        System.out.println("0 |"+plateau[0][0]+plateau[0][1]+plateau[0][2]+plateau[0][3]+plateau[0][4]+plateau[0][5]+plateau[0][6]+plateau[0][7]+" |");
        System.out.println("1 |"+plateau[1][0]+plateau[1][1]+plateau[1][2]+plateau[1][3]+plateau[1][4]+plateau[1][5]+plateau[1][6]+plateau[1][7]+" |");
        System.out.println("2 |"+plateau[2][0]+plateau[2][1]+plateau[2][2]+plateau[2][3]+plateau[2][4]+plateau[2][5]+plateau[2][6]+plateau[2][7]+" |");
        System.out.println("3 |"+plateau[3][0]+plateau[3][1]+plateau[3][2]+plateau[3][3]+plateau[3][4]+plateau[3][5]+plateau[3][6]+plateau[3][7]+" |");
        System.out.println("4 |"+plateau[4][0]+plateau[4][1]+plateau[4][2]+plateau[4][3]+plateau[4][4]+plateau[4][5]+plateau[4][6]+plateau[4][7]+" |");
        System.out.println("5 |"+plateau[5][0]+plateau[5][1]+plateau[5][2]+plateau[5][3]+plateau[5][4]+plateau[5][5]+plateau[5][6]+plateau[5][7]+" |");
        System.out.println("6 |"+plateau[6][0]+plateau[6][1]+plateau[6][2]+plateau[6][3]+plateau[6][4]+plateau[6][5]+plateau[6][6]+plateau[6][7]+" |");
        System.out.println("7 |"+plateau[7][0]+plateau[7][1]+plateau[7][2]+plateau[7][3]+plateau[7][4]+plateau[7][5]+plateau[7][6]+plateau[7][7]+" |");

    }

    /*private static int nbrJoyaux;
    public void setNbrJoyaux(){
        if (nbrJoueur == 2){
            nbrJoyaux = 1;
        }
        else if(nbrJoueur == 3){
            nbrJoyaux = 3;
        }
        else if(nbrJoueur == 4){
            nbrJoyaux = 2;
        }
    }

     */
}