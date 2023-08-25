/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.PaymentMethod;
import java.time.LocalDate;

/**
 *
 * @author nohyv
 */
public class Installment {
    private int number;
    private double totalAmount;
    private boolean paid;
    private LocalDate dueDate;
    private PaymentMethod payment;
    
    //Constructors
    public Installment() {
    }

    public Installment(int number, double totalAmount, boolean paid, LocalDate dueDate, PaymentMethod payment) {
        this.number = number;
        this.totalAmount = totalAmount;
        this.paid = paid;
        this.dueDate = dueDate;
        this.payment = payment;
    }
    
    //Getters&Setters
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }
    
    //toString
    @Override
    public String toString() {
        return "Installment{" + 
                "number=" + number + 
                ", totalAmount=" + totalAmount + 
                ", paid=" + paid + 
                ", dueDate=" + dueDate + 
                ", payment=" + payment + 
                '}';
    }
    
}
