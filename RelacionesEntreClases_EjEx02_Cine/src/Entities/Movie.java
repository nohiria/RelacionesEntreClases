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
 * Represents a movie with details such as title, duration, minimum age and director.
 * 
 */
public class Movie {
    private String title;
    private int durationMinutes;
    private int minimunAge;
    private String director;
    
    //Constructors
    public Movie() {
    }

    public Movie(String title, int durationMinutes, int minimunAge, String director) {
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.minimunAge = minimunAge;
        this.director = director;
    }
    
    //Getters&Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public int getMinimunAge() {
        return minimunAge;
    }

    public void setMinimunAge(int minimunAge) {
        this.minimunAge = minimunAge;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    //toString
    @Override
    public String toString() {
        return "Movie{" + 
                "title=" + title + 
                ", durationMinutes=" + durationMinutes +
                ", minimunAge=" + minimunAge +
                ", director=" + director +
                '}';
    }
    
}
