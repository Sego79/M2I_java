package fr.m2i.exercice1;

public class Point {

   private int x;
   private int y;

    public void initialise(int x, int y){
        this.x = x;
        this.y = y;}

   public void deplace(int dx, int dy){
        x += dy;
        y += dy;
    }

   public  int getX(){
        return x;
    }

   public int getY(){
        return y;
    }


}
