package recursion;

public class InversionCount {

	public static void main(String[] args) {
		int []a= {1,5,2,6,3,0};
		int n=5;
		System.out.println(inver(a,0,n));
	}
	
	public static int inver(int []a,int l,int r) {
		if(l==r) {
			return 0;
		}
		int mid=(l+r)/2;
		int fp=inver(a,l,mid);
		int sp=inver(a,mid+1,r);
		return fp+sp+merge(a,l,r);
	}
	
	public static int merge(int []a,int l,int r) {
	    int mid=(l+r)/2;
	    int i=l;
	    int j=mid+1;
	    int ans=0;
	    int k=l;
	    int []temp=new int [2*a.length];
	    while(i<=mid&&j<=r) {
	    	if(a[i]>a[j]) {
	    		ans+=(mid-i+1);
	    		temp[k++]=a[j++];
	    	}
	    	else {
	    		temp[k++]=a[i++];
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
	    return ans;
	}
}
