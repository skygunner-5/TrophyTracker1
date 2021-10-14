package com.company.models;

public class Players {

    private String psnID;
    private int numPlats;

    private int numTrophies;

    public Players(String psnID, int numPlats, int numTrophies) {
        this.psnID = psnID;
        this.numPlats = numPlats;
        this.numTrophies = numTrophies;
    }

    public String getPsnID() {
        return psnID;
    }

    public void setPsnID(String psnID) {
        this.psnID = psnID;
    }

    public int getNumPlats() {
        return numPlats;
    }

    public void setNumPlats(int numPlats) {
        this.numPlats = numPlats;
    }

    public int getNumTrophies() {
        return numTrophies;
    }

    public void setNumTrophies(int numTrophies) {
        this.numTrophies = numTrophies;
    }
}
