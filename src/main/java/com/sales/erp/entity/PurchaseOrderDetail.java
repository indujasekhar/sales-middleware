package com.sales.erp.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Purchase_Order_Detail")
public class PurchaseOrderDetail {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int purchaseOrderDetailId;
	//private int purchaseOrderId;
	private int quantity;
	private float rate;
	private float amount;
	private Date purchaseOrderDate;
	private int rmid;
	private int rmSpecId;
	private Date modifiedDate;
	
	public PurchaseOrderDetail(int purchaseOrderDetailId, /*int purchaseOrderId,*/ int quantity, float rate, float amount,
			Date purchaseOrderDate, int rmid, int rmSpecId, Date modifiedDate) {
		this.purchaseOrderDetailId = purchaseOrderDetailId;
		//this.purchaseOrderId = purchaseOrderId;
		this.quantity = quantity;
		this.rate = rate;
		this.amount = amount;
		this.purchaseOrderDate = purchaseOrderDate;
		this.rmid = rmid;
		this.rmSpecId = rmSpecId;
		this.modifiedDate = modifiedDate;
	}

	public PurchaseOrderDetail() {
		
	}

	public int getPurchaseOrderDetailId() {
		return purchaseOrderDetailId;
	}

	public void setPurchaseOrderDetailId(int purchaseOrderDetailId) {
		this.purchaseOrderDetailId = purchaseOrderDetailId;
	}

	/*public int getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(int purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}*/

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getRate() {
		return rate;
	}

	public void setRate(float rate) {
		this.rate = rate;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public Date getPurchaseOrderDate() {
		return purchaseOrderDate;
	}

	public void setPurchaseOrderDate(Date purchaseOrderDate) {
		this.purchaseOrderDate = purchaseOrderDate;
	}

	public int getRmid() {
		return rmid;
	}

	public void setRmid(int rmid) {
		this.rmid = rmid;
	}

	public int getRmSpecId() {
		return rmSpecId;
	}

	public void setRmSpecId(int rmSpecId) {
		this.rmSpecId = rmSpecId;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
}
