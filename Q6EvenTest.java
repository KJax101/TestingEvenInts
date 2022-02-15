package Q6EvenTest;


import java.util.Scanner;

public class Q6EvenTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int x = 0;
		while (x < 100) {
			System.out.println(evenTest(scanner.nextInt()));
			x++;
		}
	
	}
	
	public static boolean evenTest(int i) {
		int test = i / 2;
		test = test * 2;
		// ints can't be decimal, so if you divide and multiply by two, the number should change 
		// because of rounding
		
		// Then just check if the new number is equal to the original
		if(test == i) 
			return true;
		
		else
			return false;
	}

}
