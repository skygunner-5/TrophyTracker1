package com.company.models;

public class Games {

    private int id;
    private String title;
    private String genre;
    private String dateCompleted;
    public int numGold;
    public int numSilver;
    public int numBronze;


    public Games(int id, String title, String genre, String dateCompleted, int numGold, int numSilver, int numBronze) {
        this.title = title;
        this.genre = genre;
        this.dateCompleted = dateCompleted;
        this.numGold = numGold;
        this.numSilver = numSilver;
        this.numBronze = numBronze;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDateCompleted() {
        return dateCompleted;
    }

    public void setDateCompleted(String dateCompleted) {
        this.dateCompleted = dateCompleted;
    }

    public int getNumGold() {
        return numGold;
    }

    public void setNumGold(int numGold) {
        this.numGold = numGold;
    }

    public int getNumSilver() {
        return numSilver;
    }

    public void setNumSilver(int numSilver) {
        this.numSilver = numSilver;
    }

    public int getNumBronze() {
        return numBronze;
    }

    public void setNumBronze(int numBronze) {
        this.numBronze = numBronze;
    }

    @Override
    public String toString(){
        return title + " " + genre + " " + dateCompleted + " " + numGold + " " + numSilver + " " + numBronze;
    }
}
