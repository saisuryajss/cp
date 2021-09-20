package bitManipulation;

import java.util.Scanner;

public class UniqueNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int num=0;
		int ans=0;
		for(int i=0;i<n;i++) {
			num=s.nextInt();
            ans=ans^num;
		}
		System.out.print(ans+" ");
		s.close();
	} 
}
