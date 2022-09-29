/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.model;

import javafxapp.exceptions.ExceptionManager;


/**
 *
 * @author 2dam
 */
public interface ModelInterface {
    
    public String getGreeting() throws ExceptionManager;
    
}
