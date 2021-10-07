package recursion;


public class BubbleSortRecursion {

	public static void main(String[] args) {
		int []a= {5,4,1,3,2};
		int n=5;
		bubble_sort(a, n);
        for(int i:a) {
        	System.out.println(i);
        }
	}
	
	public static void bubble_sort(int []a,int n) {
		if(n==1) {
			return;
		}
		for(int j=0;j<n-1;j++) {
			if(a[j]>a[j+1]) {
				int temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
			}
		}
		bubble_sort(a,n-1);
	}
	
	public static void bubble_sort(int []a,int j,int n) {
		if(n==1) {
			return;
		}
		if(j==n-1) {
			bubble_sort(a,0,n-1);
			return;
		}
		if(a[j]>a[j+1]) {
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
		bubble_sort(a,j+1,n);
	}

}
