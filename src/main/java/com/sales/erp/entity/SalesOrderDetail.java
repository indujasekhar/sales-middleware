package com.sales.erp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Sales_Order_Detail")
public class SalesOrderDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int salesOrderDetailId;
	private int productId;
	private int productCategoryId;
	private int quantity;
	private float ratePerSqft;
	private float amount;
	private Date salesOrderDate;
	private Date modifiedDate;
	//private int salesOrderId;
	
	public SalesOrderDetail(int salesOrderDetailId, int productId, int productCategoryId, int quantity,
			float ratePerSqft, float amount, Date salesOrderDate, Date modifiedDate/*, int salesOrderId*/) {
		this.salesOrderDetailId = salesOrderDetailId;
		this.productId = productId;
		this.productCategoryId = productCategoryId;
		this.quantity = quantity;
		this.ratePerSqft = ratePerSqft;
		this.amount = amount;
		this.salesOrderDate = salesOrderDate;
		this.modifiedDate = modifiedDate;
		//this.salesOrderId = salesOrderId;
	}

	public SalesOrderDetail() {
		
	}

	public int getSalesOrderDetailId() {
		return salesOrderDetailId;
	}

	public void setSalesOrderDetailId(int salesOrderDetailId) {
		this.salesOrderDetailId = salesOrderDetailId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getRatePerSqft() {
		return ratePerSqft;
	}

	public void setRatePerSqft(float ratePerSqft) {
		this.ratePerSqft = ratePerSqft;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getSalesOrderDate() {
		return salesOrderDate;
	}

	public void setSalesOrderDate(Date salesOrderDate) {
		this.salesOrderDate = salesOrderDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	/*public int getSalesOrderId() {
		return salesOrderId;
	}

	public void setSalesOrderId(int salesOrderId) {
		this.salesOrderId = salesOrderId;
	}*/
	
}
