package bitManipulation;

import java.util.Scanner;

public class UltraFastMathematicians {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t!=0) {
		StringBuilder sb=new StringBuilder(s.next());
		String s2=s.next();
		for(int i=0;i<sb.length();i++) {
			if(sb.charAt(i)!=s2.charAt(i)) {
				sb.setCharAt(i, '1');
			}
			else {
				sb.setCharAt(i, '0');
			}
		}
        System.out.println(sb.toString());
        t--;
		}
		s.close();
	}

}
