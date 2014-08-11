package com.javahome.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public abstract class BaseDao<T> {
	
	 protected abstract Class<T> getPersistentClass();
	 
	@Autowired
	 protected SessionFactory sessionFactory;
	 
	 protected void addEntity(T t){
		 
		 Session session = sessionFactory.getCurrentSession();
		 session.save(t);
	 }
	 
	 protected void deleteEntity(T t){
		 
		 Session session = sessionFactory.getCurrentSession();
		 session.delete(t);
	 }
	 
	 protected void updateEntity(T t){
		 
		 Session session = sessionFactory.getCurrentSession();
		 session.update(t);
	 }
	 
	 @SuppressWarnings("unchecked")
	protected T findById(int id) {
		 Session session = sessionFactory.getCurrentSession();
		 return (T) session.load(getPersistentClass(), id);
	 }
	 
	

}
