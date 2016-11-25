/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Ventura
 */
public class Authenticator {

    public Authenticator() {
    }
    public boolean authenticate(User user)
    {
       boolean hasAccess;
        if(user.getUsername().equals("fernando") 
                && user.getPassword().equals("1234"))
        {
            hasAccess = true;
        }
        else
        {
            hasAccess = false;
        }
        return hasAccess;
    }
    
    
}
