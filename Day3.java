/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day3;

import static day3.Car.getCar;

/**
 *
 * @author ASUS
 */
public class Day3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   /* Car thayHaCar=new Car(4, "Honda");
        System.out.println(thayHaCar.startEngine());
        System.out.println(thayHaCar.accelarate());
    System.out.println(thayHaCar.brake());
    Mitsubishi myCar=new Mitsubishi(4,"Outlander");
    System.out.println(myCar.startEngine());
    System.out.println(myCar.accelarate());
    System.out.println(myCar.brake());*/
  
        Car newCar;
        newCar=getCar();
        System.out.println(newCar.startEngine());
        System.out.println(newCar.accelarate());
        System.out.println(newCar.brake());
   }
    
   }
    

