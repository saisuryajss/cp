package bitManipulation;

import java.util.Scanner;

public class CommonTasks {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("isOdd "+isOdd(n));
        System.out.println("getBit "+getBit(n,2));
        //setBit(n,1);
        System.out.println(setBit(n,2));
        System.out.println(clearBit(n,1));
        s.close();
        decToBin(n);
	}
	
	public static boolean isOdd(int n) {
		if((n & 1) ==1) {
			return true;
		}
		else {
			return false;
		}
	}
	public static int getBit(int n,int i) {
		int mask=(1<<i);
		int bit=(n&mask)>0?1:0;
		return bit;
	}
 
	public int clearLastIBits(int n,int i) {
		int mask=(-1<<i);
		return n&mask; 
	}
	
	public static int setBit(int n,int i) {
		int mask=(1<<i);
	return n=(n|mask);
	}
	public static int clearBit(int n,int i) {
		int mask=(1<<i);
		mask=(~mask);
		return (n&mask);
	}
	public static int updateBit(int n,int i,int v) {
		int mask=~(1<<i);
		int cn=(n&mask);
		return (cn|(v<<i));
	}
	public static void decToBin(int n) {
		int b=0;
		int p=1;
		while(n>0) {
			b+=(n&1)*p;
			n=(n>>1);
			p=p*10;
		}
		System.out.print(b);
	}
}
