package recursion;

import java.util.Scanner;

public class FunkyChessBoard {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int [][]a=new int[n][n];
		int count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=s.nextInt();
				if(a[i][j]==0) {
					count++;
				}
			}
		}
		System.out.println(find(0,0,n*n-count,a));
		s.close();
	}
	
	public static int find(int i,int j,int l,int [][]a) {
		if(i<0||j<0||i>=a.length||j>=a[0].length||a[i][j]==0) {
			return l;
		}
		if(a[i][j]==2) {
			return l;
		}
		a[i][j]=2;
		int fp=Math.min(Math.min(find(i-2,j+1,l-1,a),find(i-2,j-1,l-1,a)),Math.min(find(i+2,j+1,l-1,a),find(i+2,j-1,l-1,a)));
		int sp=Math.min(Math.min(find(i-1,j+2,l-1,a),find(i+1,j+2,l-1,a)),Math.min(find(i-1,j-2,l-1,a),find(i+1,j-2,l-1,a)));
		return Math.min(fp,sp);
	}

}
