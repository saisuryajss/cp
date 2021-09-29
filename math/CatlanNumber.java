package math;

import java.util.Scanner;
import java.math.BigInteger;
public class CatlanNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		BigInteger b1=new BigInteger("1");
		BigInteger a1=new BigInteger("1");
		BigInteger a2=new BigInteger("1");
		BigInteger a3=new BigInteger("1");
		for(int i=1;i<=2*n;i++) {
			b1=b1.multiply(BigInteger.valueOf(i));
			if(i==n) {
				a3=b1;
			}
			else if(i==n+1) {
				a2=b1;
			}
			else if(i==2*n) {
				a1=b1;
			}
		}
		a2=a2.multiply(a3);
		a1=a1.divide(a2);
		System.out.println(a1);
		s.close();
	}

}
