package com.epam.training.dataaccess.dao;

import java.util.List;
import com.epam.training.dataaccess.model.Invoice;
import com.epam.training.dataaccess.model.InvoiceItem;

public interface InvoiceDao {
	Long insert(Invoice invoce);

	void update(Invoice invoice);

	Invoice getById(long id);

	List<Invoice> getAllUnpaid();

	List<Invoice> getAllUnpaidByUser(long userId);

	List<Invoice> getAllByUser(long userId);
	
	
}
