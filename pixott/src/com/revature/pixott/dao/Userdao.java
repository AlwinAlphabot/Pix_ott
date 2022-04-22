package com.revature.pixott.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.revature.pixott.model.User;

public class Userdao {
	public void signup(User user) {
		String sql = "insert into user (name,mobile,password)values (?,?,?)";
		try (Connection conn = Util.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql);) {
			// System.out.println("connected Succesfully");
			stmt.setString(1, user.getName());
			stmt.setString(2, user.getMobile());
			stmt.setString(3, user.getPassword());
			stmt.execute();
			System.out.println(user.getName() + "  " + " Added Succesfully");
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public User login(String mobile,String password) {
		String sql = "select * from user where mobile = ? && password=?";
		try (Connection conn = Util.getConnection();
				PreparedStatement stmt = conn.prepareStatement(sql);
				) {
			stmt.setString(1, mobile);
			stmt.setString(2, password);
			ResultSet rs = stmt.executeQuery();
			if (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setMobile(rs.getString("mobile"));
				user.setName(rs.getString("name"));
				user.setPassword(rs.getString("password"));
				return user;
			} else {
				System.out.println("invalid login details");
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

}
