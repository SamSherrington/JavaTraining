package classes;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value");
		double one = sc.nextDouble();
		
		System.out.println("Enter second value");
		double two = sc.nextDouble();
		
		// Creates object by calling Calculator class
		Calculator calc = new Calculator(one, two);
		System.out.println("Addition:" + calc.add());
		System.out.println("Subtraction:" + calc.subtract());
		System.out.println("Multiplication:" + calc.multiply());
		System.out.println("Division:" + calc.divide());
		calc.setValueTwo(0);
		System.out.println("Result for division by zero:" + calc.divide());
		

	}

}
