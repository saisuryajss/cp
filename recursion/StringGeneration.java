package recursion;

import java.util.Scanner;
import java.util.TreeSet;

public class StringGeneration {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String k=s.next();
		TreeSet<String> set=new TreeSet<String>();
        find(k,0,1,"",set);
        System.out.println(set);
        s.close();
	}
	
	public static void find(String k,int i,int j,String ans,TreeSet<String> set) {
		if(j>=(k.length()+1)||i>=k.length()) {
		     if(j-i==1) {
		    	 set.add(ans);
		     }
		     return;
		}
		int num=Integer.parseInt(k.substring(i,j));
		if(num>=27) {
			return;
		}
		else {
			int temp=j-i;
			find(k,i+temp,j+1,ans+""+(char)(num+96),set);
			find(k,i,j+1,ans,set);
		}
	}

}
