/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ass4;

/**
 *
 * @author JEAN-PAUL
 */
public class BMW extends Car{
    private String carType;
    public BMW(){
        carType = "BMW 1 series";
    }
    
    public String getCarType(){
        return carType;
    }
    
    public String carDetails(){
        return "Wheelsize: " + getWheelSize() +"country: "+ getCountry() + " CarType:"+carType;
    }
}
