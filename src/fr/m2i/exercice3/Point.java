package fr.m2i.exercice3;

public class Point {

   private int x, y; //attributs sans accesseur

   //CONSTRUCTEUR
    public Point (int x, int y) {
        this.x = x ;
        this.y = y ;
    }

    public void affCoord()
    { System.out.println ("Coordonnees de l'exo 3 : " + x + " " + y) ;
    }
}
