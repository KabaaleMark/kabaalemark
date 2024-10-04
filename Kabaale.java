package kabaale;

public class Kabaale {

	public static void main(String[] args) {
         // For loop
		for (int i = 1; i <= 3; i++) {
			System.out.println("For loop count: " + i);
		}
	
		System.out.println("-----");
		
		// While loop
		int count = 1;
		while (count <= 3) {
			System.out.println("while loop count: " + count);
			count++;
		}
		
		System.out.println("-----");
		
		// Do-while loop
		int num = 3;
		do {
			System.out.println("Do-while loop count: " + num);
			num--;
		} while (num > 0);
	}

}
