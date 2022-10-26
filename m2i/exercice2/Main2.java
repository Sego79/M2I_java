package fr.m2i.exercice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static Scanner s = new Scanner(System.in);

    static List<String> listePersonnes =  new ArrayList<>(Arrays.asList(
            "Albert", "brigitte", "camille",
            "alphonse", "Betty", "charles",
            "augustin", "brice", "chloé",
            "audrey", "Baptiste", "Celine"));

    public static void main(String[] args) {

/*
Créer une liste de personne (Arraylist)
avec 4 5 personnes dont le nom commence par a
avec 4 5 personnes dont le nom commence par b
avec 4 5 personnes dont le nom commence par c
Trouver une solutuion simple pour séparer les a,b,c sur 3 tableaux différents (lambda -- forEach)
NB: ici pas besoin d'implementer des interfaces fonctionnelles car elles existent déjà
 */
        List<String> listeTableauDesA = new ArrayList<>(listePersonnes.size() / 3);
        List<String> listeTableauDesB = new ArrayList<>(listePersonnes.size() / 3);
        List<String> listeTableauDesC = new ArrayList<>(listePersonnes.size() / 3);

        //ON RENTRE NOUS MEME LE PRENOM DES ELEVES
//        List<String> listePersonnes =  new ArrayList<>();
//        for(int i=0; i<4; i++) {
//            String pers1 = questionReponseString("Choisissez 1 prénom commençant par a  ");
//            String pers2 = questionReponseString("Choisissez 1 prénom commençant par b  ");
//            String pers3 = questionReponseString("Choisissez 1 prénom commençant par c  ");
//            listePersonnes.add(pers1);
//            listePersonnes.add(pers2);
//            listePersonnes.add(pers3);
//        }
        System.out.println(listePersonnes);

        //METHODE1 SANS LAMBDA
//        for(int i=0; i<listePersonnes.size(); i++){
//            String L = (String) listePersonnes.get(i).subSequence(0,1);
//            //System.out.println(L);
//            switch (L){
//                case "a" : listeTableauDesA.add(listePersonnes.get(i));break;
//                case "b" : listeTableauDesB.add(listePersonnes.get(i));break;
//                case "c" : listeTableauDesC.add(listePersonnes.get(i));break;
//            }

//        System.out.println(listeTableauDesA);
//        System.out.println(listeTableauDesB);
//        System.out.println(listeTableauDesC);

        //METHODE2 SANS LAMBDA
//        for (String personne : listePersonnes) {
//           String initiale = (String) personne.subSequence(0, 1);
//            switch (initiale) {
//                case "a":
//                    listeTableauDesA.add(personne);
//                    break;
//                case "b":
//                    listeTableauDesB.add(personne);
//                    break;
//                case "c":
//                    listeTableauDesC.add(personne);
//                    break;
//            }
//
//            System.out.println(listeTableauDesA);
//            System.out.println(listeTableauDesB);
//            System.out.println(listeTableauDesC);
//        }

        //METHODE AVEC LAMBDA
        //  ECRITURE 1
//        listePersonnes.forEach(personne -> {
//            String initiale = (String) personne.toLowerCase().subSequence(0, 1);
//            switch (initiale) {
//                case "a":
//                    listeTableauDesA.add(personne);;
//                    break;
//                case "b":
//                    listeTableauDesB.add(personne);
//                    break;
//                case "c":
//                    listeTableauDesC.add(personne);
//                    break;
//            }
//        });

        //  ECRITURE 2
        listePersonnes.forEach(personne -> {
            String initiale = (String) personne.toLowerCase().subSequence(0, 1);
            switch (initiale) {
                case "a" -> {
                    listeTableauDesA.add(personne);
                    ;
                }
                case "b" -> listeTableauDesB.add(personne);
                case "c" -> listeTableauDesC.add(personne);
            }
        });

            System.out.println(listeTableauDesA);
            System.out.println(listeTableauDesB);
            System.out.println(listeTableauDesC);

   }//fin méthode main


    public static String questionReponseString(String question){
        System.out.println(question);
        return s.nextLine();
    }
}
