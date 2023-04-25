package week1.day1;

public class bike {
	public void applybreak() {
		System.out.println("applybreak");
		
	}
	private void soundhorn() {
		System.out.println("sound horn");
		
	}

	public static void main(String[] args) {
		
		bike obj = new bike();
		obj.applybreak();
		obj.soundhorn();

	}

}
