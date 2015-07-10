package com.sinmo.service.impl;


import org.springframework.stereotype.Repository;

import com.sinmo.model.Department;
import com.sinmo.service.BaseService;
import com.sinmo.service.IDeptService;

@Repository("deptService")
public class DeptService extends BaseService<Department> implements IDeptService {

	@Override
	public void saveDept(Department d) {
		this.add(d);
	}
	
}
