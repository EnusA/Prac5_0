package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public abstract class MenuHandler {
    MenuHandler menuItem;

    public void setMenuItem(MenuHandler menuItem){
        this.menuItem = menuItem;
    }
    public abstract void doRequest(MenuEnum menuRequest);
}
