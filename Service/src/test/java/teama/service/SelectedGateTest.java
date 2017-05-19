/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teama.service;

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
public class SelectedGateTest {
    
    /**
     * Test of getGate method, of class SelectedGate.
     */
    @Test
    public void testGetGate() {
        System.out.println("getGate");
        SelectedGate instance = new SelectedGate(4);
        int expResult = 4;
        int result = instance.getGate();
        assertEquals(expResult, result);
    }
    
}
