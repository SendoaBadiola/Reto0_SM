/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.view;

import exceptions.ExceptionManager;

/**
 *
 * @author 2dam
 */
public class TextViewImplementation implements ViewInterface {

    @Override
    public void showGreeting(String greeting) throws ExceptionManager {
        System.out.println(greeting);
    }
    
}
