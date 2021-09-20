package bitManipulation;

import java.util.Scanner;

public class PlayWithBits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a,b;
		while(t!=0) {
			a=sc.nextInt();
			b=sc.nextInt();
			System.out.println(find(a,b));
			t--;
		}
     sc.close();
	}
 public static int find(int a,int b) {
	 int ans=0;
	 int temp=0;
	 for(int i=a;i<=b;i++) {
		 temp=i;
		 while(temp>0) {
			 temp=temp&(temp-1);
			 ans++;
		 }
	 }
	 return ans;
 }
}
