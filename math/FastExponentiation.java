package math;

import java.util.Scanner;

public class FastExponentiation {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int pow=s.nextInt();
		System.out.println(find(n,pow));
		s.close();
	}

	public static int find(int n,int pow) {
		if(pow==1) {
			return n;
		}
		if((pow&1)==0) {
			int x=find(n,pow/2);
			return x*x;
		}
		else {
			int x=find(n,(pow-1)/2);
			return n*x*x;
		}
	}
}
