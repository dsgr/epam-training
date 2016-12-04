package com.epam.training.dataaccess.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.epam.training.dataaccess.model.User;

public final class UserMapper implements RowMapper<User> {
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long id = rs.getLong("id");
		String fName = rs.getString("f_name");
		String lName = rs.getString("l_name");
		String address = rs.getString("address");
		String login =  rs.getString("login");
		String password = rs.getString("password");
		boolean isBlocked = rs.getBoolean("is_blocked");
		boolean isAdmin = rs.getBoolean("is_admin");
		double balance = rs.getDouble("balance");
		String email = rs.getString("email");
		
		User u = new User();
		u.setId(id);
		u.setfName(fName);
		u.setlName(lName);
		u.setAddress(address);
		u.setLogin(login);
		u.setPassword(password);
		u.setBlocked(isBlocked);
		u.setAdmin(isAdmin);
		u.setBalance(balance);
		u.setEmail(email);
				
		return u;
	}
}