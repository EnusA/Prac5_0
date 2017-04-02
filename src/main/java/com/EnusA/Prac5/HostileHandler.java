package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/02.
 */
public class HostileHandler extends MenuHandler{
    private String type;
    public  HostileHandler(String type){this.type = type;}
    public void doRequest(MenuEnum menuRequest){
        if  (menuRequest == MenuEnum.Hostile){
            System.out.println("PassiveHandler accepts request, " + menuRequest);
            AbstractFactory abstractFactory = new AbstractFactory();
            EntityFactory entityType = abstractFactory.getEntityFactory("Hostile");
            Entity entity = entityType.getEntity(type);
        }
        else{
            System.out.println("PassiveHandler could not accept reuquest" + menuRequest);
            if(menuRequest != null){
                System.out.println("Sending request to next Handler");
                menuItem.doRequest(menuRequest);
            }
        }
    }
}
//chain of responsibility