package com.epam.training.dataaccess.model;

public class InvoiceItem {
	private Long id;
	private Long serviceId;
	private Long invoiceId;
	private double fixedPrice;
	private int count;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getServiceId() {
		return serviceId;
	}
	public void setServiceId(Long serviceId) {
		this.serviceId = serviceId;
	}
	public Long getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(Long invoiceId) {
		this.invoiceId = invoiceId;
	}
	public double getFixedPrice() {
		return fixedPrice;
	}
	public void setFixedPrice(double fixedPrice) {
		this.fixedPrice = fixedPrice;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	@Override
	public String toString() {
		return "InvoiceItem [id=" + id + ", serviceId=" + serviceId + ", invoiceId=" + invoiceId + ", fixedPrice="
				+ fixedPrice + ", count=" + count + "]";
	}
	
		
}
