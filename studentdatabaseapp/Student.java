package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	private String firstName;
	private String lastName;
	private String courses = "";
	private String studentID;
	
	private int gradeYear;
	private int tuitionBalance = 0;
	
	/* Notes on static: not specific to an instance of an object, but is true for all objects. */
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName = in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.println("1 -Freshman\n2 - Sophormore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
		
	}
	
	// Generate an ID
	private void setStudentID() {
		// Grade Level + ID. Increment ID every time we create a new student (1000, 1001, 1002...).
		id++;
		this.studentID = gradeYear + "" + id;
		
	}
	
	// Enroll in courses
	public void enroll() {
		// Get inside a loop, user hits 0 when done enrolling
		do {
			System.out.println("Enter course to enroll (Q to quit): ");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			if(!course.equals("Q")) {
				courses = courses + course + "\n";
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else { break; }
		} while (1 != 0);
	}
	
	// View balance 
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment + "\n Your balance is: $" + tuitionBalance);
	}
	
	// Show status
	public String toString() {
		return "Name: " + firstName + " " + lastName +
				"\nGrade Level: " + gradeYear +
				"\nStudent ID: " + id +
				"\nCourses Enrolled: \n" + courses +
				"\nBalance: $" + tuitionBalance;
	}

}
