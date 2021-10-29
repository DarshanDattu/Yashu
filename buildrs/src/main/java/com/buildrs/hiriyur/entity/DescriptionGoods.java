package com.buildrs.hiriyur.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "description_goods")
public class DescriptionGoods {

	private Long id;
	private String goodsName;
	private String code;
	private Boolean status;
	
	
	public DescriptionGoods() {
		super();
	}


	public DescriptionGoods(Long id, String goodsName, String code, Boolean status) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.code = code;
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


	@Column(name = "goods_name")
	public String getGoodsName() {
		return goodsName;
	}


	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	@Column(name = "code")
	public String getCode() {
		return code;
	}


	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return status;
	}


	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	
	
}
