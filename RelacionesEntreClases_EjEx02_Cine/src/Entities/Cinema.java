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
public class Cinema {
    private Movie movie;
    private Seat[][] hall;
    private double ticketCost;
    
    //Constructors
    public Cinema() {
    }

    public Cinema(Movie movie, Seat[][] hall, double ticketCost) {
        this.movie = movie;
        this.hall = hall;
        this.ticketCost = ticketCost;
    }
    
    //Getters&Setters
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Seat[][] getHall() {
        return hall;
    }

    public void setHall(Seat[][] hall) {
        this.hall = hall;
    }

    public double getTicketCost() {
        return ticketCost;
    }

    public void setTicketCost(double ticketCost) {
        this.ticketCost = ticketCost;
    }
    
    //toString
    @Override
    public String toString() {
        return "Cinema{" + "movie=" + movie + ", hall=" + hall + ", ticketCost=" + ticketCost + '}';
    }
    
}
