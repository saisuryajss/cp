package bitManipulation;

import java.util.Scanner;

public class FastExponentiationBitMasking {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		int pow=s.nextInt();
		int ans=1;
		while(pow>0) {
			if((pow&1)==1) {
				ans=ans*num;
			}
			num=num*num;
			pow=pow>>1;
		}
		System.out.println(ans);
		s.close();
	}
}
