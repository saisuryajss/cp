package recursion;

public class BinarySearchRecursion {

	public static void main(String[] args) {
		int []a= {1,2,6,9,12,15};
        System.out.println(indexOf(20,a,0,5));
	}
	
	public static int indexOf(int i,int []a,int l,int r) {
		if(l==r) {
			if(a[l]==i) {
				return l;
			}
			else {
				return -1;
			}
		}
		if(l>r) {
			return -1;
		}
		int mid=(l+r)/2;
		if(i<a[mid]) {
			return indexOf(i,a,l,mid-1);
		}
		else if(i==a[mid]) {
			return mid;
		}
		else {
			return indexOf(i,a,mid+1,r);
		}
	}

}
