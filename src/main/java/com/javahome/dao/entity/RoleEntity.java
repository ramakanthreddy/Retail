package com.javahome.dao.entity;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class RoleEntity {
	@Id
/*	@SequenceGenerator(name="roleIdSeq",sequenceName="roleIdSeq")
	@GeneratedValue(generator="roleIdSeq",strategy=GenerationType.SEQUENCE)*/
	private int roleId;
	@Column(name="role_type")
	private String roleType;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleType() {
		return roleType;
	}
	public void setRoleType(String roleType) {
		this.roleType = roleType;
	}
	
	@OneToMany(mappedBy="roleEntity",fetch=FetchType.LAZY)
	private Collection<UserEntity> userEntities;
	public Collection<UserEntity> getUserEntities() {
		return userEntities;
	}
	public void setUserEntities(Collection<UserEntity> userEntities) {
		this.userEntities = userEntities;
	}
	
	
	
	
	

}
