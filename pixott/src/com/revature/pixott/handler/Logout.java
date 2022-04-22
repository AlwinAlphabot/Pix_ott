package com.revature.pixott.handler;

import com.revature.pixott.model.User;

public class Logout {
	public static void display() {
		Logout logout = new Logout();
		User user = new User();
		System.out.println(user);
		System.out.println("Logged Out Succesfully");
		MainMenuHandler.display();
	}

}
