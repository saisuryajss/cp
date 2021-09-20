package bitManipulation;

import java.util.Scanner;

public class UniqueNum2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int []a=new int[n];
        int xor=0;
        for(int i=0;i<n;i++) {
        	a[i]=s.nextInt();
        	xor=(xor^a[i]);
        }
        int temp=xor;
        int pos=0;
        while((temp&1)!=1) {
        	pos++;
        	temp=temp>>1;
        }
        int mask=(1<<pos);
        int p=0,q=0;
        for(int i=0;i<n;i++) {
        	if((a[i]&mask)>0) {
        		if(p!=0)
        		p=p^a[i];
        		else
        			p=a[i];
        	}
        }
        q=xor^p;
        System.out.println(Math.min(p, q)+" "+Math.max(p, q));
	    s.close();
	}

}
