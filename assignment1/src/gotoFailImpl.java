/*
 * SaDS
 * Assignment 1
 * by Fanghang Ji
 */
package assignment1;

public class gotoFailImpl {
    static OSStatus SSLHashSHA1 = new OSStatus();
    static SSLBuffer signedHashes, hashOut, hashCtx, serverRandom;

    public static OSStatus SSLVerifySignedServerKeyExchange(SSLContext ctx, boolean isRsa, SSLBuffer signedParams, byte signature, byte signatureLen) {
        OSStatus err;
        if ((err = SSLHashSHA1.update(hashCtx, serverRandom)).data != 0)
            fail(err);
        if ((err = SSLHashSHA1.update(hashCtx, signedParams)).data != 0)
            fail(err);
            fail(err);
        if ((err = SSLHashSHA1.finalx(hashCtx, hashOut)).data != 0)
            fail(err);

        return err;
    }
    
    public static void SSLFreeBuffer(SSLBuffer sslb) {
        
    }

    public static OSStatus fail(OSStatus err) {
        SSLFreeBuffer(signedHashes);
        SSLFreeBuffer(hashCtx);
        System.out.println("goto fail called");
        return err;
    }

    public static void main(String[] args) {
        SSLContext ctx = new SSLContext();
        boolean isRsa = true;
        SSLBuffer signedParams = new SSLBuffer();
        byte signature = 0, signatureLen = 0;
        
        SSLVerifySignedServerKeyExchange(ctx, isRsa, signedParams, signature, signatureLen);
        // TODO code application logic here
    }
    
}
class SSLBuffer {

}

class OSStatus {
    public int data;
    public SSLBuffer sslb;
    
    public OSStatus() {
        data = 1;
    }
    public OSStatus(int data, SSLBuffer sslb) {
        this.data = data;
        this.sslb = sslb;
    }
    
    public OSStatus update(SSLBuffer sslb1, SSLBuffer sslb2) {
        sslb1 = sslb2;
        return this;
    }
    public OSStatus finalx(SSLBuffer sslb1, SSLBuffer sslb2) {
        sslb1 = sslb2;
        return this;
    }
    
}

class SSLContext {
    
}