package com.EnusA.Prac5;

import java.util.Scanner;

/**
 * Created by enusa on 2017/04/02.
 */
public class CreatePlayerHandler extends MenuHandler {

    private String playerName;
    private String job;
    private int level;
    private int strength;
    private int defence;
    private int stamina;
    private int vitality;
    private int accuracy;
    private int intelligence;

    public void doRequest(MenuEnum menuRequest) {
        if (menuRequest == MenuEnum.CreatePlayer) {
            System.out.println("PassiveHandler accepts request, " + menuRequest);

            Scanner scan = new Scanner(System.in);

            System.out.println("Please enter a name for you character: ");
            playerName = scan.next();
            System.out.println("Please enter a Job for your character: ");
            job = scan.next();
            System.out.println("Please enter your characters level: ");
            level = scan.nextInt();
            System.out.println("Please enter your characters strength: ");
            strength = scan.nextInt();
            System.out.println("Please enter your characters defence: ");
            defence = scan.nextInt();
            System.out.println("Please enter your characters stamina: ");
            stamina = scan.nextInt();
            System.out.println("Please enter your characters vitality: ");
            vitality = scan.nextInt();
            System.out.println("Please enter your characters accuracy: ");
            accuracy = scan.nextInt();
            System.out.println("Please enter your characters intelligence: ");
            intelligence = scan.nextInt();

            PlayerList players = new PlayerList();
            players.players.add(new PlayerInfo(playerName, job, level, strength, defence, stamina, vitality, accuracy,
                    intelligence));
        } else {
            System.out.println("PassiveHandler could not accept reuquest" + menuRequest);
            if (menuRequest != null) {
                System.out.println("Sending request to next Handler");
                menuItem.doRequest(menuRequest);
            }
        }
    }
}