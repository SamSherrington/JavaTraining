package operatorsAndVariables;

import java.util.Scanner;

public class AreaDemo {

	// This class reads the length and width of a plot of land and a construction area. The final result calculated is
	// the open area (none construction area).
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		// This declares a scanner, to read values from user input
		
		System.out.println("Enter plot length");
		double plotLength = sc.nextDouble(); // This allows reading of a double value
		
		System.out.println("Enter plot width");
		double plotWidth = sc.nextDouble();
		
		System.out.println("Enter construction area length");
		double constLength = sc.nextDouble();
		
		System.out.println("Enter construction area width");
		double constWidth = sc.nextDouble();
		
		double openArea = calculateArea(plotLength, plotWidth, constLength, constWidth); // Calls the calculateArea method
		System.out.println("Open area = " + openArea);
		
		}
	
	public static double calculateArea(double plotLength, double plotWidth, double constLength, double constWidth) {
		
		double openArea = 0;
		
		openArea = plotLength*plotWidth  - constLength*constWidth;
		
		return openArea;
	}

}
