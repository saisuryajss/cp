package recursion;

import java.util.Scanner;

public class FriendsPairingProblem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t--!=0) {
			int n=s.nextInt();
			System.out.println(find(n));
		}
        s.close();
	}
	
	public static long find(int n) {
		if(n<0) {
			return 0;
		}
		if(n==0) {
			return 1;
		}
		return find(n-1)+(n-1)*find(n-2);
	}

}
