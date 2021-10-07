package recursion;
import java.util.*;
public class Anagram {

	public static void main(String[] args) {
		String []wordSet= {"the","bats","tabs","in","cat","act"};
		String []sentences= {"cat the bats","in the act","act tabs in"};
		int []m=countSentences(wordSet,sentences);
		for(int i:m) {
			System.out.println(i);
		}
	}
	
	public static int[] countSentences(String []a,String []b) {
		HashMap<String,ArrayList<String>> map=new HashMap<>();
		int []m=new int[b.length];
		for(int i=0;i<a.length;i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i],new ArrayList<String>());
			}
			for(int j=0;j<a.length;j++) {
				if(i==j) {
					continue;
				}
				if(a[i].length()==a[j].length()) {
					if(check(a[i],a[j])) {
						map.get(a[i]).add(a[j]);
					}
				}
			}
		}
		
		for(int i=0;i<b.length;i++) {
			String [] temp=b[i].split(" ");
			int count=1;
			for(int j=0;j<temp.length;j++) {
			    count=count*(map.get(temp[j]).size()+1);
			}
			m[i]=count;
		}
		return m;
	}

	public static boolean check(String a,String b) {
		int []p=new int[26];
		for(int i=0;i<a.length();i++) {
			p[a.charAt(i)-97]++;
		}
		for(int i=0;i<a.length();i++) {
			p[b.charAt(i)-97]--;
		}
		for(int i=0;i<26;i++) {
			if(p[i]!=0) {
				return false;
			}
		}
		return true;
	}
}
