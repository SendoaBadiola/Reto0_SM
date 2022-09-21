/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.controller;

import exceptions.ExceptionManager;
import javafxapp.model.ModelInterface;
import javafxapp.view.ViewInterface;

/**
 *
 * @author 2dam
 */
public class Controller {
    public void run(ModelInterface mIf, ViewInterface vIf) throws ExceptionManager{
        vIf.showGreeting(mIf.getGreeting());
    }
}
