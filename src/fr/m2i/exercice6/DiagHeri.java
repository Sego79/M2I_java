package fr.m2i.exercice6;

public class DiagHeri {

    public static void main (String arg[])
        { AA a = new AA() ; a.affiche() ; //on appelle directement la méthode de A
        BB b = new BB() ; b.affiche() ; //B hérite de A directement sans méthodes
        CC c = new CC() ; c.affiche() ; //C herite de A mais change le résultat de la méthode affiche() (surcharge)
        D d = new D() ; d.affiche() ; //D herite de C mais change le résultat de la méthode affiche() (surcharge)
        E e = new E() ; e.affiche() ; //E herite de B qui hérite de A donc cela correspond au résultat de la méthode A
        F f = new F() ; f.affiche() ; //F hérite de C qui hérite de A mais qui change le résultat de sa méthode
        }

}

/*RESULTAT :
Je suis un A
Je suis un A
Je suis un C
Je suis un D
Je suis un A
Je suis un C
 */

/*Commentaire du résultat :
On va donc ici revenir dans les classes ascendantes à chaque fois
 */