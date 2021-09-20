package bitManipulation;

import java.util.Scanner;

public class ReplaceBits {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=15;
		int i=1,j=3;
		int a=((~0)<<j+1);
		int b=(1<<i)-1;
		int mask=(a|b);
		n=(n&mask);
		int rep=2;
		rep=(rep<<i);
		System.out.println((n|rep));
		s.close();
	}

}
