package week1.day1;

public class mobile1 {
  private void  makecall() {
	
	  String mobilmodel = "vivo";
	  float mobileweight= 20f;
	  System.out.println("mobile model:vivo");
	  System.out.println("mobile weight:20");
	  
	  
	  System.out.println("make call");
	  
  }
  
private void sendmsg() {
	System.out.println("send msg");
	boolean isFullcharged= true;
	int mobilecost= 20000;
	System.out.println("this mobile flly chsarged");
	System.out.println("mobile cost:Rs 20000");
	
}

public static void main(String[] args) {
		mobile1 obj = new mobile1();
		System.out.println("This is my mobile");
		obj.makecall();
		obj.sendmsg();

	}
}


