package numberTheory;

import java.util.Scanner;

public class PrimeSieve {

	public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
		int p[]=new int[100005];
        sieve(p);
        for(int i=1;i<p.length;i++) {
        	p[i]+=p[i-1];
        }
        int t=s.nextInt();
        while(t--!=0) {
        	int a=s.nextInt();
        	int b=s.nextInt();
        	if(a==0) {
        		System.out.println(p[b]);
        	}
        	else {
        		System.out.println(p[b]-p[a-1]);
        	}
        }
        s.close();
	}
	public static void sieve(int []a) {
		a[2]=1;
		for(int i=3;i<a.length;i+=2)
		{
		a[i]=1;	
		}
		for(int i=3;i<a.length;i+=2) {
			if(a[i]==1) {
			for(int j=i*i;j<a.length&&j>=0;j+=i) {
				a[j]=0;
			}
			}
		}
	}
}
