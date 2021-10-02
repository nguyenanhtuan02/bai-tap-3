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
public class Toyata extends Car
        {
    private String model;
    public Toyata (int  cylinders,String model){
        super( cylinders,"Mitsubishi");
        this.model=model;
    }

    @Override
    public String brake() {
        return "Toyota-"+this.model+"started"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String accelarate() {
        return "Toyota-"+this.model+"accelarating"; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String startEngine() {
        return "Toyota-"+this.model+"stopped"; //To change body of generated methods, choose Tools | Templates.
    }
    
}
