package com.sales.erp.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Sales_Order")
public class SalesOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int salesOrderId;
	private String userId;
	private Date salesOrderDate;
	private int totalAmount;
	private Date modifiedDate;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="salesOrderId")
	List<SalesOrderDetail> salesOrderDtlList = new ArrayList<>();
	
	public SalesOrder(int salesOrderId, String userId, Date salesOrderDate, int totalAmount, Date modifiedDate) {
		this.salesOrderId = salesOrderId;
		this.userId = userId;
		this.salesOrderDate = salesOrderDate;
		this.totalAmount = totalAmount;
		this.modifiedDate = modifiedDate;
	}

	public SalesOrder() {
		
	}

	public int getSalesOrderId() {
		return salesOrderId;
	}

	public void setSalesOrderId(int salesOrderId) {
		this.salesOrderId = salesOrderId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getSalesOrderDate() {
		return salesOrderDate;
	}

	public void setSalesOrderDate(Date salesOrderDate) {
		this.salesOrderDate = salesOrderDate;
	}

	public int getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public List<SalesOrderDetail> getSalesOrderDtlList() {
		return salesOrderDtlList;
	}

	public void setSalesOrderDtlList(List<SalesOrderDetail> salesOrderDtlList) {
		this.salesOrderDtlList = salesOrderDtlList;
	}
	
}
