/**
 * 
 */
package com.sinmo.basic.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sinmo.basic.model.Pager;

public class BaseDao<T> implements IBaseDao<T> {
    @Resource
	private SessionFactory sessionFactory;
	/**
	 * 创建一个Class的对象来获取泛型的class
	 */
	private Class<?> clz;

	public Class<?> getClz() {
		if (this.clz == null) {
			// 获取泛型的Class对象
			this.clz = ((Class<?>) (((ParameterizedType) (this.getClass().getGenericSuperclass())).getActualTypeArguments()[0]));
		}
		return this.clz;
	}

	public SessionFactory getSessionFactory() {
		return this.sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	protected Session getSession() {
		return this.sessionFactory.getCurrentSession();
	}

	public T add(T t) {
		getSession().save(t);
		return t;
	}

	public void update(T t) {
		getSession().update(t);
	}

	public void delete(int id) {
		getSession().delete(this.load(id));
	}

	public T load(int id) {
		return (T) getSession().load(getClz(), id);
	}


	public List<T> list(String hql, Object arg) {
		return this.list(hql, new Object[] { arg });
	}

	public List<T> list(String hql) {
		return this.list(hql, null);
	}

	

	private static void setParameter(Query query, Object[] args) {
		if (args != null && args.length > 0) {
			int index = 0;
			for (Object arg : args) {
				query.setParameter(index++, arg);
			}
		}
	}

	public Pager<T> find(String hql, Object arg) {
		return this.find(hql, new Object[] { arg });
	}

	public Pager<T> find(String hql) {
		return this.find(hql, null);
	}


	public void updateByHql(String hql, Object[] args) {
		Query query = getSession().createQuery(hql);
		setParameter(query, args);
		query.executeUpdate();
	}

	public void updateByHql(String hql, Object arg) {
		this.updateByHql(hql, new Object[] { arg });
	}

	public void updateByHql(String hql) {
		this.updateByHql(hql, null);
	}

}
