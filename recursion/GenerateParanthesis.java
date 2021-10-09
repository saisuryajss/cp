package recursion;

import java.util.Scanner;

public class GenerateParanthesis {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		find(n,0,0,"");
		s.close();
	}
	
	public static void find(int n,int i,int j,String ans) {
		if(n==i&&n==j) {
			System.out.println(ans);
			return;
		}
		if(i>n||j>n) {
			return;
		}
		if(i!=0&&j<i) {
			find(n,i,j+1,ans+")");
		}
		find(n,i+1,j,ans+"(");
	}

}
