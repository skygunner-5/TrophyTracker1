package com.company.views;

import java.util.Scanner;

public class CmdLineView {
    private static String psnID;

    public CmdLineView() {
    }

    public String GetID(){
        System.out.println("Welcome to the Trophy Tracker App.");
        System.out.println("Please enter your PlayStation Network ID: ");
        Scanner input = new Scanner(System.in);
        return input.next();
    }
}
