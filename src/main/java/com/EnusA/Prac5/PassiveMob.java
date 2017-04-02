package com.EnusA.Prac5;

import java.util.ArrayList;

/**
 * Created by enusa on 2017/04/02.
 */
public class PassiveMob extends Entity implements Stats{
    private String name;
    private int hp;
    private String mobSound;

    String dropItem;
    private ArrayList<String> drops = new ArrayList();

    public PassiveMob(String nm, int health){
        name = nm;
        hp= health;
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
