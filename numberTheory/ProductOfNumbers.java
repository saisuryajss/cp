package numberTheory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProductOfNumbers {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		ArrayList<Integer> primes = sieve(new int[100000]);
		while (t-- != 0) {
			int n = s.nextInt();
			HashMap<Integer, Integer> map = sieveBasedApproach(n, primes);
			int a=0,b=0,c=0;
			int count=0;
			for(Map.Entry<Integer,Integer> e:map.entrySet()) {
				if(count==0) {
					a=e.getKey();
					count++;
				}
				else if(count==1) {
					b=e.getKey();
					count++;
				}
				else {
					break;
				}
			}
			if(b==0) {
				b=a*a;
			}
			c=n/(a*b);
			if(a==b||b==c||c==a||c<2||a<2||b<2||a>=n||b>=n||c>=n) {
				if(t!=0)
				System.out.println("NO");
				else 
					System.out.print("NO");
			}
			else {
				if(t!=0) {
				System.out.println("YES");
				System.out.println(a+" "+b+" "+c);
				}
				else {
					System.out.println("YES");
					System.out.print(a+" "+b+" "+c);
				}
			}
		}
		s.close();
	}

	public static HashMap<Integer, Integer> sieveBasedApproach(int n, ArrayList<Integer> primes) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i : primes) {
			if (i*i >n) {
				break;
			}
			if (n % i == 0) {
				int count = 0;
				while (n % i == 0) {
					n = n / i;
					count++;
				}
				map.put(i, count);
			}
		}
		if (n != 1) {
			map.put(n, 1);
		}
		return map;
	}

	public static ArrayList<Integer> sieve(int[] a) {
		ArrayList<Integer> primes = new ArrayList<>();
		a[2] = 1;
		primes.add(2);
		for (int i = 3; i < a.length; i += 2) {
			a[i] = 1;
		}
		for (int i = 3; i < a.length; i += 2) {
			if (a[i] == 1) {
				primes.add(i);
				for (int j = i * i; j < a.length && j >= 0; j += i) {
					a[j] = 0;
				}
			}
		}
		return primes;
	}
}
