package fr.m2i.formation.model;

public class Personnage {
    //Attributs
    private int age;
    private int taille;
    private String nom;

    private String prenom;

    private static int instance;

    static {
        instance = 0;
    }

//CONSTRUCTEURS
    public Personnage() {
        Personnage.instance++;
    }

    public Personnage(int age, int taille, String nom, String prenom) {
        this.age = age;
        this.taille = taille;
        this.nom = nom;
        this.prenom = prenom;
        Personnage.instance++;
    }

    //AJOUT NOUVELLE FONCTIONNALITE AFIN DE RECUPERER LE NOMBRE D'INSTANCE
    public static int getNbeInstance(){
        return instance;
    }

    public static void setNbeInstance(int instance){
        Personnage.instance = instance;
    }

    //GETTER ET SETTER
    public int getAge() {
        return age;
    }

    public int getTaille() {
        return taille;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTaille(int taille) {
        this.taille = taille;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public static void setInstance(int instance) {
        Personnage.instance = instance;
    }

    public static int getInstance() {
        return instance;
    }

    //Methodes diverses
    public void sayHello(){
        System.out.println("Hello " + nom);
    }

    public void sayName(){
        System.out.println(nom);
    }
    public void sayAge(){
        System.out.println(age);
    }


}
