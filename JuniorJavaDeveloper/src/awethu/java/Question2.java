package awethu.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File filename=new File("Students.txt");
		
		
		FileOutputStream student=new FileOutputStream(filename);
		
		
	
	
	File filename2=new File("Results.txt");
	
	
	addDetails();
	getStudentsDetails();
	calculateFinalMark(null,0, 0, 0, 0,0);
	}
	private static void calculateFinalMark(String grade,double finalMark,int classtest1,int classtest2,int summative,int exam) {
		// TODO Auto-generated method stub
		finalMark=((classtest1+classtest2+summative)/3)*0.5+(exam*0.6);
		if(finalMark>40)
		{
			grade="d";
		}
		if(finalMark>50)
		{
			grade="c";
		}
		if(finalMark>60)
		{
			grade="d";
		}
		if(finalMark>70)
		{
			grade="A";
		}
		if(finalMark>80)
		{
			grade="A+";
		}
		else
		{
			grade="Failed";
		}
		System.out.println(grade);
	}
	private static void addDetails( ) throws IOException{
		// TODO Auto-generated method stub
		
		
	
		try(Scanner str=new Scanner(System.in))
		{
		
		System.out.println("Name: ");
		String name=str.next();
		System.out.println("Surname: "+str.nextLine());
		String surname=str.next();
		System.out.println("Subject: "+str.nextLine());
		String subject=str.next();
		System.out.println("Class Test1: "+str.nextLine());
		int ct1=str.nextInt();
		System.out.println("Class Test 2: "+str.nextLine());
		int ct2=str.nextInt();
		System.out.println("Summative: "+str.nextLine());
		int summative=str.nextInt();
		System.out.println("Exams: "+str.nextLine());
		int exam=str.nextInt();
		
		
		
		try(BufferedWriter students=new BufferedWriter(new FileWriter("Students.txt")))
		{
			students.newLine();
		students.write(name);
		students.write(subject);
		students.write(surname);
		students.write(exam);
		students.write(summative);
		students.write(ct2);
		students.write(ct1);
		students.newLine();
		}
		}
	}
private static List<Students>getStudentsDetails() throws IOException  {
		
		FileReader filename=new FileReader("Students.txt");
		BufferedReader student=new BufferedReader(filename);
		System.out.println(student.readLine());
		return null;
		
	}
	
}
