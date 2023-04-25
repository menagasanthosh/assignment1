package week1.day1;

public class mobile {
	private void sendsms() {
		System.out.println("send sms");
	}
      protected void Allowvoicecall() {
    	  System.out.println("Allow voice call");
      }
      private void takevideo() {
    	  System.out.println("take video");
      }
      
	public static void main(String[] args) {
		
		mobile obj = new mobile();
		obj.Allowvoicecall();
		obj.sendsms();
		obj.takevideo();
	
 
} 
	

	
	

	

}
