package dp;

import java.util.Scanner;

public class CrossingBlocks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int n=0;
		while(t--!=0) {
			n=s.nextInt();
			int []a=new int[n];
			int ans=0;
			for(int i=0;i<n;i++) {
				a[i]=s.nextInt();
			}
			ans=find(a,0,1);
			System.out.println(ans==Integer.MAX_VALUE?-1:ans);
			s.close();
		}
	}
	public static int find(int []a,int last,int curr) {
		if(a.length-1==curr) {
			if(a[last]>=a[curr]) {
				return 0;
			}
			else {
				return Integer.MAX_VALUE;
			}
		}
		if(a[last]>=a[curr]) {
			int fp=find(a,curr,curr+1);
		    int sp=Integer.MAX_VALUE;
			if(a[curr]<=a[curr+1]) {
				sp=find(a,last,curr+1);
			}
			if(fp!=Integer.MAX_VALUE) {
				fp++;
			}
			if(sp!=Integer.MAX_VALUE) {
				sp++;
			}
			return Math.min(fp, sp);
		}
		else {
			return Integer.MAX_VALUE;
		}
	}
}
