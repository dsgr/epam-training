package com.epam.training.dataaccess.model;

import java.sql.Date;

public class Payment {
	private Long id;
	private Long userId;
	private double summ;
	private Date date;
	private String comment;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public double getSumm() {
		return summ;
	}
	public void setSumm(double summ) {
		this.summ = summ;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	
	@Override
	public String toString() {
		return "Payment [id=" + id + ", userId=" + userId + ", summ=" + summ + ", date=" + date + ", comment=" + comment
				+ "]";
	}
	
	
}
