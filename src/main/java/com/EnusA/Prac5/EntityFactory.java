package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public abstract class EntityFactory {
    public abstract Entity getEntity(String type);
    Stats stats;
    public void setStats(Stats stats){this.stats = stats;}
}
