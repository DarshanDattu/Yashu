package com.buildrs.hiriyur.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "customer_address")
public class CustomerAddress {

	private Long id;
	private Long customerId;
	private String address;
	private String vihicalNo;
	private String transporType;
	private String station;
	private String isReverseCharges;
	private Date createdAt;
	private Date deliverDate;
	private String deliverStatus;
	private Boolean status;
	private Boolean isDeleted;
	private Long grRrno;
	private Long eWatBillNo;
	private String billOnName;
	
	public CustomerAddress() {
		super();
	}

	public CustomerAddress(Long id, Long customerId, String address, String vihicalNo, String transporType,
			String station, String isReverseCharges, Date createdAt, Date deliverDate, String deliverStatus,
			Boolean status, Boolean isDeleted, Long grRrno, Long eWatBillNo, String billOnName) {
		super();
		this.id = id;
		this.customerId = customerId;
		this.address = address;
		this.vihicalNo = vihicalNo;
		this.transporType = transporType;
		this.station = station;
		this.isReverseCharges = isReverseCharges;
		this.createdAt = createdAt;
		this.deliverDate = deliverDate;
		this.deliverStatus = deliverStatus;
		this.status = status;
		this.isDeleted = isDeleted;
		this.grRrno = grRrno;
		this.eWatBillNo = eWatBillNo;
		this.billOnName = billOnName;
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

	@Column(name = "customer_id")
	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Column(name = "address")
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "vehical_no")
	public String getVihicalNo() {
		return vihicalNo;
	}

	public void setVihicalNo(String vihicalNo) {
		this.vihicalNo = vihicalNo;
	}

	@Column(name = "transport_type")
	public String getTransporType() {
		return transporType;
	}

	public void setTransporType(String transporType) {
		this.transporType = transporType;
	}

	@Column(name = "station")
	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	@Column(name = "is_reverscharges")
	public String getIsReverseCharges() {
		return isReverseCharges;
	}

	public void setIsReverseCharges(String isReverseCharges) {
		this.isReverseCharges = isReverseCharges;
	}

	@Column(name = "created_at")
	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Column(name = "deliver_date")
	public Date getDeliverDate() {
		return deliverDate;
	}

	public void setDeliverDate(Date deliverDate) {
		this.deliverDate = deliverDate;
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

	@Column(name = "is_deleted")
	public Boolean getIsDeleted() {
		return isDeleted;
	}

	public void setIsDeleted(Boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	@Column(name = "gr_rr_no")
	public Long getGrRrno() {
		return grRrno;
	}

	public void setGrRrno(Long grRrno) {
		this.grRrno = grRrno;
	}

	@Column(name = "e_wat_bill_no")
	public Long geteWatBillNo() {
		return eWatBillNo;
	}

	public void seteWatBillNo(Long eWatBillNo) {
		this.eWatBillNo = eWatBillNo;
	}

	@Column(name = "bill_on_name")
	public String getBillOnName() {
		return billOnName;
	}

	public void setBillOnName(String billOnName) {
		this.billOnName = billOnName;
	}
	
	
	
	
}
