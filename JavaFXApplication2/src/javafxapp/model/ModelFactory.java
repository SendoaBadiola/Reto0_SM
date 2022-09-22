/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    private ModelInterface data;
    private ResourceBundle configFile;
    private String model;
    
    public ModelInterface getModel() {
        configFile = ResourceBundle.getBundle("javafxapp.model.Config");
        model = configFile.getString("MODEL");
        if (model.equalsIgnoreCase("db")) {
            if (data==null){
                data = new ModelDBImplementation();
            }
        } else if(model.equalsIgnoreCase("file")){
            if (data==null){
                data = new ModelFileImplementation();
            }
        }
        return data;
    }
    
}
