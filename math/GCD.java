package math;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.print(gcd(a,b));
		s.close();
	}
	
	public static int gcd(int a,int b) {
		if(a==1||b==1) {
			return 1;
		}
		int rem=a%b;
		if(rem==0) {
			return b;
		}
		else {
			return gcd(b,rem);
		}
	}

}
