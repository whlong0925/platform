package com.sinmo.service.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.sinmo.basic.dao.BaseDao;
import com.sinmo.basic.model.Pager;
import com.sinmo.basic.model.User;
import com.sinmo.service.IUserService;

@Repository("userService")
public class UserService extends BaseDao<User> implements IUserService {

	public List<User> listUserByHql(String hql, Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> listUserBySql(String sql, Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public Pager<User> findUserBySql(String sql, int pageSize, int pageNum, Object[] objects) {
		// TODO Auto-generated method stub
		return null;
	}

	public User findUserByUserCode(String sql, String userCode) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
