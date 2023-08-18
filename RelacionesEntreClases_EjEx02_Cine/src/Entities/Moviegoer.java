/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author nohyv
 * 
 * Represents a moviegoer with details such as name, age, and available money.
 * 
 */
public class Moviegoer {
    private String name;
    private int age;
    private double money;
    
    //Constructors
    public Moviegoer() {
    }

    public Moviegoer(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }
    
    //Getters&Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
    
    //toString
    @Override
    public String toString() {
        return "Moviegoer{" + 
                "name=" + name +
                ", age=" + age + 
                ", money=" + money +
                '}';
    }
    
}
