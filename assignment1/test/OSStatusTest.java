/*
 * jUnit test for assignment 1
 */
package assignment1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Jamie
 */
public class OSStatusTest {
    
    public OSStatusTest() {
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
     * Test of update method, of class OSStatus.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        SSLBuffer sslb1 = null;
        SSLBuffer sslb2 = null;
        OSStatus instance = new OSStatus();
        OSStatus expResult = null;
        OSStatus result = instance.update(sslb1, sslb2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of finalx method, of class OSStatus.
     */
    @Test
    public void testFinalx() {
        System.out.println("finalx");
        SSLBuffer sslb1 = null;
        SSLBuffer sslb2 = null;
        OSStatus instance = new OSStatus();
        OSStatus expResult = null;
        OSStatus result = instance.finalx(sslb1, sslb2);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
