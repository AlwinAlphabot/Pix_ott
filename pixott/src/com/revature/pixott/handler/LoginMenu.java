package com.revature.pixott.handler;

import java.util.List;

import com.revature.pixott.dao.Menudao;
import com.revature.pixott.dao.SearchMoviesdao;
import com.revature.pixott.dao.Top5Moviesdao;

public class LoginMenu {
	public static void display() {
		System.out.println();
		System.out.println("==============");
		System.out.println("1. Top5Movies");
		System.out.println("2. SearchMovies");
		System.out.println("3. YourWishList");
		System.out.println("4. ViewHistory");
		System.out.println("5. Logout");
		System.out.println("==============");
		System.out.println("Select Option");
		int option = App.scanner.nextInt();
		if (option == 1) {
			
			Top5Moviesdao review = new Top5Moviesdao();
			List<Top5Movies> result = review.Top();
			result.forEach(System.out::println);
			LoginMenu.display();
		}
		
		else if (option == 2) {
			App.scanner.nextLine();
			String name = App.scanner.nextLine();
			SearchMoviesdao.Search(name);
			System.out.println("   ");
			Menudao.display();
		}
		else if (option == 3) {
			Menudao.display();
			
		} 
		
		else if (option == 4) {
			ViewHistory.display();
		} 
		
		else if (option == 5) {
			Logout.display();
		} 
		else if(option==9) {
			AdminHandler.display();
		}
	}
}
