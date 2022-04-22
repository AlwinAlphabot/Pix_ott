package com.revature.pixott.handler;

import com.revature.pixott.dao.Userdao;
import com.revature.pixott.model.User;

public class LoginHandler {
	public static void display() {
		System.out.println(" <- Login ->");
		System.out.println("============");
		System.out.println("Mobile:");
		String mobile = App.scanner.next();
		System.out.println("Password:");
		String password = App.scanner.next();

		Userdao dao = new Userdao();
		User user = dao.login(mobile, password);

		if (user.getMobile().equals(mobile) && user.getPassword().equals(password)) {
			System.out.println("Login Succesfully ");
			System.out.println("    ");
			System.out.println("Welcome Back"+" "+user.getName());
			System.out.println("  ");
			System.out.println("Its Multiplex Time");
			LoginMenu.display();
		} else if(mobile=="9999" && password=="pass" ){
			System.out.println("Admin Loged in Succesfully");
			AdminHandler.display();
		}else {
			System.out.println("Your are Enterd Invalid Mobile Number and Password");
		}
	}
}
