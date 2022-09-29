/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import javafxapp.exceptions.ExceptionManager;
import javafxapp.controller.Controller;
import javafxapp.model.ModelFactory;
import javafxapp.model.ModelInterface;
import javafxapp.view.ViewFactory;
import javafxapp.view.ViewInterface;

/**
 *
 * @author 2dam
 */
public class Application {
    
    /**
     * @param args the command line arguments
     * @throws javafxapp.exceptions.ExceptionManager
     */
    public static void main(String[] args) throws ExceptionManager {
        ModelInterface mIf;
        ViewInterface vIf;
        Controller runeable = new Controller();
        ModelFactory mOf = new ModelFactory();
        ViewFactory vOf = new ViewFactory();
        
        mIf = mOf.getModel();
        vIf = vOf.getView();
        runeable.run(mIf, vIf);
    }
    
}
