package com.sinmo.service;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

public class BaseService<T> {
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
	public T get(Class<T> entityName, Serializable id) {
		T t = (T) getSession().get(entityName, id);
		if (t != null) {
			getSession().flush();
		}
		return t;
	}
	
	public int batchInsert(List<T> entityList) {
		int num = 0;
		for (int i = 0; i < entityList.size(); i++) {
			add(entityList.get(i));
			num++;
		}
		return num;
	}
	public void batchSave(List<T> entitys,int batchSize) {
		for (int i = 0; i < entitys.size(); i++) {
			getSession().save(entitys.get(i));
			if (i % batchSize == 0) {
				getSession().flush();
				getSession().clear();
			}
		}
		getSession().flush();
		getSession().clear();
	}
	
	private static void setParameter(Query query, Object... args) {
		if (args != null && args.length > 0) {
			int index = 0;
			for (Object arg : args) {
				query.setParameter(index++, arg);
			}
		}
	}

	public List<T> findByHql(String hql, Object... args) {
		Query query = getSession().createQuery(hql);
		setParameter(query, args);
		return query.list();
	}
	public List<T> findBySql(String sql,Class<T> entityType, Object... args) {
		Query query = getSession().createSQLQuery(sql).addEntity(entityType);
		setParameter(query, args);
		return query.list();
	}
	public List<T> findBySqlTransformer(String sql,Class<T> entityType, Object... args) {
		Query query = getSession().createSQLQuery(sql).setResultTransformer(Transformers.aliasToBean(entityType));
		setParameter(query, args);
		return query.list();
	}



	public void updateByHql(String hql, Object... args) {
		Query query = getSession().createQuery(hql);
		setParameter(query, args);
		query.executeUpdate();
	}

}
