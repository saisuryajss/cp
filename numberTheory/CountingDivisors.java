package numberTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingDivisors {
    static ArrayList<Integer> list=new ArrayList<>();
	static HashMap<Integer,Integer> map=new HashMap<>();
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		sieve(new int[100005]);
		sieveBasedApproach(n);
		int ans=1;
		for(Map.Entry<Integer,Integer> e: map.entrySet()) {
			ans*=(e.getValue()+1);
		}
		System.out.println(ans);
		s.close();
	}
	
	public static void sieveBasedApproach(int n) {
		int m=(int)Math.sqrt(n);
		for(int i:list){
			if(i>m) {
				break;
			}
			if(n%i==0) {
				map.put(i,0);
			while(n%i==0) {
				n=n/i;
				map.put(i, map.get(i)+1);
			}
			}
		}
		if(n!=1) {
			map.put(n,1);
		}
	}

	public static void sieve(int []a) {
		a[2]=1;
		list.add(2);
		for(int i=3;i<a.length;i+=2)
		{
		a[i]=1;	
		}
		for(int i=3;i<a.length;i+=2) {
			if(a[i]==1) {
				list.add(i);
			for(int j=i*i;j<a.length&&j>=0;j+=i) {
				a[j]=0;
			}
			}
		}
	}
}
