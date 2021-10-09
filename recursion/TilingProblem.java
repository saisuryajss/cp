package recursion;

import java.util.Scanner;

public class TilingProblem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int []a=new int[100000];
		for(int i=0;i<a.length;i++) {
			a[i]=-1;
		}
		while(t--!=0) {
			int n=s.nextInt();
			int m=s.nextInt();
			System.out.println(find(n,m,a));
		}
		s.close();
	}
	
	public static long find(int n,int m,int []a) {
		if(n<0) {
			return 0;
		}
		if(n==m) {
			return 2;
		}
		if(n>=1&&n<m) {
			return 1;
		}
		if(n<100000&&a[n]!=-1) {
			return a[n];
		}
		long ans=(find(n-1,m,a)%(1000000000+7));
		ans+=(find(n-m,m,a)%(1000000000+7));
		if(n<100000) {
			a[n]=(int)(ans%(1000000000+7));
		}
		return ans%(1000000000+7);
	}

}
