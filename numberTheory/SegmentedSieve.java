package numberTheory;

import java.util.Scanner;
import java.util.ArrayList;
public class SegmentedSieve {
	static ArrayList<Integer> list=new ArrayList<>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int []p=new int[100000];
        sieve(p);
        int t=s.nextInt();
        while(t--!=0) {
        	int m=s.nextInt();
    		int n=s.nextInt();
    		boolean []seg=new boolean[n-m+1];
    		for(int i: list) {
    			int start=(m/i)*i;
    			if(start<m) {
    				start+=i;
    			}
    			if(i>=m&&i<=n) {
    				start=i*2;
    			}
    			if(i*i>=0&&i*i>n) {
    				break;
    			}
    			for(int j=start;j<=n;j+=i) {
    				seg[j-m]=true;
    			}
    		}
    		for(int i=m;i<=n;i++) {
    	    	   if(!seg[i-m]&&i!=1) {
    	    		   System.out.print(i+" ");
    	    	   }
    	       }
    		System.out.println();
        }
        s.close();
	}
	
	public static void sieve(int []p) {
	  for(int i=2;i<p.length;i++) {
		  if(p[i]==0) {
			  list.add(i);
			  for(int j=i;j<p.length;j+=i) {
				  p[j]=1;
			  }
		  }
	  }
	}
}
