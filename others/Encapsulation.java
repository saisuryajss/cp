package others;

public class Encapsulation {
   private String userName;
   private String address;
   private int mobileNo;
   
   public String getUserName() {
	return userName;
}

public void setUsername(String username) {
	this.userName = username;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public int getMobileNo() {
	return mobileNo;
}

public void setMobileNo(int mobileNo) {
	this.mobileNo = mobileNo;
}

	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setUsername("xyz");
		e.setAddress("hyderabad,India");
		e.setMobileNo(999999999);
        System.out.println(e.getUserName()+" "+e.getAddress()+" "+e.getMobileNo());
	}

}
