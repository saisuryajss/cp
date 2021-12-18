package recursion;

import java.util.Scanner;

public class RatInAMaze {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		char [][]a=new char[n][m];
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				a[i][j]=s.nextInt();
			}
		}
		find(a,0,0);
	}
   
	public static boolean find(char [][]a,int i,int j) {
		if(i>=a.length||j>=a[0].length) {
			return false;
		}
		if(a[i][j]=='X') {
			return false;
		}
		if(i==a.length-1&&j==a[0].length-1) {
			for(int r=0;r<a.length;r++) {
				for(int c=0;c<a[0].length;c++) {
					System.out.println(a[r][c]);
				}
			}
			return true;
		}
		a[i][j]='1';
		boolean b=find(a,i,j+1);
		if(b) {
			return true;
		}
		if(!b) {
			b=find(a,i+1,j);
		}
		if(!b) {
			a[i][j]='o';
		}
		return false;
	}
}
