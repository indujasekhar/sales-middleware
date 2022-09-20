package com.sales.erp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Expense_Particulars")
public class Particular {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int particular_id;
	private String particular_name;
	private String description;
	
	public Particular(int particular_id, String particular_name, String description) {
		this.particular_id = particular_id;
		this.particular_name = particular_name;
		this.description = description;
	}

	public Particular() {
		
	}

	public int getParticular_id() {
		return particular_id;
	}

	public void setParticular_id(int particular_id) {
		this.particular_id = particular_id;
	}
	
	public String getParticular_name() {
		return particular_name;
	}

	public void setParticular_name(String particular_name) {
		this.particular_name = particular_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
