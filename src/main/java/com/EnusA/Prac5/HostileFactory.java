package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class HostileFactory extends EntityFactory{
    private String name;
    private int hp;
    private int strength;
    @Override
    public Entity getEntity(String type) {
        if("Hostile".equals(type))
            return new HostileMob(name, hp, strength);
        else
            return null;
    }
}
