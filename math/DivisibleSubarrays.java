package math;

import java.util.Scanner;

public class DivisibleSubarrays {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0) {
		int n=s.nextInt();
		int []pre=new int[n];
		pre[0]=1;
		int sum=0;
		for(int i=0;i<n;i++) {
			int m=s.nextInt();
			sum+=m;
			sum%=n;
			sum=(sum+n)%n;
			pre[sum]++;
		}
//		
		long ans=0;
	    for(int i=0;i<n;i++) {
	    	ans+=(pre[i]*(pre[i]-1))/2;
    }
	    System.out.println(ans);
		}
		s.close();
	}

}
