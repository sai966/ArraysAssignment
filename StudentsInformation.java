package assignment2;

import java.util.Scanner;

public class StudentsInformation {

	public static void main(String[] args) {
		System.out.println("Please Enter number of Student");
		Scanner sc = new Scanner(System.in);
		int studentCount = sc.nextInt();
		String[] studentDetails = new String[studentCount];
		for(int i=0;i<studentCount;i++)
		{
			System.out.println("Please Enter Name");
			String name = sc.next();
			System.out.println("Please Enter Email");
			String email = sc.next();
			studentDetails[i] = name +","+email;
		}
		System.out.println("Please enter which student details are you looking for");
		int studentNumber = sc.nextInt();
		if(studentDetails.length >= studentNumber)
		{
			System.out.println("Studen Name " +studentDetails[studentNumber-1].split(",")[0]);
			System.out.println("Studen Email " +studentDetails[studentNumber-1].split(",")[1]);
		}else
		{
			System.out.println("Please enter a valid student details");
		}
		

	}

}
