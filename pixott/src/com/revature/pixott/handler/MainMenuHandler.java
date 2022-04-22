package com.revature.pixott.handler;
import java.util.Scanner;
public class MainMenuHandler {
	public static void display() {
		System.out.println("===================");
		System.out.println("Welcome to Pixott");
		System.out.println("MainMenu");
		System.out.println("========");
		System.out.println("1.Signup");
		System.out.println("2.LogIn");
		System.out.println("3.Exit");
		System.out.println("Enter Option");
		Scanner sc=new Scanner(System.in);
		int option=sc.nextInt();
		if(option==1) {
			 SignUp.display();
			 MainMenuHandler.display();
		}
		else if(option==2) {
			LoginHandler.display();
		}
		else if(option==3){
			System.out.println("Thanks for Visit,Come Again!!!");
		}
		sc.close();
	}
}
