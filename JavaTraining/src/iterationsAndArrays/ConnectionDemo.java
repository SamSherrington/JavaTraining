package iterationsAndArrays;

import java.util.Scanner;

public class ConnectionDemo {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		Connection[] connections = new Connection[3];
		
		for(int i = 0; i < connections.length; i++) {
			
			System.out.println("Enter connection id:");
			int connId = sc.nextInt();
			System.out.println("Enter customer id:");
			int custId = sc.nextInt();
			System.out.println("Enter customer email:");
			String email = sc1.nextLine();
			System.out.println("Enter customer balance:");
			double balance = sc.nextDouble();
			
			connections[i] = new Connection(connId, custId, email, balance);
		}
		
		double avgBalance = getAverageBalance(connections, 1);
		System.out.println("The average balance for the customer with id 1 is " + avgBalance);
		
	}
	
	public static double getAverageBalance(Connection[] connections, int custId) {
		
		double balance = 0;
		int custCount = 0;
		
		for(int i = 0; i < connections.length; i++) {
			
			if(custId == connections[i].getCustomerId()) {
				
				custCount++;
				balance = balance + connections[i].getBalance();
			}
		}
		
		balance = balance/custCount;
		return balance;
	}

}
