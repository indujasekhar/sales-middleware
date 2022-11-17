package com.sales.erp.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Daily_Book")
public class DailyBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dailyBookId;
	private Date modifiedDate;
	private int particularId;
	private int userId;
	private Date dailyBookDate;
	private int amount;
	
	public DailyBook(int dailyBookId, Date modifiedDate, int particularId, int userId, 
			Date dailyBookDate, int amount) {
		this.dailyBookId = dailyBookId;
		this.modifiedDate = modifiedDate;
		this.particularId = particularId;
		this.userId = userId;
		this.dailyBookDate = dailyBookDate;
		this.amount = amount;
	}

	public DailyBook() {
		
	}
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getDailyBookId() {
		return dailyBookId;
	}

	public void setDailyBookId(int dailyBookId) {
		this.dailyBookId = dailyBookId;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public int getParticularId() {
		return particularId;
	}

	public void setParticularId(int particularId) {
		this.particularId = particularId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDailyBookDate() {
		return dailyBookDate;
	}

	public void setDailyBookDate(Date dailyBookDate) {
		this.dailyBookDate = dailyBookDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
}
