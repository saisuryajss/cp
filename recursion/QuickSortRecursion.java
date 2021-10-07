package recursion;

public class QuickSortRecursion {

	public static void main(String[] args) {
		int []a= {2,7,8,6,1,1,4};
		quickSort(a,0,6);
        for(int i:a) {
        	System.out.println(i);
        }
	}
	
	public static void quickSort(int []a,int l,int r) {
		if(l>=r) {
			return;
		}
		int p=partition(a,l,r);
		quickSort(a,l,p);
		quickSort(a,p+1,r);
	}
	
	public static int partition(int []a,int l,int r) {
		int i=l-1;
		int j=l;
		int pivot=a[r];
		for(;j<=r-1;j++) {
			if(a[j]<=pivot) {
				i=i+1;
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			j=j+1;
		}
		int temp=a[i+1];
		a[i+1]=a[r];
		a[r]=temp;
		return i+1;
	}

}
