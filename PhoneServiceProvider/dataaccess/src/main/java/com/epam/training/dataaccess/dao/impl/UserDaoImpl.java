package com.epam.training.dataaccess.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.epam.training.dataaccess.dao.UserDao;
import com.epam.training.dataaccess.dao.mapper.UserMapper;
import com.epam.training.dataaccess.model.User;
import com.epam.training.dataaccess.model.Service;

@Repository
public class UserDaoImpl implements UserDao {

	// public static long ID_GEN;

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public User getById(long id) {
		return jdbcTemplate.queryForObject("select * from users where id = ?", new Object[] { id }, new UserMapper());
	}

	@Override
	public List<User> getAll() {
		return jdbcTemplate.query("SELECT * FROM users", new UserMapper());

	}

	@Override
	public Long insert(final User user) {

		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO users (f_name, l_name, address, is_blocked, is_admin, login, password, balance, email) VALUES (?,?,?,?,?,?,?,?,?)",
						new String[] { "id" });
				ps.setString(1, user.getfName());
				ps.setString(2, user.getlName());
				ps.setString(3, user.getAddress());
				ps.setBoolean(4, user.isBlocked());
				ps.setBoolean(5, user.isAdmin());
				ps.setString(6, user.getLogin());
				ps.setString(7, user.getPassword());
				ps.setDouble(8, user.getBalance());
				ps.setString(9, user.getEmail());
				return ps;
			}
		}, keyHolder);
		return keyHolder.getKey().longValue();

	}

	@Override
	public void update(User u) {
		jdbcTemplate.update(
				"UPDATE users SET f_name=?, l_name=?, address=?, is_blocked=?, is_admin=?, login=?, password=?, balance=?, email=? where id=?",
				u.getfName(), u.getlName(), u.getAddress(), u.isBlocked(), u.isAdmin(), u.getLogin(), u.getPassword(),
				u.getBalance(), u.getEmail(), u.getId());

	}

	@Override
	public void addServiceToUser(long userId, long serviceId) {
		jdbcTemplate.update("INSERT INTO users_has_services (user_id, service_id) VALUES(?, ?)", userId, serviceId);

	}

	@Override
	public void removeServiceFromUser(long userId, long serviceId) {
		jdbcTemplate.update("DELETE FROM users_has_services WHERE user_id=? AND service_id=?", userId, serviceId);

	}

	@Override
	public boolean exist(long id) {
		int count = jdbcTemplate.queryForInt("SELECT COUNT(*) FROM users WHERE id=?", id);

		if (count > 0) {
			return true;
		} else {
			return false;
		}
	}
/*
	@Override
	public List<Service> getUserServices(Long userId) {
		SELECT * FROM services WHERE id	IN (SELECT service_id FROM users_has_services WHERE user_id =1)
		
		return jdbcTemplate.query("SELECT * FROM users", new UserMapper());
		return null;
	}
*/
}
