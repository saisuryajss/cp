package bitManipulation;

import java.util.Scanner;

public class SubsetsUsingBitMasking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String k=s.next();
		int n=k.length();
		for(int i=0;i<(1<<n);i++) {
			filterChars(i,k);
		}
		s.close();
	}

	private static void filterChars(int n, String k) {
		int j=0;
		while(n>0) {
			int lb=(n&1);
			if(lb==1) {
				System.out.print(k.charAt(j));
			}
			j++;
			n=n>>1;
		}
		System.out.print(" ");
	}
	
	

}
