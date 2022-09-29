/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.model;

import javafxapp.exceptions.ExceptionManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 * @author 2dam
 * method to get the greeting message using Data Base
 */
public class ModelDBImplementation implements ModelInterface {
    private Connection con;
    private PreparedStatement stmt;
    private ConnectionOpenClose connection = new ConnectionOpenClose();
    
    @Override
    public String getGreeting() throws ExceptionManager{
        ResultSet rs = null;
        String greetingResult = null;
        
        con = connection.openConnection();
        String greeting = "select greeting from greeting g";
            
        try {
            stmt = con.prepareStatement(greeting);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                greetingResult = rs.getString("greeting");
            }
        } catch (SQLException ex) {
            String error = "Error en la conexión con la base de datos";
            ExceptionManager exception = new ExceptionManager(error);
            throw exception;
        } finally {
            try {
                connection.closeConnection(stmt, con);
            } catch (SQLException ex) {
                String error =" Error al cerrar la base de datos";
                ExceptionManager exception = new ExceptionManager(error);
                throw exception;
            }
        }
        return greetingResult;
    }
    
}
