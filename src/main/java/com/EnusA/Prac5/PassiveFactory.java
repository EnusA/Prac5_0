package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class PassiveFactory extends EntityFactory{
    private String name;
    private int hp;
    private String dialogue;
    private String type;
    @Override
    public Entity getEntity(String type) {
        if("Passive".equals(type)) {
            this.type = type;
            return new PassiveMob(name, hp);
        }
        else if("NPC".equals(type)) {
            this.type = type;
            return new NPC(name, hp, dialogue);
        }
        else{this.type = type;
            return null;}
    }
}

//Abstract Factory and bridge