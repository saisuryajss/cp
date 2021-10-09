package recursion;
import java.util.Scanner;
import java.util.TreeSet;

public class PermutationsOfString {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		StringBuilder sb=new StringBuilder(s.next());
		//System.out.println(find(sb,0));
		TreeSet<String> set=find(sb,0);
		for(String temp:set) {
			System.out.println(temp);
		}
		s.close();
	}
	
	public static TreeSet<String> find(StringBuilder sb,int i) {
		if(sb.length()==i) {
			TreeSet<String> list=new TreeSet<String>();
			list.add("");
			return list;
		}
		TreeSet<String> temp=find(sb,i+1);
		TreeSet<String> list=new TreeSet<String>();
		for(String k:temp) {
			for(int j=0;j<=k.length();j++) {
				list.add(k.substring(0,j)+sb.charAt(i)+k.substring(j));
			}
		}
		return list;
	}
}
