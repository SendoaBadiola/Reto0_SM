/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.view;


import javafxapp.exceptions.ExceptionManager;
import javafx.application.Application;
import static javafx.application.Application.*;

import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;




/**
 * @author 2dam
 * method to use a javaFX window to show the message
 */
public class UIViewImplementation extends Application implements ViewInterface {
    
    public void start(Stage primaryStage) {
        String parameter;
        parameter = getParameters().getRaw().get(0);
        Text text = new Text(parameter);
        
        StackPane root = new StackPane();
        root.getChildren().add(text);
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle(parameter);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @Override
    public void showGreeting(String greeting) throws ExceptionManager {
        launch(greeting);
        
    }
}
