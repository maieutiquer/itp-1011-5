
package crypto;

import java.security.SecureRandom;
import java.math.BigInteger;

public class KeyPair {

	static long p;
	static long q;
	static int c;
	BigInteger n, e, d, nMaj;
	
	public KeyPair(BigInteger n, BigInteger e, BigInteger d, BigInteger nMaj) {
		super();
		this.n = n;
		this.e = e;
		this.d = d;
		nMaj = nMaj;
	}
	
	
	public static void main(String[] args) {
		SecureRandom random = new SecureRandom();
		p = random.nextLong();
		q = random.nextLong();
		c = BigInteger.valueOf(p).gcd(BigInteger.valueOf(q)).intValue();
		System.out.println("GCD of p=" + p + " and q=" + q +" is c=" + c);
		
		BigInteger a = BigInteger.valueOf(p);
		BigInteger b = BigInteger.valueOf(q);
		
		int myGcd = a.gcd(b).intValue();
		System.out.println(myGcd);
		
		
		
	}
	
	
	
	public void encrypt(BigInteger plainText) {
		
	}
	
	public void decrypt(BigInteger cipherText) {
		
	}
	
	
	
}
