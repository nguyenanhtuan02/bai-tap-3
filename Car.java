/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

/**
 *
 * @author ASUS
 */
public class Car {
    private boolean engine ;
    private int cylinders ;
    private String name;
    private int wheel;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine=true;
        this.wheel=4;
    }
  
    
 public   String startEngine(){
     return "Car is started";
 }
    public String accelarate(){
        return "Car is accelarating";
    }
    
    public String brake()
    {
        return "Car stopped";
    }
     public static Car getCar()
   {
       System.out.println("Randomly pick a car ");
       int i=(int)(Math.random() * 4+ 1);
       switch(i)
       {
           case 1:
               return new Mitsubishi(4," Outlander");
           case 2:
               return new Toyota1(6," Crown");
           case 3:
               return new Aki(6," Sorento ");
           case 4:
               return new Audi(6," A4 ");
       }
    return null;

}

}