package recursion;

import java.util.Scanner;

public class FastExponentiation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pow=s.nextInt();
		System.out.println(fastExpo(n,pow));
		s.close();
	}
	
	public static int fastExpo(int n,int pow) {
		if(pow==1) {
			return n;
		}
		int temp=fastExpo(n,pow/2);
		temp*=temp;
		if((pow&1) ==1) {
			return temp*n;
		}
		return temp;
	}
}
