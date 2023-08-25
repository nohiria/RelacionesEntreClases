/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import Enums.CoverageType;
import Enums.PaymentMethod;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author nohyv
 */
public class Policy {
    private long policyNumber;
    private Customer customer;
    private Vehicle vehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private int installmentCount;
    private PaymentMethod payment;
    private double totalInsuredAmount;
    private boolean hailCoverage;
    private double maxHailCoverageAmount;
    private CoverageType type;
    private ArrayList<Installment> installments;
    
    //Constructors
    public Policy() {
    }

    public Policy(long policyNumber, Customer customer, Vehicle vehicle, LocalDate startDate, LocalDate endDate, int installmentCount, PaymentMethod payment, double totalInsuredAmount, boolean hailCoverage, double maxHailCoverageAmount, CoverageType type, ArrayList<Installment> installments) {
        this.policyNumber = policyNumber;
        this.customer = customer;
        this.vehicle = vehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.installmentCount = installmentCount;
        this.payment = payment;
        this.totalInsuredAmount = totalInsuredAmount;
        this.hailCoverage = hailCoverage;
        this.maxHailCoverageAmount = maxHailCoverageAmount;
        this.type = type;
        this.installments = installments;
    }
    
    //Getters&Setters
    public long getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(long policyNumber) {
        this.policyNumber = policyNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getInstallmentCount() {
        return installmentCount;
    }

    public void setInstallmentCount(int installmentCount) {
        this.installmentCount = installmentCount;
    }

    public PaymentMethod getPayment() {
        return payment;
    }

    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    public double getTotalInsuredAmount() {
        return totalInsuredAmount;
    }

    public void setTotalInsuredAmount(double totalInsuredAmount) {
        this.totalInsuredAmount = totalInsuredAmount;
    }

    public boolean isHailCoverage() {
        return hailCoverage;
    }

    public void setHailCoverage(boolean hailCoverage) {
        this.hailCoverage = hailCoverage;
    }

    public double getMaxHailCoverageAmount() {
        return maxHailCoverageAmount;
    }

    public void setMaxHailCoverageAmount(double maxHailCoverageAmount) {
        this.maxHailCoverageAmount = maxHailCoverageAmount;
    }

    public CoverageType getType() {
        return type;
    }

    public void setType(CoverageType type) {
        this.type = type;
    }

    public ArrayList<Installment> getInstallments() {
        return installments;
    }

    public void setInstallments(ArrayList<Installment> installments) {
        this.installments = installments;
    }
    
    public void addInstallments(Installment i){
        installments.add(i);
    }
    
    //toString

    @Override
    public String toString() {
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
//        StringBuilder installmentsStr = new StringBuilder();
//        for(int i=0; i<installments.size(); i++){
//            if(i>0){
//                installmentsStr.append(", ");
//            }
//            installmentsStr.append(installments.get(i).toString());
//        }

        return "Policy{" + 
                "policyNumber=" + policyNumber + 
                ", customer=" + customer.fullNameToString() +
                ", startDate=" + startDate.format(dateFormatter) + 
                ", endDate=" + endDate.format(dateFormatter) + 
                ", installmentCount=" + installmentCount + 
                ", payment=" + payment + 
                ", totalInsuredAmount=" + totalInsuredAmount + 
                ", hailCoverage=" + hailCoverage + 
                ", maxHailCoverageAmount=" + maxHailCoverageAmount + 
                ", type=" + type + 
                ", installments=" + Arrays.toString(installments.toArray()) + '}';
    }
    
}
