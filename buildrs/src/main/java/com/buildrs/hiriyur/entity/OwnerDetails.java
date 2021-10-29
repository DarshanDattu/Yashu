package com.buildrs.hiriyur.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "owner_details")
public class OwnerDetails {

	private Long id;
	private String name;
	private String phone;
	private String email;
	private String gstin;
	private String address;
	private String shopName;
	private Date createdAt;
	private Boolean status;
	private Boolean isDeleted;
	private String password;
	
	
	public OwnerDetails() {
		super();
	}


	public OwnerDetails(Long id, String name, String phone, String email, String gstin, String address, String shopName,
			Date createdAt, Boolean status, Boolean isDeleted) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.gstin = gstin;
		this.address = address;
		this.shopName = shopName;
		this.createdAt = createdAt;
		this.status = status;
		this.isDeleted = isDeleted;
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

	@Column(name ="name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Column(name = "phone")
	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "email")
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "gstin")
	public String getGstin() {
		return gstin;
	}


	public void setGstin(String gstin) {
		this.gstin = gstin;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "shop_name")
	public String getShopName() {
		return shopName;
	}


	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	@Column(name = "created_at")
	public Date getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}


	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "password")
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
}
