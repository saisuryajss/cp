package bitManipulation;

import java.util.Scanner;

public class ProftXor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int max=0;
		int temp=0;
		for(int i=a;i<=b;i++) {
			for(int j=i+1;j<=b;j++) {
				temp=i^j;
				if(temp>max) {
					max=temp;
				}
			}
		}
		System.out.println(max);
		s.close();
	}

}
