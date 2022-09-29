/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.view;

import java.util.ResourceBundle;

/**
 * @author 2dam
 * Here using the properties file we can choose if we want to show the message using terminal or a javaFX window
 */
public class ViewFactory {
    private ViewInterface data;
    private ResourceBundle configFile;
    private String ui;
    
    public ViewInterface getView() {
        configFile = ResourceBundle.getBundle("javafxapp.model.Config");
        ui = configFile.getString("UI");
       if (ui.equalsIgnoreCase("text")) {
            if (data==null){
                data = new TextViewImplementation();
            }
        } else if(ui.equalsIgnoreCase("javafx")){
            if (data==null){
                data = new UIViewImplementation();
            }
        }
        return data;
    }
}
