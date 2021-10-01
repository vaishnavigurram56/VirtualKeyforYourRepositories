package org.example.companylocker.services;

import org.example.companylocker.screens.FileOptionsScreen;
import org.example.companylocker.screens.Screen;
import org.example.companylocker.screens.WelcomeScreen;


public class ScreenService {

	public static WelcomeScreen WelcomeScreen = new WelcomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();



    public static Screen CurrentScreen = WelcomeScreen;

    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }

    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }

}
