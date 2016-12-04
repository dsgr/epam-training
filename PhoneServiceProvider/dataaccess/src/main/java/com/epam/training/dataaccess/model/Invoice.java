package com.epam.training.dataaccess.model;

import java.sql.Date;

public class Invoice {
	private Long id;
	private int number;
	private Long userId;
	private Date creationDate;
	private Boolean isPaid;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public Boolean getIsPaid() {
		return isPaid;
	}
	public void setIsPaid(Boolean isPaid) {
		this.isPaid = isPaid;
	}
	
	@Override
	public String toString() {
		return "Invoice [id=" + id + ", number=" + number + ", userId=" + userId + ", creationDate=" + creationDate
				+ ", isPayed=" + isPaid + "]";
	}
	

}
