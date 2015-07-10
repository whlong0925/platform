package com.sinmo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_department")
public class Department {
	private int id;
	private String departName;
	
	public Department() {
	}
	
	public Department(int id, String departName) {
		super();
		this.id = id;
		this.departName = departName;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "departName", nullable = false, length = 20)
	public String getDepartName() {
		return this.departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
}
