package com.petApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="order_dtl")
public class OrderDtlEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="OD_ID")
	private long odId;
	@Column(name="OH_ID")
	private long ohId;
	@Column(name="PET_ID")
	private long pet_id;
	@Column(name="PRICE")
	private double price;
	
	 @ManyToOne
	 @JoinColumn(name = "OH_ID", nullable = false,updatable = false,insertable = false)
	 @JsonIgnore
	 private OrderHdrEntity ohJpaEntity;
	 
	
	public OrderHdrEntity getOhJpaEntity() {
		return ohJpaEntity;
	}
	public void setOhJpaEntity(OrderHdrEntity ohJpaEntity) {
		this.ohJpaEntity = ohJpaEntity;
	}
	public long getOdId() {
		return odId;
	}
	public void setOdId(long odId) {
		this.odId = odId;
	}
	public long getOhId() {
		return ohId;
	}
	public void setOhId(long ohId) {
		this.ohId = ohId;
	}
	public long getPet_id() {
		return pet_id;
	}
	public void setPet_id(long pet_id) {
		this.pet_id = pet_id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
