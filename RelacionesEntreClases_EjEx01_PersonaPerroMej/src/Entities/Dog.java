/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.Breed;
import Enums.Size;

/**
 *
 * @author nohyv
 */
public class Dog {
    private String name;
    private Breed breed;
    private Integer age;
    private Size size;
    private boolean adopted;
    
    //Constructor
    public Dog() {
    }

    public Dog(String name, Breed breed, Integer age, Size size, boolean adopted) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
        this.adopted = adopted;
    }
    
    //Getters&Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public boolean isAdopted() {
        return adopted;
    }

    public void setAdopted(boolean adopted) {
        this.adopted = adopted;
    }
    
    //toString

    @Override
    public String toString() {
        return "Dog{" + "name=" + name + ", breed=" + breed + ", age=" + age + ", size=" + size + ", adopted=" + adopted + '}';
    }
    
}
