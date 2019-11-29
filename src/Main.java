import java.util.Stack;

public class Main {
    public static void main (String[] args) {
        Cartes main = new Cartes ();
        System.out.println (main.carte1);
        main.carte1 =   "tourner à gauche";
        System.out.println (main.carte1);

    }

    Stack stack = new Stack();

}

/*swithc ? / if carteX = jaune{
    System.out.println("tourner à gauche");
    faire tourner à gauche sur le plateau = rotation 90°
        }*/

