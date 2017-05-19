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
public class ErrorResponseTest {
    
    /**
     * Test of getError method, of class ErrorResponse.
     */
    @Test
    public void testGetError() {
        System.out.println("getError");
        ErrorResponse instance = new ErrorResponse("Error response test");
        String expResult = "Error response test";
        String result = instance.getError();
        assertEquals(expResult, result);
    }
    
}
