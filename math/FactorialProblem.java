package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FactorialProblem {
	public static void main(String args[]) {
	      Scanner s=new Scanner(System.in);
		  int t=s.nextInt();
		  ArrayList<Integer> list=sieve();
		  while(t--!=0){
			  int n=s.nextInt();
			  int k=s.nextInt();
			  System.out.println(prime(list,k,n));
		  }
		  s.close();
	    }
	
	 public static int prime(ArrayList<Integer> list,int k,int n) {
		 HashMap<Integer,Integer> map=new HashMap<>();
		 for(int i: list) {
			 if(k<i) {
				 break;
			 }
			 if(k%i==0) {
				 int count=0;
				 while(k%i==0) {
					 count++;
					 k=k/i;
				 }
				 map.put(i,count);
			 }
		 }
		 int min=Integer.MAX_VALUE;
		 for(Map.Entry<Integer,Integer> e:map.entrySet()) {
			 int a=find(n,e.getKey());
			 a=a/e.getValue();
			 min=Math.min(min,a);
		 }
		 return min;
	 }
	
		public static int find(int n,int k){
			int f=1;
			int sum=0;
			while(f<=n){
				f=f*k;
	            sum+=(n/f);
			}
			return sum;
		}
	    
		public static ArrayList<Integer> sieve(){
			int []a=new int[100000];
			ArrayList<Integer> list=new ArrayList<>();
			a[2]=1;
			for(int i=3;i<a.length;i+=2){
				a[i]=1;
			}
			list.add(2);
			for(int i=3;i<a.length;i+=2){
	            if(a[i]==1){
				for(int j=i*i;j<a.length&&j>0;j+=i){
					a[j]=0;
				}
				}
				list.add(i);
			}
			return list;
		}
}
