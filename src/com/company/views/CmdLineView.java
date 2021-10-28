package com.company.views;

import com.company.models.Games;

import java.util.Scanner;

public class CmdLineView {
    private String psnID;

    private boolean addGames;

    public CmdLineView(boolean addGames) { this.addGames = addGames;}

    public String GetID(){
        System.out.println("Welcome to the Trophy Tracker App.");
        System.out.println("Please enter your PlayStation Network ID: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }

    public boolean shouldAddMovies(){
        System.out.println("Would you like to add another game?(y or n): ");
        Scanner input = new Scanner(System.in);
        String shouldContinue = input.next();
        if(shouldContinue.equalsIgnoreCase("y"))
            return true;
        else
            return false;
    }

    public String getTitle(){
        System.out.println("What is the game title?: ");
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt() || input.hasNextFloat()){
            System.out.println("Error: title must be a text string!");
            System.out.println("Please enter the game title: ");
            input = new Scanner(System.in);
        }
        String titleEntry = input.nextLine();
        return titleEntry;
    }

    public String getGenre(){
        System.out.println("What is the game's genre?: ");
        Scanner input = new Scanner(System.in);
        while(input.hasNextInt() || input.hasNextFloat()){
            System.out.println("Error: genre must be a text string!");
            System.out.println("Please enter the game genre: ");
            input = new Scanner(System.in);
        }
        String genreEntry = input.nextLine();
        return genreEntry;
    }

    public String getDateCompleted(){
        System.out.println("When did you achieve the game's platinum?: ");
        Scanner input = new Scanner(System.in);
        String dateCompleted = Integer.toString(input.nextInt());
        return dateCompleted;
    }

    public int getNumGold(){
        System.out.println("How many gold trophies does the game have?: ");
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()){
            System.out.println("Error: entry must be an integer!");
            System.out.println("Please enter the number of gold trophies");
            input = new Scanner(System.in);
        }
        int numGold = input.nextInt();
        return numGold;
    }

    public int getNumSilver(){
        System.out.println("How many silver trophies does the game have?: ");
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()){
            System.out.println("Error: entry must be an integer!");
            System.out.println("Please enter the number of silver trophies");
            input = new Scanner(System.in);
        }
        int numSilver = input.nextInt();
        return numSilver;
    }

    public int getNumBronze(){
        System.out.println("How many bronze trophies does the game have?: ");
        Scanner input = new Scanner(System.in);
        while(!input.hasNextInt()){
            System.out.println("Error: entry must be an integer!");
            System.out.println("Please enter the number of bronze trophies");
            input = new Scanner(System.in);
        }
        int numBronze = input.nextInt();
        return numBronze;
    }

    public boolean isAddGames() {
        return addGames;
    }

    public void setAddGames(boolean addGames) {
        this.addGames = addGames;
    }
}
