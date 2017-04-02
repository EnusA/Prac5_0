package com.EnusA.Prac5;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by enusa on 2017/04/02.
 */
public class HostileMob extends Entity implements Stats{
    private String name;
    private int hp;
    String dropItem;
    private ArrayList<String> drops = new ArrayList();
    private int strength = 0;
    private String mobSound;

    public HostileMob(String nm, int health, int str){
        name = nm;
        hp= health;
        strength = str;
    }

    public void addDrop(String drp){
        drops.add(dropItem);
    }

    public int dps(){
        double min = strength - (strength * 0.3);
        int minDamage = (int)min;
        Random damage = new Random();
        return damage.nextInt(strength) + Integer.valueOf(minDamage);
    }

    @Override
    public String makeSound() {
        return mobSound;
    }

    public void statistics() {
        System.out.println("Mob Name: " + name + "\nMob HP: " + hp + "\nStrength" + strength);
        for (int i = 0; i < drops.size(); i++)
            System.out.println("Item Drop: " + drops);
    }
}
//Abstract Factory and bridge