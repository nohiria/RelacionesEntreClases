/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Cinema;
import Entities.Movie;
import Entities.Moviegoer;
import Entities.Seat;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author nohyv
 */
public class CinemaService {
    private Cinema cinema;
    private Scanner input;
    
    //Constructor
    public CinemaService() {
        cinema= new Cinema();
        input= new Scanner(System.in);
    }
    
    public void createCinema(){
        cinema.setMovie(enterMovie());
        cinema.setHall(createHall());
        System.out.println("Enter the ticket price");
        cinema.setTicketCost(Double.parseDouble(input.nextLine()));
    }
    
    public Movie enterMovie(){
        Movie movie= new Movie();
        System.out.println("MOVIE:");
        System.out.println("Enter the movie title:");
        movie.setTitle(input.nextLine());
        System.out.println("How long does the movie last (in minutes)?");
        movie.setDurationMinutes(Integer.parseInt(input.nextLine()));
        System.out.println("Enter the minimum age required for the movie:");
        movie.setMinimunAge(Integer.parseInt(input.nextLine()));
        System.out.println("Enter the name of the film's director:");
        movie.setDirector(input.nextLine());
        return movie;
    }
    
    public Seat[][] createHall(){
        Seat [][] hall= new Seat[8][6];
        for(int r=0; r<8; r++){
            for(int c=0; c<6; c++){
                Seat s= new Seat();
                String row= String.valueOf(8-r);
                String column= "";
                switch(c){
                    case 0:
                        column= "A";
                        break;
                    case 1:
                        column= "B";
                        break;
                    case 2:
                        column= "C";
                        break;
                    case 3:
                        column= "D";
                        break;
                    case 4:
                        column= "E";
                        break;
                    case 5:
                        column= "F";

                        break;
                }
                s.setCode(column+row);
                hall[r][c]= s;
            }
        }
        return hall;
    }
    
    public void showHall(){
        System.out.println("_________________________________");
        System.out.println(cinema.getMovie().toString());
        System.out.println("_________________________________");
        for (Seat[] row : cinema.getHall()) {
            for (Seat s : row) {
                System.out.print(s.toString() + " ");
            }
            System.out.println();
        }
    }
    
    // <editor-fold desc="Moviegoer Service: potencialMoviegoerList and createMoviegoer">
    public ArrayList<Moviegoer> potentialMoviegoersList(){
        ArrayList<Moviegoer> moviegoersList= new ArrayList<>();
        String response= "y";
        int customerCounter= 0;
        do{
            customerCounter++;
            System.out.println("Client "+customerCounter+":");
            moviegoersList.add(createMoviegoer());
            System.out.println("Do you want to add another client? (Enter 'y' for yes):");
        }while(response.equalsIgnoreCase("y"));
        return moviegoersList; 
    }
    
    public Moviegoer createMoviegoer(){
        Moviegoer moviegoer= new Moviegoer();
        System.out.println("Enter customer´s name");
        moviegoer.setName(input.nextLine());
        System.out.println("Enter the customer´s age");
        moviegoer.setAge(Integer.parseInt(input.nextLine()));
        System.out.println("How much money does the customer have available?");
        moviegoer.setMoney(Double.parseDouble(input.nextLine()));
        return moviegoer;
    }
    // </editor-fold>
    
    
}
    
    
