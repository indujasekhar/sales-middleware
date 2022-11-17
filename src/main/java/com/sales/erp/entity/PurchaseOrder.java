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
@Table(name = "Purchase_Order")
public class PurchaseOrder {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseOrderId;
	private int userId;
	private float totalAmount;
	private Date purchaseOrderDate;
	private Date modifiedDate;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "purchaseOrderId")
	List<PurchaseOrderDetail> purchaseDtlList = new ArrayList<>();
	
	public PurchaseOrder(int purchaseOrderId, int userId, float totalAmount, Date purchaseOrderDate,
			Date modifiedDate) {
		this.purchaseOrderId = purchaseOrderId;
		this.userId = userId;
		this.totalAmount = totalAmount;
		this.purchaseOrderDate = purchaseOrderDate;
		this.modifiedDate = modifiedDate;
	}

	public PurchaseOrder() {
		
	}

	public int getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}

	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	public List<PurchaseOrderDetail> getPurchaseDtlList() {
		return purchaseDtlList;
	}

	public void setPurchaseDtlList(List<PurchaseOrderDetail> purchaseDtlList) {
		this.purchaseDtlList = purchaseDtlList;
	}
}
