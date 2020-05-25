package studentDatabaseApp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		
		//Ask the number of students
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents = in.nextInt();
		Student[] students = new Student[numOfStudents];
		
		for (int i = 0; i < numOfStudents; i++) {
			students[i] = new Student();
			students[i].Enroll();
			students[i].payTuition();
		}
		
		for (int i = 0; i < numOfStudents; i++) {
			System.out.println(students[i].toString());
		}
		
		
		//Create students
		

	}

}
