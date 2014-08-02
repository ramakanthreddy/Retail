package com.sample.flow;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BaseDao<T> {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addObject(T t) throws DaoException{
		
		Session session = sessionFactory.getCurrentSession();
		session.save(t);
	}
	
	

}
