package com.EnusA.Prac5;

import java.util.ArrayList;

/**
 * Created by enusa on 2017/04/01.
 */
public class Users {
    private String username;
    private String password;
    public Users(){};

    public Users(String user, String pass){
        username = user;
        password = pass;
    }
    private ArrayList<Users> usersList= new ArrayList();

    public void generateUserList(){

        usersList.add(new Users("Dullahan","1101011"));
        usersList.add(new Users("iskall85","8585458"));
        usersList.add(new Users("XisumaVoid","1098056"));
        usersList.add(new Users("Rendog","7845698"));
        usersList.add(new Users("FalseSymmetry","Le45789"));
        usersList.add(new Users("Mumbo","dio96584"));
        usersList.add(new Users("Jackhammer","20136as"));
        usersList.add(new Users("gamekop","hen7890"));
        usersList.add(new Users("Arleax","mask57s"));
        usersList.add(new Users("teshyIsCool","365b00t"));
        usersList.add(new Users("MLPMicheal","rage560"));
        usersList.add(new Users("gavinoFree","moff980"));
    }
    public boolean verify(){
        generateUserList();
        boolean found = false;
        for (int i = 0; i <usersList.size(); i++){
            if(usersList.get(i).getUsername().equals(username) && usersList.get(i).getPassword().equals(password)){
                found = true;
            }
        }
        return found;
    }

    public String getUsername(){return username;}

    public String getPassword(){return password;}
}
