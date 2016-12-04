package com.epam.training.dataaccess.dao.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.epam.training.dataaccess.model.InvoiceItem;

public class InvoiceItemMapper implements RowMapper<InvoiceItem> {
	@Override
	public InvoiceItem mapRow(ResultSet rs, int rowNum) throws SQLException {
		Long id = rs.getLong("id");
		Long serviceId = rs.getLong("service_id");
		Long invoiceId = rs.getLong("invoice_id");
		double fixedPrice = rs.getDouble("fixed_price");
		int count = rs.getInt("count");

		InvoiceItem invoiceItem = new InvoiceItem();
		invoiceItem.setId(id);
		invoiceItem.setServiceId(serviceId);
		invoiceItem.setInvoiceId(invoiceId);
		invoiceItem.setFixedPrice(fixedPrice);
		invoiceItem.setCount(count);

		return invoiceItem;
	}

}
