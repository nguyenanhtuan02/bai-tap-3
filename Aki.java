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
public class Aki extends Car
        {
    private String model;
    public Aki (int  cylinders,String model){
        super( cylinders,"Aki");
        this.model=model;
    }

    @Override
    public String brake() {
        return "Aki -"+this.model+"started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "Aki -"+this.model+"accelarating"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "Aki -"+this.model+"stopped"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
