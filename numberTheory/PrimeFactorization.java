package numberTheory;

import java.util.ArrayList;
import java.util.Scanner;


public class PrimeFactorization {
     static ArrayList<Integer> primes=new ArrayList<>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		naiveApproach(n);
		System.out.println();
		optimisedApproach(n);
		System.out.println();
		sieve(new int[100005]);
		sieveBasedApproach(n);
		s.close();
	}
	
	public static void naiveApproach(int n) {
		if(n==0||n==1) {
			return;
		}
			for(int i=2;i<=n;i++) {
			    	while(n%i==0) {
			    	  System.out.print(i+" ");
			    	  n=n/i;
			    	}
			}
	}
	public static void optimisedApproach(int n) {
		for(int i=2;i<=Math.sqrt(n);i++) {
			while(n%i==0) {
				n=n/i;
				System.out.print(i+" ");
			}
		}
		if(n!=1) {
			System.out.print(n);
		}
	}
	
	public static void sieveBasedApproach(int n) {
		int m=(int)Math.sqrt(n);
		for(int i:primes) {
			if(i>m) {
				break;
			}
			while(n%i==0) {
				n=n/i;
				System.out.print(i+" ");
			}
		}
		if(n!=1) {
			System.out.print(n);
		}
	}
	public static void sieve(int []a) {
		a[2]=1;
		primes.add(2);
		for(int i=3;i<a.length;i+=2)
		{
		a[i]=1;	
		}
		for(int i=3;i<a.length;i+=2) {
			if(a[i]==1) {
				primes.add(i);
			for(int j=i*i;j<a.length&&j>=0;j+=i) {
				a[j]=0;
			}
			}
		}
	}
}
