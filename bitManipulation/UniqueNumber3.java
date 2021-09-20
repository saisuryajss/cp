package bitManipulation;

import java.util.Scanner;

public class UniqueNumber3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int num;
        int []a=new int[64];
        for(int i=0;i<n;i++) {
        	num=s.nextInt();
        	int j=0;
        	while(num>0) {
        		int m=num&1;
        		a[j++]+=m;
        		num=num>>1;
        	}
        }
        n=0;
        num=1;
        for(int i=0;i<64;i++) {
        	n+=num*(a[i]%3);
        	num=num*2;
        }
        System.out.println(n);
        s.close();
	}

}
