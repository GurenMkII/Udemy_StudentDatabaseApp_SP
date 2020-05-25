package studentDatabaseApp;

import java.util.Scanner;

public class Student {
	private String firstName, lastName, studentId, courses="";
	private int gradeYear, tuitionBalance=0; 
	private static int costOfCourse = 600, id = 1000;
	
	//Constructor - name and year.
	public Student() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter Student first name: ");
		this.firstName = scanner.nextLine();
		
		System.out.print("Enter Student last name: ");
		this.lastName = scanner.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = scanner.nextInt();
		setStudentId();
		
		
	}
				
	//Generate a unique 5-digit ID, first number is the grade lvl
	private void setStudentId() {
		id++;
		this.studentId = gradeYear +""+id;
	}
	
	
	//Ability to enroll in classes: History 101, Mathematics 101, English 101, Chemistry 101, Computer Science 101.
	//$600 fee to enroll in each class
	public void Enroll() {
		do {
			System.out.print("Enter course to enroll(Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n  " + course;
				tuitionBalance += costOfCourse;
			} else {
				break;
			}			
		}while (1 != 0);
			
		
	}
	
	//Student view their balance
	public void viewBalance() {
		System.out.println("TUITION BALANCE: $"+tuitionBalance);
	}
	
	//Student pay the tuition
	public void payTuition() {
		viewBalance();
		System.out.print("Please enter your payment amount: $");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance -= payment;
		System.out.println("Thank you for your payment of: $"+payment);
		viewBalance();
	}
	
	//See the status of the student(name, ID, courses enrolled, balance).
	@Override
	public String toString() {
		return "\nName: " + firstName+" "+lastName+
				"\nGrade level: "+ gradeYear+
				"\nStudentID: "+studentId+
				"\nCourses Enrolled: "+courses+
				"\nBalance: $"+tuitionBalance;
	}

}
