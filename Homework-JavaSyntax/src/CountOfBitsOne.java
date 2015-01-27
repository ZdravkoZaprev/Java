import java.util.Scanner;


public class CountOfBitsOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		int ones = 0;
		
		while (number > 0) {
			int bit = number & 1;
			if (bit == 1) {
				ones++;
			}
			number >>= 1;
		}
		System.out.println(ones);

	}

}