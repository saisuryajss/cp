package recursion;

public class GenerateBrackets {

	public static void main(String[] args) {
		int n=5;
        find(n,0,0,"");
	}
	
	public static void find(int n,int i,int j,String ans) {
		if(i>n||j>n) {
			return;
		}
		if(i==n&&j==n) {
			System.out.println(ans);
			return;
		}
		//System.out.println(i+" "+j);
		if(i==0) {
			find(n,i+1,j,ans+"(");
		}
		else if(j<=i) {
			find(n,i+1,j,ans+"(");
			find(n,i,j+1,ans+")");
		}
		else {
			find(n,i,j+1,ans+")");
		}
	}

}
