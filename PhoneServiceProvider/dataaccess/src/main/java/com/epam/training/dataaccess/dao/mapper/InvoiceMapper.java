package com.epam.training.dataaccess.dao.mapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.epam.training.dataaccess.model.Invoice;

public final class InvoiceMapper implements RowMapper<Invoice> {
	@Override
	public Invoice mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long id = rs.getLong("id");
		int number = rs.getInt("number");
		Long userId = rs.getLong("user_id");
		Date creationDate = rs.getDate("creation_date");
		boolean isPaid = rs.getBoolean("is_payed");

		Invoice i = new Invoice();
		i.setId(id);
		i.setNumber(number);
		i.setUserId(userId);
		i.setCreationDate(creationDate);
		i.setIsPaid(isPaid);

		return i;
	}

}
