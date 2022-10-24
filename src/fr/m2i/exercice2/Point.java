package fr.m2i.exercice2;

public class Point {

    private int x, y ;

    public void setPoint (int x, int y) {
         this.x = x ;
         this.y = y ; }

   public void deplace (int dx, int dy) {
        x += dx ; y += dy ;
    }

   public void affCoord (int x, int y)
        { System.out.println ("Coordonnees de l'exo 2: " + x + " " + y) ;
        }

}
