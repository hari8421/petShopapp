package com.petApp.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Min;

import com.sun.istack.NotNull;

@Entity
@Table(name="pet_detail")
public class PetEntity {
	

		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name="PET_ID")
		@NotNull
		private long pet_id;
		@Column(name="PET_TYPE")
		private String p_type;
		@Column(name="COLOR")
		private String color;
		@Column(name="AGE")
		@Min(1)
		private String age;
		@Min(100)
		@Column(name="PRICE")
		private double price;
		@Column(name="IS_SOLD")
		private double isSold;
		
		
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		public double getIsSold() {
			return isSold;
		}
		public void setIsSold(double isSold) {
			this.isSold = isSold;
		}
		public long getPet_id() {
			return pet_id;
		}
		public void setPet_id(long pet_id) {
			this.pet_id = pet_id;
		}
		public String getP_type() {
			return p_type;
		}
		public void setP_type(String p_type) {
			this.p_type = p_type;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public String getAge() {
			return age;
		}
		public void setAge(String age) {
			this.age = age;
		}
		
		
	

}
