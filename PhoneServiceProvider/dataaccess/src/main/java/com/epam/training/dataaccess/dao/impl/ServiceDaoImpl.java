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

import com.epam.training.dataaccess.dao.ServiceDao;
import com.epam.training.dataaccess.dao.mapper.ServiceMapper;
import com.epam.training.dataaccess.dao.mapper.UserMapper;
import com.epam.training.dataaccess.model.Service;

public class ServiceDaoImpl implements ServiceDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Long insert(final Service service) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO services (name, price, description) VALUES (?,?,?)", new String[] { "id" });
				ps.setString(1, service.getName());
				ps.setDouble(2, service.getPrice());
				ps.setString(3, service.getDescription());
				return ps;
			}
		}, keyHolder);
		return keyHolder.getKey().longValue();
	}

	@Override
	public void update(Service service) {
		jdbcTemplate.update("UPDATE servicess SET name=?, price=?, description=? where id=?", service.getName(),
				service.getPrice(), service.getDescription(), service.getId());
	}

	@Override
	public Service getById(long id) {
		return jdbcTemplate.queryForObject("select * from services where id = ?", new Object[] { id },
				new ServiceMapper());
	}

	@Override
	public List<Service> getUserServices(Long userId) {
		return jdbcTemplate.query(
				"SELECT * FROM services WHERE id	IN (SELECT service_id FROM users_has_services WHERE user_id =?)",
				new Object[] { userId }, new ServiceMapper());
	}

}
