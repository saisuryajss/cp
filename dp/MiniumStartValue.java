package dp;

import java.util.Scanner;

public class MiniumStartValue {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		find(a);	
		s.close();
	}
public static void find(int []a) {
	long m=0;
	for(int i=0;i<a.length;i++) {
		m+=a[i];
	}
	if(m>=0)
    System.out.println(1);
	else {
		System.out.println(Math.abs(m)+1);
	}
}
}
