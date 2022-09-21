/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp;

import exceptions.ExceptionManager;
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
    
    private static ModelInterface mIf;
    private static ViewInterface vIf;
    private static Controller runeable;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExceptionManager {
        mIf = ModelFactory.getModel();
        vIf = ViewFactory.getView();
        runeable.run(mIf, vIf);
    }
    
}
