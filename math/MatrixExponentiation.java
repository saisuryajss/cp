package math;

import java.util.Scanner;

public class MatrixExponentiation {
   private static int []b,c;
	
	public static void main(String []args) {
	  Scanner s=new Scanner(System.in);
	  int t=s.nextInt();
	  while(t--!=0) {
	  int k=s.nextInt();
	  b=new int[k];
	  c=new int[k];
	  for(int i=0;i<k;i++) {
		  b[i]=s.nextInt();
	  }
	  for(int i=0;i<k;i++) {
		  c[i]=s.nextInt();
	  }
	  int n=s.nextInt();
	  System.out.println(find(n,k));
	  }
	  s.close();
   }
	
	public static int find(int n,int k) {
		if(n<=k) {
			return b[n-1];
		}
		else {
			int num=n-k;
			int [][]p=new int[k][k];
			for(int i=0;i<k-1;i++) {
				for(int j=1;j<k;j++) {
					if(i+1==j) {
						p[i][j]=1;
					}
				}
			}
		   for(int j=0;j<k;j++) {
			   p[k-1][j]=c[k-j-1];
		   }
		   p=trans(p,num);
		   int []q=new int [k];
		   for(int i=0;i<k;i++) {
			   q[i]=b[i];
		   }
		   int sum=0;
		   for(int i=0;i<k;i++) {
			   sum%=1000000000;
			   sum+=((((p[k-1][i])%1000000000)*((q[i])%1000000000))%1000000000);
		   }
		   return sum;
		}
		
	}
	
	public static int[][] trans(int [][]b,int pow) {
		if(pow==1) {
			return b;
		}
		if((pow&1)==0) {
			int [][] temp=trans(b,pow/2);
			return multiply(temp,temp);
		}
		else {
			int [][] temp=trans(b,(pow-1)/2);
			return multiply(b,multiply(temp,temp));
		}
	}
	
	public static int[][] multiply(int [][]b,int [][]a){
		int [][]temp=new int [b.length][b[0].length];
		for(int i=0;i<b.length;i++) {
			for(int j=0;j<b[0].length;j++) {
				for(int k=0;k<b[0].length;k++) {
					temp[i][j]%=1000000000;
					temp[i][j]+=((((b[i][k])%1000000000)*((a[k][j])%1000000000))%1000000000);
				}
			}
		}
		return temp;
	}
}
