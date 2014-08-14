package com.javahome.dao.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity(name="usersEntity")
@Table(name="users")
public class UserEntity {
	@Id
	@Column(name="usersid")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
/*	@SequenceGenerator(name="userIdSeq",sequenceName="user_id_seq",initialValue=1)
	@GeneratedValue(generator="userIdSeq",strategy=GenerationType.AUTO)*/
	private int userId;
	@Column(name="usersname")
	private String userName;
	private String password;
	private String mobile;
	@Column(name="enable_flag")
	private String enableFlag;
	@ManyToOne(targetEntity=RoleEntity.class,fetch=FetchType.EAGER)
	@JoinColumn(name="roleid")
	private RoleEntity roleEntity;
	@OneToMany(mappedBy="userEntity",fetch=FetchType.LAZY)
	private Collection<AddressEntity> addresses;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEnableFlag() {
		return enableFlag;
	}
	public void setEnableFlag(String enableFlag) {
		this.enableFlag = enableFlag;
	}
	public RoleEntity getRoleEntity() {
		return roleEntity;
	}
	public void setRoleEntity(RoleEntity roleEntity) {
		this.roleEntity = roleEntity;
	}
	public Collection<AddressEntity> getAddresses() {
		return addresses;
	}
	public void setAddresses(Collection<AddressEntity> addresses) {
		this.addresses = addresses;
	}
	
	
	
	

}
