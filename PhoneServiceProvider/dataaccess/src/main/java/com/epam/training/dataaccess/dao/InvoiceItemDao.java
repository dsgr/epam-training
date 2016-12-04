package com.epam.training.dataaccess.dao;

import java.util.List;
import com.epam.training.dataaccess.model.InvoiceItem;

public interface InvoiceItemDao {
	
	Long insert(InvoiceItem invoiceItem);
	List<InvoiceItem> getAllByInvoiceId(Long invoiceId);

}
