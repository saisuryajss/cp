package recursion;

public class SubsetGeneration {

	public static void main(String[] args) {
		String st="abc";
		find(st,0,"");
	}
	public static void find(String st,int i,String ans) {
		if(i==st.length()) {
			System.out.println(ans);
			return;
		}
		find(st,i+1,ans+""+st.charAt(i));
		find(st,i+1,ans);
	}
}
