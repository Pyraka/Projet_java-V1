public class Plateau {
    //private static char[][] plateau = new char[8][8]; // construction d'un tableau de 8 par 8

    /*public static void initialisation () {
        for (int ligne = 8; ligne < 8; ligne++) { //on commence à compter à 0 donc il y a bien 8 lignes
            for (int colonne = 0; colonne < 8; colonne++) { // de meme pour les colonnes
                plateau[colonne][ligne] = ' ';
            }
        }
    }

     */

    public static void initialisation () {
        String[][] plateau = new String[8][8];
        for (int colonne = 8; colonne < 8; colonne++) { //on commence à compter à 0 donc il y a bien 8 lignes
            for (int ligne = 0; ligne < 8; ligne++) { // de meme pour les colonnes
                plateau[ligne][colonne] = "__________";
            }
        }
        Joueur.setNbrJoueur ();
        if (Joueur.getNbrJoueur () == 2){
            plateau[0][1] = "tortueRouge";
            plateau[0][5] = "tortueVerte";
            plateau[7][3] = "joyauVert";
            plateau[0][7] = "X";
            plateau[1][7] = "X";
            plateau[2][7] = "X";
            plateau[3][7] = "X";
            plateau[4][7] = "X";
            plateau[5][7] = "X";
            plateau[6][7] = "X";
            plateau[7][7] = "X";
        }

        if (Joueur.getNbrJoueur () == 3){
            plateau[0][0] = "tortueRouge";
            plateau[0][3] = "tortueVerte";
            plateau[0][6] = "tortueRose";
            plateau[7][0] = "joyauRose";
            plateau[7][3] = "joyauVert";
            plateau[7][6] = "joyauBleu";
            plateau[0][7] = "X";
            plateau[1][7] = "X";
            plateau[2][7] = "X";
            plateau[3][7] = "X";
            plateau[4][7] = "X";
            plateau[5][7] = "X";
            plateau[6][7] = "X";
            plateau[7][7] = "X";

        }
        if (Joueur.getNbrJoueur () == 4) {
            plateau[0][0] = "tortueRouge";
            plateau[0][2] = "tortueVerte";
            plateau[0][5] = "tortueRose";
            plateau[0][7] = "tortueBleu";
            plateau[0][7] = "joyauRose";
            plateau[7][1] = "joyauRose";
            plateau[7][6] = "joyauBleu";
        }
        System.out.println("0 |"+plateau[0][0]+plateau[0][1]+plateau[0][2]+plateau[0][3]+plateau[0][4]+plateau[0][5]+plateau[0][6]+plateau[0][7]+" |");
        System.out.println("1 |"+plateau[1][0]+plateau[1][1]+plateau[1][2]+plateau[1][3]+plateau[1][4]+plateau[1][5]+plateau[1][6]+plateau[1][7]+" |");
        System.out.println("2 |"+plateau[2][0]+plateau[2][1]+plateau[2][2]+plateau[2][3]+plateau[2][4]+plateau[2][5]+plateau[2][6]+plateau[2][7]+" |");
        System.out.println("3 |"+plateau[3][0]+plateau[3][1]+plateau[3][2]+plateau[3][3]+plateau[3][4]+plateau[3][5]+plateau[3][6]+plateau[3][7]+" |");
        System.out.println("4 |"+plateau[4][0]+plateau[4][1]+plateau[4][2]+plateau[4][3]+plateau[4][4]+plateau[4][5]+plateau[4][6]+plateau[4][7]+" |");
        System.out.println("5 |"+plateau[5][0]+plateau[5][1]+plateau[5][2]+plateau[5][3]+plateau[5][4]+plateau[5][5]+plateau[5][6]+plateau[5][7]+" |");
        System.out.println("6 |"+plateau[6][0]+plateau[6][1]+plateau[6][2]+plateau[6][3]+plateau[6][4]+plateau[6][5]+plateau[6][6]+plateau[6][7]+" |");
        System.out.println("7 |"+plateau[7][0]+plateau[7][1]+plateau[7][2]+plateau[7][3]+plateau[7][4]+plateau[7][5]+plateau[7][6]+plateau[7][7]+" |");

    }
}