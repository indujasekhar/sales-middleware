package com.sales.erp.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VW_Daily_Book")
public class DailyBookView {

	private String particularName;
	private String fullName;
	@Id
	private String dailyBookDate;
	private int amount;
	
	public DailyBookView(String particularName, String fullName, String dailyBookDate, int amount) {
		this.particularName = particularName;
		this.fullName = fullName;
		this.dailyBookDate = dailyBookDate;
		this.amount = amount;
	}

	public DailyBookView() {
		
	}

	public String getParticularName() {
		return particularName;
	}

	public String getFullName() {
		return fullName;
	}

	public String getDailyBookDate() {
		return dailyBookDate;
	}

	public int getAmount() {
		return amount;
	}
	
}
