package com.buildrs.hiriyur.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bill")
public class Bill {

	private Long id;
	private Long descriptionGoodsId;
	private Float qty;
	private Long unit;
	private Float price;
	private Float cgstRate;
	private Float cgstAmount;
	private Float sgstRate;
	private Float sgstAmount;
	private Float totalAmount;
	private Long customerId;
	private Long customerAddressId;
	private Date createdAt;
	private Long ownerId;
	
	public Bill() {
		super();
	}

	public Bill(Long id, Long descriptionGoodsId, Float qty, Long unit, Float price, Float cgstRate, Float cgstAmount,
			Float sgstRate, Float sgstAmount, Float totalAmount, Long customerId, Long customerAddressId,
			Date createdAt) {
		super();
		this.id = id;
		this.descriptionGoodsId = descriptionGoodsId;
		this.qty = qty;
		this.unit = unit;
		this.price = price;
		this.cgstRate = cgstRate;
		this.cgstAmount = cgstAmount;
		this.sgstRate = sgstRate;
		this.sgstAmount = sgstAmount;
		this.totalAmount = totalAmount;
		this.customerId = customerId;
		this.customerAddressId = customerAddressId;
		this.createdAt = createdAt;
	}



	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "descroption_goods_id")
	public Long getDescriptionGoodsId() {
		return descriptionGoodsId;
	}

	public void setDescriptionGoodsId(Long descriptionGoodsId) {
		this.descriptionGoodsId = descriptionGoodsId;
	}

	@Column(name = "qty")
	public Float getQty() {
		return qty;
	}

	public void setQty(Float qty) {
		this.qty = qty;
	}

	@Column(name = "unit")
	public Long getUnit() {
		return unit;
	}

	public void setUnit(Long unit) {
		this.unit = unit;
	}

	@Column(name = "price")
	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Column(name = "cgst_rate")
	public Float getCgstRate() {
		return cgstRate;
	}

	public void setCgstRate(Float cgstRate) {
		this.cgstRate = cgstRate;
	}

	@Column(name = "cgst_amount")
	public Float getCgstAmount() {
		return cgstAmount;
	}

	public void setCgstAmount(Float cgstAmount) {
		this.cgstAmount = cgstAmount;
	}

	@Column(name = "sgst_rate")
	public Float getSgstRate() {
		return sgstRate;
	}

	public void setSgstRate(Float sgstRate) {
		this.sgstRate = sgstRate;
	}

	@Column(name = "sgst_amount")
	public Float getSgstAmount() {
		return sgstAmount;
	}

	public void setSgstAmount(Float sgstAmount) {
		this.sgstAmount = sgstAmount;
	}

	@Column(name = "total_amount")
	public Float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(Float totalAmount) {
		this.totalAmount = totalAmount;
	}

	@Column(name = "customer_id")
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Column(name = "customer_address_id")
	public Long getCustomerAddressId() {
		return customerAddressId;
	}

	public void setCustomerAddressId(Long customerAddressId) {
		this.customerAddressId = customerAddressId;
	}

	@Column(name = "created_at")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "owner_id")
	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}
	
	
}
