package fr.m2i.exercice2;

public class PointNom extends Point {
    //Réaliser une classe PointNom, dérivée de Point permettant de manipuler des points définis
    //par deux coordonnées (int) et un nom (caractère). On y prévoira les méthodes suivantes :
    //• setPointNom pour définir les coordonnées et le nom d’un objet de type PointNom,
    //• setNom pour définir seulement le nom d’un tel objet,
    //• affCoordNom pour afficher les coordonnées et le nom d’un objet de type PointNom.
    //Écrire un petit programme utilisant la classe PointNom.

   String nom;

    public PointNom(String nom, int x, int y) {
        setPoint(x, y); //Utilisation de la méthode de la classe parent pour récupérer x et y
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPointNom(int x, int y, String nom){
        super.setPoint(x, y);
        setNom(nom);
    }
    public void affCoordNom(int x, int y, String nom){
        super.affCoord(x, y);
        System.out.println("le nom est : "+ nom);
    }


}
