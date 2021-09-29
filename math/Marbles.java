package math;

import java.math.BigInteger;
import java.util.Scanner;

public class Marbles {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0) {
			int n=s.nextInt();
			int k=s.nextInt();
			BigInteger b1=fact(n-1);
			//System.out.println(b1.toString());
			BigInteger b2=fact(n-k);
			BigInteger b3=fact(k-1);
			b2=b2.multiply(b3);
		    System.out.println(b1.divide(b2));
		}
		s.close();
	}
	
	public static BigInteger fact(long n) {
		if(n<=1) {
			BigInteger b=new BigInteger("1");
			return b;
		}
		//System.out.println(n);
		return fact(n-1).multiply(BigInteger.valueOf(n));
	}
}
