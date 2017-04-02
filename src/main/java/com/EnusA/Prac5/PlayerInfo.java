package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class PlayerInfo implements Prototyper{
    private String playerName;
    private String job;
    private int level;
    private int strength;
    private int defence;
    private int stamina;
    private int vitality;
    private int accuracy;
    private int intelligence;

    public PlayerInfo(){};

    public PlayerInfo(String nm, String jb, int lvl, int str, int def, int stm, int vit, int acc, int iq){
        playerName = nm;
        job = jb;
        level = lvl;
        strength = str;
        defence = def;
        stamina = stm;
        vitality = vit;
        accuracy = acc;
        intelligence = iq;
    }

    public Prototyper cloneIt() {
        return new PlayerInfo(playerName, job, level, strength, defence, stamina, vitality, accuracy, intelligence);
    }

    public String myString(){
        return "This players information is:\nPlayer Name:" + playerName + "\nJob: " + job + "\nLevel:" + level +
                "\nStrength: " + strength + "\nDefence: " + defence + "\nStamina: " + stamina + "\nVitality:" +
                vitality + "\nAccuracy: " + accuracy + "\nIntelligence: " + intelligence;
    }
}
