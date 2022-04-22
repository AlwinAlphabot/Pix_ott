package com.revature.pixott.handler;

import com.revature.pixott.dao.Userdao;
import com.revature.pixott.model.User;

public class SignUp {
	public static void display() {
		System.out.printf("%50s \n", "Thanks for choosing pix OTT Signup with the following details");
		System.out.println("====================================================================");
		System.out.println("Enter your Name:");
		String name = App.scanner.next();
		System.out.println("Enter your Mobile:");
		String mobile = App.scanner.next();
		System.out.println("Enter your Password:");
		String password = App.scanner.next();
		
		SignUp signup = new SignUp();
		User user = new User();
		user.setName(name);
		user.setMobile(mobile);
		user.setPassword(password);
		Userdao userdao = new Userdao();
		userdao.signup(user);
		//System.out.println(name+"Added Succesfully");
	}
}
