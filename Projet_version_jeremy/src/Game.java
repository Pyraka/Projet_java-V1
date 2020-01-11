import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {
    private int nbJoueur; // permet de determiner le plateau en fonction du nombre de joueur
    private List<Carte> listCartes;
    private List<Joueur> listDeJoueurs;

    public ArrayList<Joueur> createPlayer () {
        ArrayList<Joueur> listDeJoueur = new ArrayList<Joueur> ();
        switch(this.nbJoueur){
            case 2:
                Joueur joueur1 = new Joueur(new Tortue("tortueRouge",new Cases(0,1,true,"tortueRouge"),'S'), null,null);
                joueur1.initialisationDeck ();
                joueur1.setHand ();
                Joueur joueur2 = new Joueur(new Tortue("tortueVerte",new Cases(0,5,true,"tortueVerte"),'S'), null,null);
                joueur2.initialisationDeck ();
                joueur2.setHand ();
                listDeJoueur.add (joueur1);
                listDeJoueur.add (joueur2);
            case 3:
                Joueur J1 = new Joueur(new Tortue("tortueRouge",new Cases(0,0,true,"tortueRouge"),'S'), null,null);
                J1.initialisationDeck ();
                J1.setHand ();
                Joueur J2 = new Joueur(new Tortue("tortueVerte",new Cases(0,3,true,"tortueVerte"),'S'), null,null);
                J2.initialisationDeck ();
                J2.setHand ();
                Joueur J3 = new Joueur(new Tortue("tortueRose",new Cases(0,6,true,"tortueRose"),'S'), null,null);
                J3.initialisationDeck ();
                J3.setHand ();
                listDeJoueur.add (J1);
                listDeJoueur.add (J2);
                listDeJoueur.add (J3);
            case 4:
                Joueur player1 = new Joueur(new Tortue("tortueRouge",new Cases(0,0,true,"tortueRouge"),'S'), null,null);
                player1.initialisationDeck ();
                player1.setHand ();
                Joueur player2 = new Joueur(new Tortue("tortueVerte",new Cases(0,2,true,"tortueVerte"),'S'), null,null);
                player2.initialisationDeck ();
                player2.setHand ();
                Joueur player3 = new Joueur(new Tortue("tortueRose",new Cases(0,5,true,"tortueRose"),'S'), null,null);
                player3.initialisationDeck ();
                player3.setHand ();
                Joueur player4 = new Joueur(new Tortue("tortueBleue",new Cases(0,7,true,"tortueBleue"),'S'), null,null);
                player4.initialisationDeck ();
                player4.setHand ();
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

    public Game(){
        Plateau test = new Plateau (); //initialise plateau
        Scanner clavier = new Scanner (System.in);
        System.out.println ("Combien de joueur vont jouer ?");
        this.nbJoueur = clavier.nextInt ();


        //affichage du plateau en fonction du nombre de joueurs choisis

        test.initialisationPlateau (nbJoueur);
        test.display (); //affiche le plateau
        listDeJoueurs = createPlayer ();

        System.out.println (listDeJoueurs.get(0).getHand ().get (2).getColor ());

        //System.out.println (listDeJoueurs.get (0).getTortue ().getUneCase ().getY ());
        //listDeJoueurs.get (0).getTortue ().avance ();
        //test.display (); //affiche le plateau apres avoir fait avancer une tortue
    }
}

