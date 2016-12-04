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

import com.epam.training.dataaccess.dao.InvoiceItemDao;
import com.epam.training.dataaccess.dao.mapper.InvoiceItemMapper;

import com.epam.training.dataaccess.model.InvoiceItem;

@Repository
public class InvoiceItemDaoImpl implements InvoiceItemDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Long insert(final InvoiceItem invoiceItem) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO invoices_items (service_id, invoice_id, fixed_price, count) VALUES (?,?,?,?)",
						new String[] { "id" });
				ps.setLong(1, invoiceItem.getServiceId());
				ps.setLong(2, invoiceItem.getInvoiceId());
				ps.setDouble(3, invoiceItem.getFixedPrice());
				ps.setInt(4, invoiceItem.getCount());
				return ps;
			}
		}, keyHolder);
		return keyHolder.getKey().longValue();
	}

	@Override
	public List<InvoiceItem> getAllByInvoiceId(Long invoiceId) {
		return jdbcTemplate.query("SELECT * FROM invoices_items WHERE invoice_id=?", new Object[] { invoiceId },
				new InvoiceItemMapper());
	}

}
