package com.sinmo.service.impl;


import java.util.List;

import org.springframework.stereotype.Repository;

import com.sinmo.model.Pager;
import com.sinmo.model.User;
import com.sinmo.service.BaseService;
import com.sinmo.service.IUserService;

@Repository("userService")
public class UserService extends BaseService<User> implements IUserService {

	@Override
	public List<User> getlistUserByHql(String hql, Object[] objects) {
		return null;
	}

	@Override
	public List<User> getListUserBySql(String sql, Object[] objects) {
		return null;
	}

	@Override
	public Pager<User> getPageUserBySql(String sql, int pageSize, int pageNum, Object[] objects) {
		return null;
	}

	@Override
	public User getUserByUserCode(String sql, String userCode) {
		return null;
	}

	@Override
	public void saveUser(User user) {
		this.add(user);
//		System.out.println(1/0);
	}

	@Override
	public void loadUser(User user) {
		this.delete(user.getId());
		//System.out.println(1/0);
	}

	@Override
	public void deleteUserById(int id) {
		this.delete(id);
		
	}

	@Override
	public void updateUser(User user) {
		this.update(user);
	}

	
	

}
