package bitManipulation;

import java.util.Scanner;

public class IncredibleHulk {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0) {
			int n=s.nextInt();
			int ans=0;
			while(n>0) {
				ans++;
				n=n&(n-1);
			}
			System.out.println(ans);
			t--;
		}
       s.close();
	}

}
