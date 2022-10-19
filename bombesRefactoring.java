import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        /*
        Jeu qui demande au joueur :
        dimension de la grille = (x*y)
        Combien de bombe voulez vous?
        Le programme va positionner de manière aléatoire des bombes sur certaines cases (boolean).
        Attention à éviter d'avoir 2 fois une même case sélectionnée.
        Puis on invite le joueur à choisir des cases et on lui indique si il a trouvé une bombe ou non.
        La fin du jeu est quand le joueur a trouvé toutes les bombes.
        Le programme affiche le nombre de coup.
        POur chaque coup vous affichez la grille dans la console avec les bombes découvertes
         */

        //CREATION DU PLATEAU DE JEU
        int x = instructionJoueur("Veuillez indiquer la largeur du plateau (axe des x) :");
        int y = instructionJoueur("Veuillez indiquer la hauteur du plateau (axe des y):");
        int bombes = instructionJoueur("Veuillez indiquer le nombre de bombes sur le plateau:");

        //INITIALISATION DU PLATEAU DE JEU
        //boolean[][] plateau = creationTableauBool(x,y);
        //INSTALLATION DES BOMBES AU HASARD SUR LE PLATEAU
        boolean[][] plateau = installationBombes(x, y, creationTableauBool(x,y), bombes);

        //JEU
        //INITIALISATION DU PLATEAU DU JOUEUR AVEC POUR SYMBOLE "?"
        //char[][] plateauJoueur = creationTableauChar(x, y);
        char[][] plateauJoueur = remplissageTableau(x, y, creationTableauChar(x, y), '?');

        //FONCTION PEMRETTANT AU JOUEUR DE JOUER JUSQU'A CE QU'IL A TROUVE TOUTES LES BOMBES
        jeu(bombes, plateau, plateauJoueur);
    }

    public static int instructionJoueur (String question){
        System.out.println(question);
       return s.nextInt();
    }

    public static boolean[][] creationTableauBool(int x, int y){
      return new boolean[x][y];
    }

    public static char[][] creationTableauChar(int x, int y){
        return new char[x][y];
    }

    public static char[][] remplissageTableau(int x, int y, char[][] plateauJoueur, char symbole) {

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                plateauJoueur[i][j] = symbole;
            }
        }
        return plateauJoueur;
    }

    public static boolean[][] installationBombes(int x, int y, boolean[][] plateau, int bombes){
        int positionX;
        int positionY;
        int instalBombes = 0;
        do {
            positionX = (int) (Math.random() * (x - 1));
            positionY = (int) (Math.random() * (y - 1));
            plateau[positionX][positionY] = true;
            //  System.out.println("la bombe " + instalBombes + " est installée");
            instalBombes++;
        } while (instalBombes < bombes);
        System.out.println("Voici la position des bombes : " + Arrays.deepToString(plateau));
        return plateau;
    }

    public static void jeu(int bombes,  boolean[][] plateau, char[][]plateauJoueur){
        int bombesTrouvees = 0;
        do{
            int choixX = instructionJoueur("Veuillez indiquer la case (axe des X) que vous souhaitez cibler");
            int choixY = instructionJoueur("Veuillez indiquer la case (axe des Y) que vous souhaitez cibler");
            char o = 'o';
            char b = 'b';
            if (plateau[choixX][choixY]) {
                bombesTrouvees++;
                System.out.println("Bravo vous avec trouvé la bombe numéro " + bombesTrouvees + " Il vous en reste " + (bombes-bombesTrouvees));
                plateauJoueur[choixX][choixY] = b;
            } else {
                System.out.println("Perdu, dommage!! Veuillez recommencer...");
                plateauJoueur[choixX][choixY] = o;
            }
            System.out.println(Arrays.deepToString(plateauJoueur));
        }while (bombesTrouvees != bombes );
    }

 }

