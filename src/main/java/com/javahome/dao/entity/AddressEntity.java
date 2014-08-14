package com.javahome.dao.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="address")
public class AddressEntity {
	@Id
/*	@SequenceGenerator(name="addressIdSeq",sequenceName="address_id_seq",initialValue=1)
	@GeneratedValue(generator="addressIdSeq",strategy=GenerationType.AUTO)*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;
	private String street;
	private String state;
	private String city;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="usersid",nullable=false)
	private UserEntity userEntity;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public UserEntity getUserEntity() {
		return userEntity;
	}
	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}
	
	
	
	

}
