/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.model;

/**
 *
 * @author 2dam
 */
public class ModelFactory {
    private static ModelInterface data;
    
    public static ModelInterface getModel() {
        if (data==null){
            data = new ModelDBImplementation();
        }
        return data;
    }
    
}
