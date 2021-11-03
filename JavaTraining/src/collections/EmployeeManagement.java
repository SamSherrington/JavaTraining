package collections;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> empNameList = new ArrayList<String>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("How many names do you want to add to the system?");
		int num = sc.nextInt();
		
		EmployeeManagement empMgmt = new EmployeeManagement();
		empMgmt.addEmpName(num, empNameList);

	}
	
	public void addEmpName(int numEmp, ArrayList<String> empList) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <= numEmp; i++) {
			
			System.out.println("Enter the name of the employee");
			String name = sc.nextLine();
			empList.add(name);
		}
	}

}
