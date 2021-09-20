package numberTheory;

import java.util.Scanner;

public class FactorialProblem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int m=k;
		int ans=0;
		while((n/k)!=0) {
			ans+=Math.floorDiv(n,k);
			k*=m;
		}
        System.out.println(ans);
        s.close();
	}

}
