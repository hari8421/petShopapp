package com.petApp.domain;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import com.sun.istack.NotNull;

@Entity
@Table(name="order_hdr")
public class OrderHdrEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="OH_ID")
	private long ohId;
	@NotNull
	@Column(name="CUSTOMER_ID")
	private long cId;
	@Column(name="TOTAL_PRICE")
	@Min(500)
	private String tPrice;
	 @OneToMany(mappedBy = "ohJpaEntity")
	 private List<OrderDtlEntity> oDtlEntity;
	
	 @ManyToOne
	 @JoinColumn(name = "CUSTOMER_ID", nullable = false,updatable = false,insertable = false)
	 private CustomerDtl custEntity;
	 
	 
	public CustomerDtl getCustEntity() {
		return custEntity;
	}
	public void setCustEntity(CustomerDtl custEntity) {
		this.custEntity = custEntity;
	}
	public List<OrderDtlEntity> getoDtlEntity() {
		return oDtlEntity;
	}
	public void setoDtlEntity(List<OrderDtlEntity> oDtlEntity) {
		this.oDtlEntity = oDtlEntity;
	}
	public long getOhId() {
		return ohId;
	}
	public void setOhId(long ohId) {
		this.ohId = ohId;
	}
	public long getcId() {
		return cId;
	}
	public void setcId(long cId) {
		this.cId = cId;
	}
	public String gettPrice() {
		return tPrice;
	}
	public void settPrice(String tPrice) {
		this.tPrice = tPrice;
	}
	
	

}