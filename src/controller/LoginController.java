/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Authenticator;
import model.User;
import view.MyLoginFrame;

/**
 *
 * @author Ventura
 */
public class LoginController {

static MyLoginFrame myLoginFrame;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        myLoginFrame = new MyLoginFrame();
        myLoginFrame.setVisible(true);
        
    }
    
    public static void processRequest(User user)
    {
        boolean hasAccess;
        Authenticator authenticator = new Authenticator();
        hasAccess = authenticator.authenticate(user);
        if(hasAccess)
        {
            myLoginFrame.hideLoginPanel();
            myLoginFrame.showSuccessMessage();
        }
        else
        {
            myLoginFrame.showErrorDialog();
        }
    }
}
