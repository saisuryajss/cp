package numberTheory;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
//		int a=s.nextInt();
//		int b=s.nextInt();
//		System.out.print(gcd(a,b));
		extendedEuclid(18,30);
		System.out.println(x+" "+y);
		s.close();
	}
	static int x,y,gcd;
	public static void extendedEuclid(int a,int b) {
		if(b==0) {
			x=1;
			y=0;
			gcd=a;
			return;
		}
		extendedEuclid(b, a%b);
		int cx=y;
		int cy=x-(a/b)*y;
		x=cx;
		y=cy;
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
