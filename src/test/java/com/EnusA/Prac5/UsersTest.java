package com.EnusA.Prac5;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by enusa on 2017/04/02.
 */
public class UsersTest {
    String username = "iskall85";
    String password = "8585458";
    boolean found = false;
    private ArrayList<Users> usersList= new ArrayList();

    public void generateUserList() {

        usersList.add(new Users("Dullahan", "1101011"));
        usersList.add(new Users("iskall85", "8585458"));
        usersList.add(new Users("XisumaVoid", "1098056"));
    }

    public String getUsername(){return username;}

    public String getPassword(){return password;}

    @Test
    public void verify() throws Exception {
        generateUserList();
        if(usersList.get(1).getUsername() == username && usersList.get(1).getPassword() == password){
            found = true;
        }
        assertTrue("Verification Failed " + usersList.get(1).getPassword(),found);
    }



}