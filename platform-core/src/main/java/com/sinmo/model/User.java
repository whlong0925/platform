package com.sinmo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="t_user")
public class User {
	private int id;
	private String username;
	private String usercode;
	private int deptId;
	private String departName;
	public User() {
	}
	
	public User(int id, String username,String usercode,int deptId) {
		super();
		this.id = id;
		this.username = username;
		this.usercode = usercode;
		this.deptId = deptId;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "username", nullable = false, length = 20)
	public String getUsername() {
		return this.username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "usercode", nullable = false, length = 20)
	public String getUsercode() {
		return this.usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}
	@Column(name = "deptId", nullable = false, length = 20)
	public int getDeptId() {
		return this.deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
    @Transient
	public String getDepartName() {
		return this.departName;
	}

	public void setDepartName(String departName) {
		this.departName = departName;
	}
}
