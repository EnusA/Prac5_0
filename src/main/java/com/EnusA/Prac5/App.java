package com.EnusA.Prac5;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {

    public static String type;

    public static void main( String[] args )
    {
        MenuHandler chain = chainOfEvents();
        int option = 0;
        Scanner scan = new Scanner(System.in);
        String username;
        String password;
        System.out.println("Please enter your username");
        username = scan.next();
        System.out.println("Please enter your password");
        password = scan.next();
        Authenticate login = Authenticate.getAuthenticate(username,password);
        login.authenticate();

        menu();
        option = scan.nextInt();
        switch (option){
            case 1:

                chain.doRequest(MenuEnum.PassiveOrNPC);
                type = "Passive";
                break;
            case 2:
                chain.doRequest(MenuEnum.PassiveOrNPC);
                type = "NPC";
                break;
            case 3:
                chain.doRequest(MenuEnum.Hostile);
                type = "Hostile";
                break;
            case 4:
                chain.doRequest(MenuEnum.CreatePlayer);
                break;
            default:
                System.out.println("Saving Game");
                SaveGame newSave = new SaveGame("Updated","Game Data",5,10,15,20,25,
                        30,35);
                break;
        }
    }


    public static MenuHandler chainOfEvents()
    {

        MenuHandler passiveHandler = new PassiveHandler(type);
        MenuHandler hostileHandler = new HostileHandler(type);
        MenuHandler createPlayerHandler = new CreatePlayerHandler();

        passiveHandler.setMenuItem(hostileHandler);
        hostileHandler.setMenuItem(createPlayerHandler);

        return passiveHandler;
    }

    public static void menu(){
        System.out.println("Welcome to the game version pre-pre-pre-alpha\nSelect " +
                "rom the options below to get started\n1.Create new Passive Mob" +
                "\n2.Create new Hostile Mob\n3.Create new NPC\n4.Create new Player Character" +
                "\n5.Exit");
    }
}
