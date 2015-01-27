import java.util.Scanner;


public class TheSmallestOf3Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		
		double method = Math.min(a , b );
		double result = Math.min(method , c );
		
		System.out.println("Smallest number is: " +result);
	}
}
