/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.model;

import exceptions.ExceptionManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author 2dam
 */
public class ModelFileImplementation implements ModelInterface {

    @Override
    public String getGreeting() throws ExceptionManager {
        File file = new File("src\\javafxapp\\model\\greeting.txt");
        BufferedReader br;
        String greeting = null;

        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
            greeting = br.readLine();
        } catch (FileNotFoundException ex) {
            System.out.println("Error, no se ha encontrado el fichero");
        } catch (IOException ex) {
            System.out.println("Error en la lectura del fichero");
        }
        return greeting;
    }

}
