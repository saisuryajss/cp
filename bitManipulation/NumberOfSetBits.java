package bitManipulation;


public class NumberOfSetBits {

	public static void main(String[] args) {
		//Scanner s=new Scanner(System.in);
		int ans=0;
		int n=5;
		while(n!=0) {
			ans+=(n&1);
			n=(n>>1);
		}
       System.out.println(ans);
       //efficient method
       while(n>0) {
    	   n=n&(n-1);
    	   ans++;
       }
	}

}
