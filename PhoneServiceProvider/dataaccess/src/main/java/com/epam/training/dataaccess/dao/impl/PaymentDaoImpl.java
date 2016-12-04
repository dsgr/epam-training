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

import com.epam.training.dataaccess.dao.PaymentDao;
import com.epam.training.dataaccess.dao.mapper.PaymentMapper;
import com.epam.training.dataaccess.dao.mapper.UserMapper;
import com.epam.training.dataaccess.model.Payment;

@Repository
public class PaymentDaoImpl implements PaymentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Long insert(final Payment payment) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO payments (user_id, summ, date, comment) VALUES (?,?,?,?)",
						new String[] { "id" });
				ps.setLong(1, payment.getUserId());
				ps.setDouble(2, payment.getSumm());
				ps.setDate(3, payment.getDate());
				ps.setString(4, payment.getComment());
				return ps;
			}
		}, keyHolder);
		return keyHolder.getKey().longValue();
	}

	@Override
	public Payment getById(Long id) {
		return jdbcTemplate.queryForObject("SELECT * FROM payments WHERE id = ?", new Object[] { id }, new PaymentMapper());
	}

	@Override
	public List<Payment> getUserPayments(Long userId) {
		return jdbcTemplate.query("SELECT * FROM payments WHERE user_id=?", new Object[] {userId}, new PaymentMapper());
	}

}
