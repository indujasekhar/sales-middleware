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
	private int particularId;
	private String particularName;
	private String description;
	
	public Particular(int particularId, String particularName, String description) {
		this.particularId = particularId;
		this.particularName = particularName;
		this.description = description;
	}

	public Particular() {
		
	}

	public int getParticularId() {
		return particularId;
	}

	public void setParticularId(int particularId) {
		this.particularId = particularId;
	}

	public String getParticularName() {
		return particularName;
	}

	public void setParticularName(String particularName) {
		this.particularName = particularName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
