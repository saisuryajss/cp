package math;

import java.util.Scanner;

public class BirthdayParadox {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        double x=1.0D;
        int people=0;
        float num=365,denom=365;
        float n=s.nextFloat();
        while(x>1-n) {
        	x=x*(num/denom);
        	num--;
        	people++;
        	System.out.println(people+" "+x);
        }
        s.close();
	}

}
