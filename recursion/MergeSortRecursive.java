package recursion;

public class MergeSortRecursive {

	public static void main(String[] args) {
		int []a= {5,8,7,1,3,2,6,4};
		int n=7;
		mergeSort(a,0,n);
		for(int i:a) {
			System.out.println(i);
		}
	}
	
	public static void mergeSort(int []a,int l,int r) {
		if(l==r) {
			return; 
		}
		int mid=(l+r)/2;
		mergeSort(a,l,mid);
		mergeSort(a,mid+1,r);
		merge(a,l,r);
	}

	public static void merge(int []a,int l,int r) {
		int mid=(l+r)/2;
		int i=l;
		int j=mid+1;
		int k=l;
		int []temp=new int[2*a.length];
		while(i<=mid&&j<=r) {
			if(a[i]<=a[j]) {
				temp[k++]=a[i++];
			}
			else {
				temp[k++]=a[j++];
			}
		}
		while(i<=mid) {
			temp[k++]=a[i++];
		}
		while(j<=r) {
			temp[k++]=a[j++];
		}
		for(int p=l;p<=r;p++) {
			a[p]=temp[p];
		}
	}
}
