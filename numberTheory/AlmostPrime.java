package numberTheory;

import java.util.ArrayList;
import java.util.Scanner;

public class AlmostPrime {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int []a=new int[100005];
		ArrayList<Integer> list=new ArrayList<>();
		a[2]=1;
		for(int i=3;i<a.length;i+=2) {
			a[i]=1;
		}
		for(int i=2;i<a.length;i++) {
			if(a[i]==1) {
				list.add(i);
				for(int j=i*i;j<a.length&&j>=0;j+=i) {
					a[j]=0;
				}
			}
		}
		for(int i:list) {
			for(int j=2*i;j<a.length&&j>=0;j+=i) {
				a[j]++;
			}
		}
		for(int i=1;i<a.length;i++) {
			if(a[i]==2) {
				a[i]=1;
				a[i]+=a[i-1];
			}
			else {
				a[i]=a[i-1];
			}
		}
		int t=s.nextInt();
		while(t--!=0) {
			int n=s.nextInt();
	        System.out.println(a[n]);
		}
		s.close();
	}
}
