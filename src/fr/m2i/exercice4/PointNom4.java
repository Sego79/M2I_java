package fr.m2i.exercice4;

public class PointNom4 extends Point{
    /*
    Réaliser une classe PointNom, dérivée de Point permettant de manipuler des points définis
    par leurs coordonnées et un nom (caractère). On y prévoira les méthodes suivantes :
        • constructeur pour définir les coordonnées et le nom d’un objet de type PointNom,
        • affiche pour afficher les coordonnées et le nom d’un objet de type PointNom.
     */

    String nom;

    //GETTER ET SETTER
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    //CONSTRUCTEUR
    public PointNom4(int x, int y, String nom) {
        super(x, y);
        this.nom = nom;
//        this.nom = nom; ça fonnctionne aussi
    }

    //super permet ici de récupérer la méthode affiche du parent. Ensuite on ajoute un élément d'affichage complémentaire
    @Override
    public void affiche(){
        super.affiche();
        System.out.println("Le nom de l'exo 4 est : " + getNom()); //this pas obligatoire car ici y'a pas de conflit
//        System.out.println("Le nom de l'exo 4 est : " + this.getNom());fonctionne aussi
    }
//NB: le this représente l'instance (parent et enfants / parent ou enfant)
}
