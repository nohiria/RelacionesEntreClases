/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Dog;
import Entities.Person;
import Enums.Breed;
import Enums.Size;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author nohyv
 */
public class DPService {
    private ArrayList<Person> peopleList;
    private ArrayList<Dog> dogList;
    private Scanner input;

    public DPService() {
        this.peopleList = new ArrayList<>();
        this.dogList = new ArrayList<>();
        this.input= new Scanner(System.in);
    }
    
    public void createPerson(){
        Person person= new Person();
        System.out.println("New person");
        System.out.println("Enter the name");
        person.setName(input.nextLine());
        System.out.println("Enter the lastname");
        person.setLastname(input.nextLine());
        System.out.println("Enter the age");
        person.setAge(Integer.parseInt(input.nextLine()));
        System.out.println("Enter the ID");
        person.setId(Integer.parseInt(input.nextLine()));
    }
    
    public void createDog(){
        Dog dog= new Dog();
        System.out.println("New dog");
        System.out.println("Enter the name");
        dog.setName(input.nextLine());
        dog.setBreed(breedMenu());
        System.out.println("Enter the age");
        dog.setAge(Integer.parseInt(input.nextLine()));
        dog.setSize(sizeMenu());
    }
    
    private Breed breedMenu(){
        System.out.println("Select the breed");
        System.out.println("1. BEAGLE");
        System.out.println("2. COCKER");
        System.out.println("3. PITBULL");
        System.out.println("4. DALMATA");
        System.out.println("5. BORDER COLLIE");
        System.out.println("6. MONGREL");
        System.out.println("7. OTHER");
        int option= Integer.parseInt(input.nextLine());
        Breed selectedBreed = null;
        switch(option){
            case 1:
                selectedBreed= Breed.BEAGLE;
                break;
            case 2:
                selectedBreed= Breed.COCKER;
                break;
            case 3:
                selectedBreed= Breed.PITBULL;
                break;
            case 4:
                selectedBreed= Breed.DALMATA;
                break;
            case 5: 
                selectedBreed= Breed.BORDER_COLLIE;
                break;
            case 6:
                selectedBreed= Breed.MONGREL;
                break;
            case 7:
                selectedBreed= Breed.OTHER;
        }
        return selectedBreed;
    }
    
    private Size sizeMenu(){
        System.out.println("Select the size");
        System.out.println("1. BIG");
        System.out.println("2. MEDIUM");
        System.out.println("3. SMALL");
        int option= Integer.parseInt(input.nextLine());
        Size selectedSize= null;
        switch(option){
            case 1:
                selectedSize= Size.BIG;
                break;
            case 2:
                selectedSize= Size.MEDIUM;
                break;
            case 3:
                selectedSize= Size.SMALL;
                break;
        }
        return selectedSize;
    }
    
    }
    
