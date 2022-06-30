package com.test.admin.login;
import java.util.Scanner;

import com.test.mainQuiz.MainQuiz;

public class Adminlogin {

	public void adminlogin() {
		
		String username="admin";
		String passowrd="admin123";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello Admin Please enter username and Password");
		System.out.println("username:");
		String adminUserName = scanner.next();
		System.out.println("Passowrd:");
		String adminPassword = scanner.next();

		if (adminUserName.equals(username) && adminPassword.equals(passowrd)) {
              int i=1;
			
			while(i!=0) {
				
			Scanner scanner1 = new Scanner(System.in);
			System.out.println(" \n Admin SucessFully Logged in \n");
			
			System.out.println("1. Score of all students");
			System.out.println("2. Score of Particular Student");
			System.out.println("3. logout and go back to home page");
			
			int adminChoice = scanner1.nextInt();
			
			Adminlogin adminlogin = new Adminlogin();
			
			adminlogin.adminChoice(adminChoice);
			
			}		
			
		} else {

			System.err.println("Enter valid Credentials \n");
					
		}
		
		}	
	public void adminChoice(int choice) {

		switch (choice) {
		case 1:
			//call the all student score class method
			break;

		case 2:
			//call the specific student score class method
			break;

		case 3:

			System.out.println("Logging off..... ");
			System.out.println();
            MainQuiz mainQuiz = new MainQuiz();		    
		    mainQuiz.mainExcution();
			break;	

		default:

			System.out.println("you have Entered Wrong choice");
			break;

		}
		
	}
	}


