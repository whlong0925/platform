package com.sinmo.service;

import java.util.List;

import com.sinmo.basic.dao.IBaseDao;
import com.sinmo.basic.model.Pager;
import com.sinmo.basic.model.User;

public interface IUserService extends IBaseDao<User> {

	List<User> listUserByHql(String hql, Object[] objects);

	List<User> listUserBySql(String sql, Object[] objects);

	Pager<User> findUserBySql(String sql, int pageSize,int pageNum,Object[] objects);
	
	User findUserByUserCode(String sql,String userCode);

}
