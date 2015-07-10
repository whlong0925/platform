package com.sinmo.service;

import java.util.List;

import com.sinmo.model.Pager;
import com.sinmo.model.User;

public interface IUserService{

	List<User> getlistUserByHql(String hql, Object[] objects);

	List<User> getListUserBySql(String sql, Object[] objects);

	Pager<User> getPageUserBySql(String sql, int pageSize,int pageNum,Object[] objects);
	
	User getUserByUserCode(String sql,String userCode);
	
	void saveUser(User user);
	
	void loadUser(User user);
	
	void deleteUserById(int id);
	
	void updateUser(User user);
	

}
