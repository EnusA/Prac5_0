package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class AbstractFactory {
    public EntityFactory getEntityFactory(String type){
        if("Passive".equals(type))
            return new PassiveFactory();
        else
            return new HostileFactory();
    }
}
