package recursion;

public class Knapsack01 {

	public static void main(String[] args) {
		int []weights= {1,2,3,5};
		int []prices= {40,20,30,100};
		int n=4;
		int c=7;
        System.out.println(find(weights,prices,n,c));
	}

	public static int find(int []a,int []p,int n,int c) {
		if(n==0||c==0) {
			return 0;
		}
		int fp=0,sp=0;
		if(a[n-1]<=c) {
			fp=find(a,p,n-1,c-a[n-1])+p[n-1];
		}
		sp=find(a,p,n-1,c);
		return Math.max(fp, sp);
	}
}
