public class Plateau {
    private static char[][] plateau = new char[8][8]; // construction d'un tableau de 8 par 8

    public static void initialisation () {
        for (int ligne = 8; ligne < 8; ligne++) { //on commence à compter à 0 donc il y a bien 8 lignes
            for (int colonne = 0; colonne < 8; colonne++) { // de meme pour les colonnes
                plateau[colonne][ligne] = ' ';
            }
        }
    }
}
