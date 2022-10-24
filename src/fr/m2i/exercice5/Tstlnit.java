package fr.m2i.exercice5;

public class Tstlnit {
    // Quels résultats fournit ce programme ?

    public static void main (String args[])
        { A a = new A(5) ;
          B b = new B(5, 3) ;
        }

    }

    /*RESULTAT DU PROGRAMME :
    Entree Constr A - n=0 p=10
    Sortie Constr A - n=5 p=10
    Entree Constr A - n=0 p=10
    Sortie Constr A - n=5 p=10
    Entree Constr B - n=5 p=10 q=25
    Sortie Constr B - n=5 p=3 q=10
     */

/*VOICI CE QUI SE PASSE :
• initialisation par défaut des champs de l’objet dérivé (y compris ceux hérités),
• initialisation explicite des champs hérités,
• exécution du constructeur de la classe de base,
• initialisation explicite des champs spécifiques à l’objet dérivé,
• exécution du constructeur de la classe dérivée.
 */