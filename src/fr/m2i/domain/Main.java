package fr.m2i.domain;

import fr.m2i.exercice1.PointA;
import fr.m2i.exercice2.PointNom;
import fr.m2i.exercice3.PointNom2;
import fr.m2i.exercice4.PointNom4;

public class Main {
    public static void main(String[] args) {

        //EXERCICE 1
        PointA pointA = new PointA();
        pointA.affiche(12, 20);

        //EXERCICE 2 (Ici les valeurs sont toutes mises à jour et modifiées car seule la méthode set est dispo dans la classe Point)
        PointNom pointNom = new PointNom("C", 17, 8);
        pointNom.affCoordNom(10, 14 , "D");

        //EXERCICE 3
        PointNom2 pointNom2 = new PointNom2(23, 16, "Z");
        pointNom2.affCoordNom();

        //EXERCICE 4 Ici la méthode affiche permet juste d'ajouter le String à la méthode affiche de la classe parente qui elle affiche les coordonnées
        PointNom4  pointNom4 = new PointNom4(19, 33, "U");
        pointNom4.affiche();

    }
}