package com.company.controllers;

import com.company.models.Games;
import com.company.models.Players;
import com.company.views.CmdLineView;

import java.util.ArrayList;

public class Main {

    private static CmdLineView view;

    public static void main(String[] args) {

        String psnID;
        view = new CmdLineView(true);
        psnID = view.GetID();
        Players player = new Players(psnID);

        DBConnect db = new DBConnect("games.db");
        db.createNewDatabase();
        db.addTables();

        while(view.isAddGames()){
            if(view.shouldAddMovies()) {
                view.setAddGames(true);
                db.addData();
            }
            else
                view.setAddGames(false);
        }

        ArrayList<Games> theGames = db.getData();
        player.setNumPlats(theGames.size());
        view.displayLabels(player);
        int totalTrophies;
        for(Games game : theGames){
            totalTrophies = (game.getNumGold() + game.getNumSilver() + game.getNumBronze());
            System.out.println(game.toString());
        }
    }
}
