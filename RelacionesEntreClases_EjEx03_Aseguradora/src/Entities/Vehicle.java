/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.Color;
import Enums.Type;
import java.time.LocalDate;

/**
 *
 * @author nohyv
 */
public class Vehicle {
    private String make;
    private String model;
    private LocalDate year;
    private long engineNumber;
    private long chassisNumber;
    private Color color;
    private Type type;
    
    //Constructors
    public Vehicle() {
    }

    public Vehicle(String make, String model, LocalDate year, long engineNumber, long chassisNumber, Color color, Type type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.engineNumber = engineNumber;
        this.chassisNumber = chassisNumber;
        this.color = color;
        this.type = type;
    }
    
    //Getters&Setters
    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public long getEngineNumber() {
        return engineNumber;
    }

    public void setEngineNumber(long engineNumber) {
        this.engineNumber = engineNumber;
    }

    public long getChassisNumber() {
        return chassisNumber;
    }

    public void setChassisNumber(long chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
    
    //toString
    @Override
    public String toString() {
        return "Vehicle{" + 
                "make=" + make + 
                ", model=" + model + 
                ", year=" + year + 
                ", engineNumber=" + engineNumber + 
                ", chassisNumber=" + chassisNumber + 
                ", color=" + color + 
                ", type=" + type + 
                '}';
    }
    
}
