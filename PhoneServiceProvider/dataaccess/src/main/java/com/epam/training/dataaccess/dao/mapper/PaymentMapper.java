package com.epam.training.dataaccess.dao.mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.epam.training.dataaccess.model.Payment;

public class PaymentMapper implements RowMapper<Payment> {
	@Override
	public Payment mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long id = rs.getLong("id");
		Long userId = rs.getLong("user_id");
		Double summ = rs.getDouble("summ");
		Date date = rs.getDate("date");
		String comment = rs.getString("comment");

		Payment payment = new Payment();
		payment.setId(id);
		payment.setUserId(userId);
		payment.setSumm(summ);
		payment.setDate(date);
		payment.setComment(comment);

		return payment;
	}
}
