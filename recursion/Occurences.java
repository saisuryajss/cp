package recursion;

public class Occurences {

	public static void main(String[] args) {
	    int []a= {1,7,2,9,7,1,1,7,7,7,7,8,7,7};
	    System.out.println(firstOccurence(a, 7, 0));
	    System.out.println(lastOccurence(a, 7, 0));
        allOccurences(a, 7, 0);
	}

	public static int firstOccurence(int []a,int i,int idx) {
		if(idx==a.length) {
			return -1;
		}
		if(a[idx]==i) {
			return idx;
		}
		else {
			return firstOccurence(a, i, ++idx);
		}
	}
	
	public static int lastOccurence(int []a,int i,int idx) {
		if(idx==a.length) {
			return -1;
		}
		int temp=lastOccurence(a, i, idx+1);
		if(temp==-1) {
			if(a[idx]==i) {
				return idx;
			}
			return -1;
		}
		else {
			return temp;
		}
	}
	
	public static void allOccurences(int []a,int i,int idx) {
		if(idx==a.length) {
			return;
		}
		if(a[idx]==i) {
			System.out.print(idx+" ");
		}
		allOccurences(a,i,++idx);
	}
}
