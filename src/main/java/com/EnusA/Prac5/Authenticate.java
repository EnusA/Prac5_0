package com.EnusA.Prac5;

/**
 * Created by enusa on 2017/04/01.
 */
public class Authenticate {
    private String username;
    private String password;
    private static Authenticate authentic = null;
    private Authenticate(){};

    private Authenticate(String user, String pass){
        username = user;
        password = pass;
    }
    public static Authenticate getAuthenticate(String user, String pass){
        if (authentic == null){
            authentic = new Authenticate(user, pass);
        }
        return authentic;
    }

    public void authenticate ()
    {
        Users user = new Users(username, password);
        if (user.verify() == true)
            System.out.println( "Authentication Successful.\nWelcome, " + user.getUsername());
        else
            System.out.println("Authentication Failed.\nPlease check your Username and Password.");
        System.out.println("user: " + username + "pass: " + password);
    }
}
/*This acts as a proxy for the Users Class while also adding functionality of its own to increase efficiency and
  ensure that only one instance of this class can be created as only one user may be logged into the system at a time.
 */