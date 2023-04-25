package week1.day1;

public class student {
	public void student() {
		String studentname ="ANIDRA ";
		int rollno= 7272 ;
		String collegename= "PKR college";
		int marksscored= 75;
		float cgpa= 7.5f;
	
		
		System.out.println("student name:"+studentname);
		System.out.println("rollno :"+rollno);
		System.out.println("college name:"+ collegename);
		System.out.println("marksscored:"+marksscored);
		System.out.println("cpga:"+cgpa+"%");
	}
		public static void main(String[] args) {
		student obj = new student();
         System.out.println("student detail");
		obj.student();
	
		}
}
		
	
