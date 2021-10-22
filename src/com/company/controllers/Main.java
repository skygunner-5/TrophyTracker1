package com.company.controllers;

import com.company.models.Players;
import com.company.views.CmdLineView;

public class Main {

    private static CmdLineView view;

    public static void main(String[] args) {

        String psnID;
        psnID = view.GetID();
        Players player = new Players(psnID);

    }
}
