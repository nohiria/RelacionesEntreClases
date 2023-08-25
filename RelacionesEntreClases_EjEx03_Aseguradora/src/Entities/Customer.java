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
public class Customer {
    private String firstName;
    private String lastName;
    private int id;
    private String email;
    private String address;
    private long phoneNumber;
    
    //Constructors
    public Customer() {
    }

    public Customer(String firstName, String lastName, int id, String email, String address, long phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }
    
    //Getters&Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //toString
    @Override
    public String toString() {
        return "Customer{" +
                "firstName=" + firstName + 
                ", lastName=" + lastName + 
                ", id=" + id + 
                ", email=" + email + 
                ", address=" + address + 
                ", phoneNumber=" + phoneNumber + 
                '}';
    }
    
    public String fullNameToString(){
        return "Customer{" +
                "fullname=" + firstName + " " + lastName + 
                '}';
    }
}
