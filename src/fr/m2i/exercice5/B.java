package fr.m2i.exercice5;

public class B extends A {

    public int q=25 ;

    //CONSTRUCTEUR
    public B (int n, int pp)
        { super (n) ; //On récupère les données de sortie (donc dans l'exemple ce sera 5 et non 0 qui est en entrée) du parent
            System.out.println ("Entree Constr B - n=" + n + " p=" + p + " q=" + q) ;
            p = pp ; //on modifie la valeur de l'attribut du parent par celle mise dans la déclaration
            q = 2*n ; //on modifie la valeur de notre attribut de classe
            System.out.println ("Sortie Constr B - n=" + n + " p=" + p + " q=" + q) ;
        }

//super permet aussi de relancer le constructeur et donc l'affichage prévu dans A donc dans la sortie console il y a 2 fois
    //l'affichage de A
    }
