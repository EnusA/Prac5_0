package com.EnusA.Prac5;

import java.util.ArrayList;

/**
 * Created by enusa on 2017/04/02.
 */
public class NPC extends Entity implements Stats{
    private String name;
    private int hp;
    private String dialogue;
    private String mobSound;

    String dropItem;
    private ArrayList<String> drops = new ArrayList();

    public NPC(String nm, int health, String log){
        name = nm;
        hp= health;
        dialogue = log;
    }

    public void addDrop(String drp){
        drops.add(dropItem);
    }

    @Override
    public String makeSound() {
        return mobSound;
    }

    public void statistics() {
        System.out.println("Mob Name: " + name + "\nMob HP: " + hp);
        for (int i = 0; i < drops.size(); i++)
            System.out.println("Item Drop: " + drops);
    }
}
