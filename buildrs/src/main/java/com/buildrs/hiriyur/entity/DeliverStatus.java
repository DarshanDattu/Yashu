package com.buildrs.hiriyur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "deliver_status")
public class DeliverStatus {

	private Long id;
	private String deliverStatus;
	private Boolean status;
	
	
	public DeliverStatus() {
		super();
	}


	public DeliverStatus(Long id, String deliverStatus, Boolean status) {
		super();
		this.id = id;
		this.deliverStatus = deliverStatus;
		this.status = status;
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

	@Column(name = "deliver_status")
	public String getDeliverStatus() {
		return deliverStatus;
	}


	public void setDeliverStatus(String deliverStatus) {
		this.deliverStatus = deliverStatus;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
