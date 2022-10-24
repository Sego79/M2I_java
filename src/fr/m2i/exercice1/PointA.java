package fr.m2i.exercice1;

import fr.m2i.exercice1.Point;

public class PointA extends Point {

//    Réaliser une classe PointA, dérivée de Point disposant d’une méthode affiche affichant (en
//    fenêtre console) les coordonnées d’un point. Ecrire un petit programme utilisant les deux
//    classes Point et PointA.

    public void affiche(int x, int y){
        initialise(x, y);
        System.out.println("exo 1 X : " + getX());
        System.out.println("exo 1 Y : " + getY());
    }

}
