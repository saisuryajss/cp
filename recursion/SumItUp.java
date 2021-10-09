package recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class SumItUp {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int []a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		//set=new TreeSet<>();
		int t=s.nextInt();
        find(a,t,0,new ArrayList<Integer>());
       // System.out.println(set);
        s.close();
	}
	
	public static void find(int []a,int t,int idx,ArrayList<Integer> list) {
		if(t==0) {
			Collections.sort(list);
			System.out.println(list);
			//set.add();
			return;
		}
		if(idx>=a.length) {
			return;
		}
		if(a[idx]<=t) {
			list.add(a[idx]);
			find(a,t-a[idx],idx+1,list);
			list.remove((Integer)(a[idx]));
		}
		find(a,t,idx+1,list);	
	}

}
