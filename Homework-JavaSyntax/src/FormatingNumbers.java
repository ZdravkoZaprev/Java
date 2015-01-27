import java.util.Scanner;


public class FormatingNumbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		   int a = scan.nextInt();
           double b = scan.nextDouble();
           double c = scan.nextDouble();
           
           String aInBinaryString = Integer.toBinaryString(a);
   		   int aInBinary = Integer.parseInt(aInBinaryString);

           System.out.printf("|%-10X|%010d|%10.2f|%-10.3f", a, aInBinary, b, c);
	}
}
