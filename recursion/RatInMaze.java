package recursion;

import java.util.Scanner;

public class RatInMaze {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		System.out.println(find(n,m,0,0,""));
		s.close();
	}

	public static int find(int n,int m,int i,int j,String ans) {
		if(n-1==i&&j==m-1) {
			System.out.println(ans);
			return 1;
		}
		if(i>=n||j>=m) {
			return 0;
		}
		int fp=find(n,m,i+1,j,ans+"d");
		int sp=find(n,m,i,j+1,ans+"r");
		return fp+sp;
	}
	

}
