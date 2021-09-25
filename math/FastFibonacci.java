package math;

import java.util.Scanner;

public class FastFibonacci {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int t=s.nextInt();
	long n=0;
	while(t--!=0) {
		n=s.nextLong();
		System.out.print(fibo(n));
	}
	s.close();
	}
	
	public static long fibo(long n) {
		if(n==1||n==2) {
			return 1;
		}
		long [][]b= {{0,1},{1,1}};
		b=multiply(b,n-1);
	    return (b[1][1]%(1000000000+7));
	}
	
	public static long[][] multiply(long [][]b,long n){
	     	if(n==1) {
	     		return b;
	     	}
	     	if((n&1)==0) {
	     		long [][] temp=multiply(b,n/2);
	     		return matrixMul(temp,temp);
	     	}
	     	else {
	     		long [][] temp=multiply(b,(n-1)/2);
	     		return matrixMul(b,matrixMul(temp, temp));
	     	}
	}
	
	public static long[][] matrixMul(long [][]a,long [][]b){
		long [][]c=new long[2][2];
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					c[i][j]%=(1000000000+7);
					c[i][j]+=(((a[i][k]%(1000000000+7))*(b[k][j]%(1000000000+7)))%(1000000000+7));
					c[i][j]%=(1000000000+7);
				}
			}
		}
		return c;
	}
}
