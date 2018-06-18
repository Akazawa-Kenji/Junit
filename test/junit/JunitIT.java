/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Crazian
 */
public class JunitIT {
    
    public JunitIT() {
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
     * Test of main method, of class Junit.
     */
    @Test
    //Test annotation
    public void testAddNumber() {
        int a =5;
        int b =8;
        
        Junit test1 = new Junit();
        //creating new test object to call the method
        int result1 = test1.addNumber(a, b);
        //result variable is going to be equal to addNumber method that is in the test object.
        assertEquals(13, result1);
        //using the JUNIT assert class and assertEuals tests what we expect and what the result is
    }
    
    @Test
    public void testAddString(){
        Junit test2 = new Junit();
        
        String result2 = test2.addString("Kenji", "Akazawa");
        assertEquals("KenjiAkazaw", result2);
        //Expected result was KenjiAkazaw but was KenjiAkazawa
        
    }
    
    
}
