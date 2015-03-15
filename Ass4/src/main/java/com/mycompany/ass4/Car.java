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
public class Car {
    private int wheelSize;
    private String engine;
    private String country;
    
    Car(){
        country = "Germany";
        wheelSize= 19;
    }
    
    public int getWheelSize(){
        return wheelSize;
    }
    public String getCountry(){
        return country;
    }
}
