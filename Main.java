package fr.m2i.domain;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
    /*
        créer une todolist et sortir les éléments avec une méthode et l'élément qu'on enlève à chaque fois doit être le 1er
        Donc liste de type FIFO
         */

        /***************************************************************************************************************/

        //ESSAI AVEC LINKED LIST - on enlève le 1er
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("*************** LINKED LIST - On enlève le 1er **************");
        System.out.println("");
        System.out.println("***************************************************");

        LinkedList<String> toDoList3 = new LinkedList<>();

        toDoList3.add("Trouver un logement");
        toDoList3.add("Déménager");
        toDoList3.add("récupérer les enfants");
        toDoList3.add("Faire les courses" );
        toDoList3.add("Faire le ménage");

        System.out.println("***************************************************");
        System.out.println("Ma toDoList3 : " + toDoList3);
        System.out.println("Nombre de tâches : " + toDoList3.size());
        System.out.println("Ma première tâche : " + toDoList3.element());
        System.out.println("***************************************************");

        for(int i = 0; i < toDoList3.size(); i++){
            toDoList3.pop(); //Ordre FIFO : enlève la 1ère tâche
//            toDoList3.remove(); //Fonctionne aussi
            System.out.println("Ma toDoList3 après la suppression du 1er: " + toDoList3);
            System.out.println("Nombre de tâches : " + toDoList3.size());
            System.out.println("***************************************************");
        }

        toDoList3.pop();
        System.out.println("Ma toDoList3 après la suppression du 1er: " + toDoList3);
        System.out.println("Nombre de tâches : " + toDoList3.size());

        /***************************************************************************************************************/

        //ESSAI AVEC LINKED LIST - on enlève le dernier
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("*************** LINKED LIST - Enlève le dernier **************");
        System.out.println("");
        System.out.println("***************************************************");

        LinkedList<String> toDoList4 = new LinkedList<>();

        toDoList4.add("Trouver un logement");
        toDoList4.add("Déménager");
        toDoList4.add("récupérer les enfants");
        toDoList4.add("Faire les courses" );
        toDoList4.add("Faire le ménage");

        System.out.println("***************************************************");
        System.out.println("Ma toDoList4 : " + toDoList4);
        System.out.println("Nombre de tâches : " + toDoList4.size());
        System.out.println("Ma première tâche : " + toDoList4.element());
        System.out.println("***************************************************");

        for(int i = 0; i < toDoList4.size(); i++){
            toDoList4.pollLast(); //Ordre FIFO : enlève la dernière tâche
//            toDoList4.removeLast(); //Fonctionne aussi
            System.out.println("Ma toDoList4 après la suppression du 1er: " + toDoList4);
            System.out.println("Nombre de tâches : " + toDoList4.size());
            System.out.println("***************************************************");
        }

        toDoList4.pollLast();
        System.out.println("Ma toDoList4 après la suppression du 1er: " + toDoList4);
        System.out.println("Nombre de tâches : " + toDoList4.size());


 /***************************************************************************************************************/

        //ESSAI AVEC ARRAY DEQUE
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("*************** ARRAY DEQUE - on enlève le 1er **************");
        System.out.println("");
        System.out.println("***************************************************");

        ArrayDeque<String> toDoList = new ArrayDeque<>();

        toDoList.add("Trouver un logement");
        toDoList.add("Déménager");
        toDoList.add("récupérer les enfants");
        toDoList.add("Faire les courses");
        toDoList.add("Faire le ménage");

        System.out.println("***************************************************");
        System.out.println("Ma toDoList : " + toDoList);
        System.out.println("Nombre de tâches : " + toDoList.size());
        System.out.println("Ma première tâche : " + toDoList.peek());
        System.out.println("***************************************************");

        for(int i = 0; i <= toDoList.size(); i++){
            //     toDoList.poll();
            toDoList.pop();
            System.out.println("Ma toDoList après la suppression du 1er: " + toDoList);
            System.out.println("Nombre de tâches : " + toDoList.size());
            System.out.println("***************************************************");
        }
//        toDoList.poll();
        toDoList.pop();
        System.out.println("Ma toDoList après la suppression du 1er: " + toDoList);
        System.out.println("Nombre de tâches : " + toDoList.size());

        /************************************************************************************/

        //ESSAI AVEC ARRAY DEQUE
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("*************** ARRAY DEQUE - on enlève le dernier **************");
        System.out.println("");
        System.out.println("***************************************************");

        ArrayDeque<String> toDoList5 = new ArrayDeque<>();

        toDoList5.add("Trouver un logement");
        toDoList5.add("Déménager");
        toDoList5.add("récupérer les enfants");
        toDoList5.add("Faire les courses");
        toDoList5.add("Faire le ménage");

        System.out.println("***************************************************");
        System.out.println("Ma toDoList5 : " + toDoList5);
        System.out.println("Nombre de tâches : " + toDoList5.size());
        System.out.println("Ma première tâche : " + toDoList5.peek());
        System.out.println("***************************************************");

        for(int i = 0; i <= toDoList5.size(); i++){
            //     toDoList.poll();
//            toDoList.pop();
            toDoList5.pollLast();
            System.out.println("Ma toDoList après la suppression du 1er: " + toDoList5);
            System.out.println("Nombre de tâches : " + toDoList5.size());
            System.out.println("***************************************************");
        }
//        toDoList.poll();
        //  toDoList.pop();
        toDoList5.pollLast();
        System.out.println("Ma toDoList après la suppression du 1er: " + toDoList5);
        System.out.println("Nombre de tâches : " + toDoList5.size());

        /************************************************************************************/

        //ESSAI AVEC PRIORITY QUEUE - Les éléments se mettent dans le désordre !!

        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("*************** PRIORITY QUEUE **************");
        System.out.println("");
        System.out.println("***************************************************");

        PriorityQueue<String> toDoList2 = new PriorityQueue<String>();

        toDoList2.add("Trouver un logement");
        toDoList2.add("Déménager");
        toDoList2.add("récupérer les enfants");
        toDoList2.add("Faire les courses" );
        toDoList2.add("Faire le ménage");

        System.out.println("***************************************************");
        System.out.println("Ma toDoList2 : " + toDoList2);
        System.out.println("Nombre de tâches : " + toDoList2.size());
        System.out.println("Ma première tâche : " + toDoList2.element());
        System.out.println("***************************************************");

        for(int i = 0; i < toDoList2.size(); i++){
            toDoList2.poll();
            System.out.println("Ma toDoList2 après la suppression du 1er: " + toDoList2);
            System.out.println("Nombre de tâches : " + toDoList2.size());
            System.out.println("***************************************************");
        }

        toDoList2.poll();
        System.out.println("Ma toDoList2 après la suppression du 1er: " + toDoList2);
        System.out.println("Nombre de tâches : " + toDoList2.size());

    }


}