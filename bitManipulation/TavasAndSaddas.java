package bitManipulation;

import java.util.Scanner;

public class TavasAndSaddas {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char []a=s.next().toCharArray();
		int ans=(1<<a.length)-2;
		for(int i=a.length-1,pos=0;i>=0;i--,pos++) {
			if(a[i]=='7') {
				ans+=(1<<pos);
			}
		}
		System.out.println(ans+1);
		s.close();
	}

}