package fr.m2i.exercice5;

public class A {

    public int n ; // ici, exceptionnellement, pas d'encapsulation
    public int p=10 ;

    //CONSTRUCTEUR
    public A(int nn){
    System.out.println ("Entree Constr A - n=" + n + " p=" + p) ;
        n = nn ;
    System.out.println ("Sortie Constr A - n=" + n + " p=" + p) ;}



}
