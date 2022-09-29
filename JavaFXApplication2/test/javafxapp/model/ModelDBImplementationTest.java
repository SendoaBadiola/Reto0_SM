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
public class ModelDBImplementationTest {
    
    public ModelDBImplementationTest() {
    }

    /**
     * Test of getGreeting method, of class ModelDBImplementation.
     */
    @Test
    public void testGetGreeting() throws Exception {
        System.out.println("getGreeting");
        ModelDBImplementation instance = new ModelDBImplementation();
        String expResult = "Hello World!!";
        String result = instance.getGreeting();
        System.out.println(result);
        System.out.println(expResult);
        assertEquals(expResult, result);
    }
    
}
