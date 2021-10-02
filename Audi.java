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
public class Audi extends Car
        {
    private String model;
    public Audi (int  cylinders,String model){
        super( cylinders,"Audi");
        this.model=model;
    }

    @Override
    public String brake() {
        return "Audi-"+this.model+"started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "Audi-"+this.model+"accelarating"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "Audi-"+this.model+"stopped"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
