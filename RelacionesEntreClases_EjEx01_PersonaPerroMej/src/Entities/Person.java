/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author nohyv
 */
public class Person {
    private String name;
    private String lastname;
    private Integer age;
    private Integer dni;
    private Dog dog;
    
    //Constructor
    public Person() {
    }

    public Person(String name, String lastname, Integer age, Integer dni, Dog dog) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.dni = dni;
        this.dog = dog;
    }
    
    //Getters&Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
    
    //toString
    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", lastname=" + lastname + ", age=" + age + ", dni=" + dni + ", dog=" + dog + '}';
    }
    
}
