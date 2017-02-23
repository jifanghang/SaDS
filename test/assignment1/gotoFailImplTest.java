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
public class gotoFailImplTest {
    
    public gotoFailImplTest() {
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
     * Test of SSLVerifySignedServerKeyExchange method, of class gotoFailImpl.
     */
    @Test
    public void testSSLVerifySignedServerKeyExchange() {
        System.out.println("SSLVerifySignedServerKeyExchange");
        SSLContext ctx = null;
        boolean isRsa = false;
        SSLBuffer signedParams = null;
        byte signature = 0;
        byte signatureLen = 0;
        OSStatus expResult = null;
        OSStatus result = gotoFailImpl.SSLVerifySignedServerKeyExchange(ctx, isRsa, signedParams, signature, signatureLen);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of SSLFreeBuffer method, of class gotoFailImpl.
     */
    @Test
    public void testSSLFreeBuffer() {
        System.out.println("SSLFreeBuffer");
        SSLBuffer sslb = null;
        gotoFailImpl.SSLFreeBuffer(sslb);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of fail method, of class gotoFailImpl.
     */
    @Test
    public void testFail() {
        System.out.println("fail");
        OSStatus err = null;
        OSStatus expResult = null;
        OSStatus result = gotoFailImpl.fail(err);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class gotoFailImpl.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        gotoFailImpl.main(args);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
