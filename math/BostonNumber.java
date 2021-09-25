package math;

import java.util.Scanner;

public class BostonNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		long z=n,m=n;
		long sum1=0;
		while(z!=0) {
			sum1+=(z%10);
			z/=10;
		}
		long sum=0;
		int []a=new int[1000000];
		for(int i=3;i<a.length;i+=2)
			a[i]=1;
        a[2]=1;
        for(int i=2;i<a.length;i++) {
        	if(m<i) {
        		break;
        	}
        	if(a[i]==1) {
        		if(m==i) {
            		System.out.println(0);
            		System.exit(0);
            	}
        	for(long j=i*i;j<a.length&&j>0;j+=i) {
        		a[(int)j]=0;
        	}
        	int count=0;
        	while(n%i==0) {
        		count++;
        		n=n/i;
        	}
        	sum+=(find(i)*count);
        }
        }
        if(n!=1) {
        	sum+=n;
        }
        if(sum==sum1)
            System.out.println(1);
        else
        	System.out.println(0);
        s.close();
	}
	public static int find(int i) {
		int ans=0;
		while(i>0) {
			ans+=i%10;
			i=i/10;
		}
		return ans;
	}
}
