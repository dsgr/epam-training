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

import com.epam.training.dataaccess.dao.InvoiceDao;
import com.epam.training.dataaccess.dao.mapper.InvoiceMapper;
import com.epam.training.dataaccess.model.Invoice;

@Repository
public class InvoiceDaoImpl implements InvoiceDao {
	// TODO add @Oweride. write int. think which dao we need
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Long insert(final Invoice invoice) {
		KeyHolder keyHolder = new GeneratedKeyHolder();
		jdbcTemplate.update(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection connection) throws SQLException {
				PreparedStatement ps = connection.prepareStatement(
						"INSERT INTO invoices ( number, user_id, creation_date, is_paid) VALUES (?,?,?,?)",
						new String[] { "id" });
				ps.setLong(1, invoice.getNumber());
				ps.setLong(2, invoice.getUserId());
				ps.setDate(3, invoice.getCreationDate());
				ps.setBoolean(4, invoice.getIsPaid());
				return ps;
			}
		}, keyHolder);
		return keyHolder.getKey().longValue();
	}
	
	@Override
	public void update(Invoice i) {
		jdbcTemplate.update(
				"UPDATE invoices SET number=?, user_id=?, creation_date=?, is_paid=? where id=?",
				i.getNumber(), i.getUserId(), i.getCreationDate(), i.getIsPaid(), i.getId() );
	}
	
	@Override
	public Invoice getById(long id) {
		return jdbcTemplate.queryForObject("select * from invoices where id = ?", new Object[] { 1 }, new InvoiceMapper());
	}
	
	@Override
	public List<Invoice> getAllUnpaid(){
		return jdbcTemplate.query("SELECT * FROM invoices WHERE is_paid = 0", new InvoiceMapper());
		
	}
	@Override
	public List<Invoice> getAllUnpaidByUser(long userId){
		return jdbcTemplate.query("SELECT * FROM invoices WHERE is_paid = 0 AND user_id=?", 
				new Object[] {userId}, new InvoiceMapper());
		
	}
	@Override
	public List<Invoice> getAllByUser(long userId){
		return jdbcTemplate.query("SELECT * FROM invoices WHERE user_id=?", 
				new Object[] {userId}, new InvoiceMapper());
		
	}

}
