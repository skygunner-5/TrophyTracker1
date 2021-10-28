package com.company.controllers;

import com.company.models.Games;
import com.company.views.CmdLineView;

import java.sql.*;
import java.util.ArrayList;

public class DBConnect {

    private String dbName;
    private String url;


    public DBConnect(String dbName) {
        this.dbName = dbName;
        this.url = "jdbc:sqlite:C:/sqlite/db/" + dbName;
    }

    public void createNewDatabase(){

        try(Connection conn = DriverManager.getConnection(url)) {
            if(conn != null) {
                DatabaseMetaData meta = conn.getMetaData();
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void addTables(){

        String sql = "CREATE TABLE IF NOT EXISTS games (\n"
                + " id integer PRIMARY KEY, \n"
                + "title text NOT NULL, \n"
                + "genre text NOT NULL, \n"
                + "dateCompleted text NOT NULL, \n"
                + "numGold integer NOT NULL, \n"
                + "numSilver integer NOT NULL, \n"
                + "numBronze integer NOT NULL"
                + ");";

        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void addData(){
        CmdLineView view = new CmdLineView(true);
        String title = view.getTitle();
        String genre = view.getGenre();
        String dateCompleted = view.getDateCompleted();;
        int numGold = view.getNumGold();
        int numSilver = view.getNumSilver();
        int numBronze = view.getNumBronze();

        String sql = "INSERT INTO games(title, genre, dateCompleted, numGold, numSilver, numBronze) VALUES ('" + title + "', '" + genre + "', '" + dateCompleted +
                                        "', '" + numGold + "', '" + numSilver + "', '" + numBronze + "');";
        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            statement.execute(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Games> getData(){
        String sql = "SELECT id, title, genre, dateCompleted, numGold, numSilver, numBronze FROM games";
        ArrayList<Games> gamesList = new ArrayList<>();

        try(Connection conn = DriverManager.getConnection(url)){
            Statement statement = conn.createStatement();
            ResultSet games = statement.executeQuery(sql);

            while(games.next())
            {
                int id = games.getInt("id");
                String title = games.getString("title");
                String genre = games.getString("genre");
                String dateCompleted = games.getString("dateCompleted");
                int numGold = games.getInt("numGold");
                int numSilver = games.getInt("numSilver");
                int numBronze = games.getInt("numBronze");
                Games game = new Games(id, title, genre, dateCompleted, numGold, numSilver, numBronze);

                gamesList.add(game);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return gamesList;
    }
}
