package org.example.com;

import org.example.companylocker.entities.*;
import org.example.companylocker.screens.WelcomeScreen;
import org.example.companylocker.services.DirectoryService;
import org.example.companylocker.services.ScreenService;

import java.util.Optional;

public class companylockerApplication {

    public static void main(String[] args) {

    	//Vaishnavi_gurram
    	WelcomeScreen welcome = new WelcomeScreen();
    	welcome.Show();
    	welcome.GetUserInput();
        DirectoryService.PrintFiles();
        //WelcomeScreen screen = new WelcomeScreen();

        //ScreenService.getCurrentScreen().Show();
        ScreenService.getCurrentScreen().GetUserInput();

    }
}