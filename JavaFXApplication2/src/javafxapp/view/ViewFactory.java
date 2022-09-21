/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.view;

/**
 *
 * @author 2dam
 */
public class ViewFactory {
    private static ViewInterface data;
    
    public static ViewInterface getView() {
        if (data==null){
            data = new TextViewImplementation();
        }
        return data;
    }
}
