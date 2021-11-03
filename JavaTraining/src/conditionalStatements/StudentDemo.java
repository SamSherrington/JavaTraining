package conditionalStatements;

public class StudentDemo {
	
	// This class reads Student objects and compares their marks. The student with the highest mark is returned.

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student one = new Student(1, "Sam", 75);
		Student two = new Student(2, "Brad", 62);
		Student three = new Student(3, "Matt", 41);
		
		System.out.println("Student with highest marks is " + compareStudents(one, two, three));
		}
	
	public static String compareStudents(Student one, Student two, Student three) {
		
		Student st = one;
		
		if(two.getMarks() > st.getMarks())
			st = two;
		
		if(three.getMarks() > st.getMarks())
			st = three;
		
		return st.getName();
	}

}
