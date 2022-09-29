/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapp.model;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 2dam
 */
public class ModelFileImplementationTest {
    
    public ModelFileImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class ModelFileImplementation.
     */
    @Test
    public void testGetGreeting() throws Exception {
        System.out.println("getGreeting");
        ModelFileImplementation instance = new ModelFileImplementation();
        String expResult = "HELLO WORLD!!! FILE";
        String result = instance.getGreeting();
        System.out.println(result);
        System.out.println(expResult);
        assertEquals(expResult, result);
    }
    
}
