package numberTheory;

import java.util.Scanner;

public class FastModuloExponentiation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
        //System.out.println(fastExpo(a, b,100));
		System.out.print(multiplicativeModuloInv(a, b));
		s.close();
	}
	
	public static int fastExpo(int a,int b,int c) {
		int ans=1;
		while(b>0) {
			if((b&1)==1) {
			    ans=(ans*a)%c;
			}
			a=(a*a)%c;
			b=b>>1;
		}
		return ans;
	}
	
	public static int multiplicativeModuloInv(int a,int b) {
		GCD.extendedEuclid(a, b);
		return (GCD.x+b)%b;
	}

}
