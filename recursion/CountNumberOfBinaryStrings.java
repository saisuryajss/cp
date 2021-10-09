package recursion;

import java.util.Scanner;

public class CountNumberOfBinaryStrings {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
        while(t--!=0) {
        	int n=s.nextInt();
        	long o=1,e=1,i=1;
        	while(i<n) {
        		long temp=o;
        		o=e;
        		e=e+temp;
        		i++;
        	}
        	System.out.println(e+o);
        }
        s.close();
	}
}
