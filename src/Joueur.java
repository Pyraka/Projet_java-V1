import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Joueur {

    private static int nbrJoueur;

    public static int getNbrJoueur() {
        return nbrJoueur;
    }

    public static void setNbrJoueur(){
        Scanner clavier = new Scanner(System.in);
        System.out.println ("Combien de joueur vont jouer ?");
        nbrJoueur = clavier.nextInt ();
    }

    private int nbrJoyaux;

    public int getNbrJoyaux(){
        if (nbrJoueur == 2){
            return 1;
        }
        else if(nbrJoueur == 3){
            return 3;
        }
        else if(nbrJoueur == 4){
            return 2;
        }
        return 0;
    }

    enum couleurs{
        tortueVerte, tortueBleue
    }

    private static String tortue;

    public static String getTortue(){
        return tortue;
    }

    public static void setTortue (){
        List<String> tortues = new ArrayList<> (4);
        if(nbrJoueur == 2){
            tortues.add("tortueRouge");
            tortues.add("tortueVerte");
        }
        if(nbrJoueur == 3){
            tortues.add("tortueRouge");
            tortues.add("tortueVerte");
            tortues.add("tortueBleue");
        }
        if(nbrJoueur == 4){
            tortues.add("tortueRouge");
            tortues.add("tortueVerte");
            tortues.add("tortueBleue");
            tortues.add("tortueRose");
        }
    }

    private static String orientationTortue;

    public static String getOrientationTortue(){
        return orientationTortue;
    }

    public static void setOrientationTortue(){
        orientationTortue = "nord";
    }

    private static char[][] positionTortue;

    public static char[][] getPositionTortue(){
        return positionTortue;
    }
}
