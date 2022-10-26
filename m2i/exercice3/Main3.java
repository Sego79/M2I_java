package fr.m2i.exercice3;

import java.util.*;

public class Main3 {

    public static Scanner s = new Scanner(System.in);

    static ArrayList<String> listeMatières =  new ArrayList<>(Arrays.asList(
            "Mathématique", "Biologie", "Physique", "Chimie", "Histoire"));
    static int nbeEleves = 10;


    public static void main(String[] args) {
        /*
        Créer un tabl multidimensionnel de notation par élève sous cette forme (5 matières avec un nbe de notes aléatoires)
        {1,2,3 ...},
        {1,2, ...},
        {1,2, ...},

        Votre programme va créer une collection avec la moyenne générale de chaque élève
        Puis  un tri par ordre décroissant (avec lambda / sort)

        Attention:
        on utilise un Array(int[][]) pr l'ens des notes et un tabl à 2 dimensions.
        On utilise un ArrayList<Integer> pour la liste et le sort(lambda)
        ArrayList<Integer> obj = new ArrayLIst<>;
        obj.add(4);
        NB: ici pas besoin d'implementer des interfaces fonctionnelles car elles existent déjà avec sort()
         */

        //Implémentation du tableau accueillant les notes de toute la classe
        ArrayList<Integer> [][] notesClasse = new ArrayList[nbeEleves][listeMatières.size()];

       // On va créér un tableau des élèves, de leurs matières avec un nombre de notes au hasard pour chacune
        for (int i =0; i<nbeEleves; i++){
            for (int j =0; j<listeMatières.size(); j++){
                //On tire au hasard le nombre de notes (j'ai imposé 5 notes maxi)
                int nbeNote = tirerEntierAuHasard(listeMatières.size());
//                int nbeNote = questionReponseInt("Combien de notes pour " + listeMatières.get(j) + " ?");
                notesClasse[i][j] = new ArrayList<Integer>();
                for(int k =0; k < nbeNote; k++){
                    int note = tirerEntierAuHasard(20);
                 //   int note = questionReponseInt("Veuillez renseigner la note : ");
                    notesClasse[i][j].add(note);
                    System.out.println("Eleve : " + i + " - Matière : " + listeMatières.get(j)+ ", le nombre de notes : " + nbeNote + " - Note(s) " + note);
                }
                System.out.println("------------------------------------------------------------------------------------------------------------");
            }
            System.out.println("*************************************************************************************************************");
            System.out.println("*************************************************************************************************************");
        }

        System.out.println("Voici les notes des élèves " + Arrays.deepToString(notesClasse));

        //FAIRE TBALEAU DES MOYENNES
        ArrayList<Integer> tablMoyenne = new ArrayList<Integer>();

        for(int i = 0; i < notesClasse.length; i++){
             int totalNotes = 0;
             int nbeNotesBoucle = 0;
             for(int j = 0; j < notesClasse[i].length; j++) {
                 for (int k = 0; k < notesClasse[i][j].size(); k++) {
                    totalNotes += notesClasse[i][j].get(k);
                    nbeNotesBoucle++;
                 }
             }
            tablMoyenne.add(totalNotes / nbeNotesBoucle);
        }
        System.out.println("*************************************************************************************************************");
        System.out.println("Voici le classement des moyennes par ordre des élèves : " + tablMoyenne);

        //TRIER LE TABLEAU
      //  tablMoyenne.sort((a, b) -> a-b);//du plus petit au plus grand
        tablMoyenne.sort((a,b) -> b-a); //du plus grand au plus petit
        System.out.println("Voici le classement des moyennes par ordre décroissant : " + tablMoyenne);

        System.out.println("*************************************************************************************************************");

    } //fin méthode main


    /**---------------FONCTIONS UTILITAIRES----------------------------*/

    public static int questionReponseInt(String question){
        System.out.println(question);
        return s.nextInt();
    }

    private static int tirerEntierAuHasard(int n) {
        return (int)Math.floor(Math.random()*n + 1 ); //ici j'ajoute 1 afin que l'élève soit bien noté sur toutes les matières
                                                      // sinon il pouvait ne pas avoir de notes sur une matière
    }

}
