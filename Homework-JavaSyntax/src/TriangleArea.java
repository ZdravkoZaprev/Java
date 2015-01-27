import java.util.Scanner;


public class TriangleArea {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int aX = scan.nextInt();
		int aY = scan.nextInt();
		int bX = scan.nextInt();
		int bY = scan.nextInt();
		int cX = scan.nextInt();
		int cY = scan.nextInt();
		
		int firstPoint = bY - cY;
		int secondPoint = cY - aY;
		int thirdPoint = aY - bY;
		
		int area = Math.abs(aX * firstPoint + bX * secondPoint + cX * thirdPoint) / 2;
		System.out.println(area);
	}
}
