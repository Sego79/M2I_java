package fr.m2i.formation.domain;

import fr.m2i.formation.model.Personnage;

public class Main {
    public static void main(String[] args) {

        Personnage[] listePersonnes = new Personnage[1000];

        for(int i=0; i<15; i++) {
            listePersonnes[i] = new Personnage();
        }
        System.out.println(Personnage.getNbeInstance());
    }

}