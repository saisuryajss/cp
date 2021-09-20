package bitManipulation;

import java.util.Scanner;

public class InclusionAndExclusion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []primes= {2,3,5,7,11,13,17,19};
		int n=s.nextInt();
		long ans=0;
		int subsets=(1<<8)-1;
        for(int i=1;i<=subsets;i++) {
        	int deno=1;
        	int setBits=Integer.bitCount(i);
        	for(int j=0;j<=7;j++) {
        		if((i&(1<<j))==1) {
        			deno=deno*primes[j];
        		}
        	}
        	if((setBits&1)==1) {
        		ans+=n/deno;
        	}
        	else {
        		ans-=(n/deno);
        	}
        }
        System.out.println(ans);
        s.close();
	}

}
