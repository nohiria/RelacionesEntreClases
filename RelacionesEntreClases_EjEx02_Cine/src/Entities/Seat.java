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
 * Represents a seat in a movie theater, which can be occupied by a moviegoer.
 * 
 */
public class Seat {
    private String code;
    private Moviegoer moviegoer;
    
    //Constructors
    public Seat() {
    }

    public Seat(String code, Moviegoer moviegoer) {
        this.code = code;
        this.moviegoer = moviegoer;
    }
    
    //Getters&Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Moviegoer getMoviegoer() {
        return moviegoer;
    }

    public void setMoviegoer(Moviegoer moviegoer) {
        this.moviegoer = moviegoer;
    }
    
    //toString

    @Override
    public String toString() {
        String location= code;
        String availability= (moviegoer==null) ? "   |" : " X |";
        return location+availability;
    }
    
}
