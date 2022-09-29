/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.model;

import javafxapp.exceptions.ExceptionManager;
import java.util.ResourceBundle;

/**
 * @author 2dam
 * method to get the greeting message using File
 */
public class ModelFileImplementation implements ModelInterface {

    private ResourceBundle configFile;
    private String greeting;
    
    @Override
    public String getGreeting() throws ExceptionManager {
        configFile = ResourceBundle.getBundle("javafxapp.model.Config");
        greeting = configFile.getString("GREETING");

        return greeting;
    }

}
