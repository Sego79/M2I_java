package fr.m2i.exercice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        /***********************************************************************************************/
        //Exemple d'utilisation d'une expression Lambda
        List<String> tab = new ArrayList<>();

        tab.add("truc");
        tab.add("machin");
        tab.add("bidule");
        tab.forEach((element-> System.out.println("Voici le texte : " + element )));

        //Exemple d'utilisation d'une lambda et d'un sort
        List<Integer> tabSort = new ArrayList<>();

        tabSort.add(1);
        tabSort.add(2);
        tabSort.add(3);
        tabSort.add(4);
        tabSort.add(5);
        tabSort.add(6);

        tabSort.sort((a, b)->(a % 2)-(b % 2));
        System.out.println(tabSort); //classement par ordre croissant d'abord paire puis impaire

       /**********************************************************************************************/
        /* Exercice1 expression Lambda:

        Demande 2 nombres
        L'opération que vous voulez faire (intégrer des ENUM)
        et en utilisant les interfaces fonctionnelles et les lambda.
        Calculer en fonction de la demande.
        4 opérations de types + - * /
         */

        int a = makeCalcul(Enumeration.ADDITION, 12, 4);
        int s = makeCalcul(Enumeration.SOUSTRACTION, 6, 4);
        int m = makeCalcul(Enumeration.MULTIPLICATION, 6, 4);
        int d = makeCalcul(Enumeration.DIVISION, 6, 4);
    } //fIN DU MAIN


    public static int makeCalcul(Enumeration typeCalcul, int arg1, int arg2){
        int resultat = 0;
        switch (typeCalcul) {
            case ADDITION ->{
                resultat = fonctionsOperation((nbe1, nbe2) -> nbe1 + nbe2, arg1, arg2);}
            //fr.m2i.exercice1.OperationInterface calculLambda = (nbe1, nbe2) -> nbe1 + nbe2
            case SOUSTRACTION ->{
                resultat =  fonctionsOperation((nbe1, nbe2) -> nbe1 - nbe2, arg1, arg2);}
            //fr.m2i.exercice1.OperationInterface calculLambda = (nbe1, nbe2) -> nbe1 - nbe2
            case MULTIPLICATION-> {
                resultat =  fonctionsOperation((nbe1, nbe2) -> nbe1 * nbe2, arg1, arg2);}
            //fr.m2i.exercice1.OperationInterface calculLambda = (nbe1, nbe2) -> nbe1 * nbe2
            case DIVISION-> {
                resultat =  fonctionsOperation((nbe1, nbe2) -> nbe1 / nbe2, arg1, arg2);}
            //fr.m2i.exercice1.OperationInterface calculLambda = (nbe1, nbe2) -> nbe1 / nbe2
        }
        return  resultat;
    }

    //Méthode de calcul qui appel notre interface fonctionnelle
    public static int fonctionsOperation(OperationInterface operation, int arg1, int arg2){
        int resultat = operation.ope(arg1, arg2);
        System.out.println(resultat);
        return resultat;
    }

    public enum Enumeration{
        ADDITION,
        SOUSTRACTION,
        MULTIPLICATION,
        DIVISION
    }

}



