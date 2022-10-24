package fr.m2i.exercice3;

public class PointNom2 extends Point{
       /*
      Réaliser une classe PointNom, dérivée de Point permettant de manipuler des points définis par leurs coordonnées (entières)
      et un nom (caractère). On y prévoira les méthodes suivantes :
        • constructeur pour définir les coordonnées et le nom d’un objet de type PointNom,
        • affCoordNom pour afficher les coordonnées et le nom d’un objet de type PointNom.
      Écrire un petit programme utilisant la classe PointNom.
     */

    String nom;

    //CONSTRUCTEUR
    public PointNom2(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affCoordNom(){
        affCoord();
        System.out.println("le nom est " + getNom());
    }
}

