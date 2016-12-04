package com.epam.training.services;

import java.util.List;
import com.epam.training.dataaccess.model.Invoice;

public interface InvoiceService {

	Long insert(Invoice invoice);
	void update(Invoice invoice);
	Invoice getById(long id);
	
	List<Invoice> getAllUnpaid();
	List<Invoice> getAllUnpaidByUser(long userId);
	List<Invoice> getAllByUser(long userId);
}

