/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teama.service;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author emusial
 */
public class GateListTest {
    
    public GateListTest() {
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
     * Test of getGates method, of class GateList.
     */
    @Test
    public void testGetGates() {
        System.out.println("getGates");
        ArrayList<Gate> gates = new ArrayList<>();
        gates.add(new Gate(28, 54.38200, 18.46196));
        gates.add(new Gate(26, 54.38170, 18.46315));
        gates.add(new Gate(24, 54.38142, 18.46431));
        gates.add(new Gate(22, 54.38113, 18.46548));
        GateList instance = new GateList(gates);
        ArrayList<Gate> expResult = gates;
        ArrayList<Gate> result = instance.getGates();
        assertEquals(expResult, result);
    }
    
}
