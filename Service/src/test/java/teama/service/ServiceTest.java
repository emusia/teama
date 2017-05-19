/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teama.service;

import java.util.ArrayList;
import java.util.Optional;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import teama.server.server.Gate;
import teama.server.server.Service;

/**
 *
 * @author emusial
 */
public class ServiceTest {
    
    public ServiceTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getGates method, of class Service.
     */
    @Test
    public void testGetGates() {
        System.out.println("getGates");
        Service instance = new Service();
        ArrayList<Gate> expResult = new ArrayList<>();
        expResult.add(new Gate(28, 54.38200, 18.46196));
        expResult.add(new Gate(26, 54.38170, 18.46315));
        expResult.add(new Gate(24, 54.38142, 18.46431));
        expResult.add(new Gate(22, 54.38113, 18.46548));
        
        ArrayList<Gate> result = instance.getGates();
        assertEquals(expResult, result);
    }

    /**
     * Test of getCurrentGate method, of class Service.
     */
    @Test
    public void testGetCurrentGate() {
        System.out.println("getCurrentGate");
        Service instance = new Service();
        Optional<Gate> expResult = Optional.empty();
        Optional<Gate> result = instance.getCurrentGate();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

 
}
