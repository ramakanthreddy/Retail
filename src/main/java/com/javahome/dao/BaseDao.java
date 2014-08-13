package com.javahome.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public abstract class BaseDao<T> {
	
	 protected abstract Class<T> getPersistentClass();
	 
	@Autowired
	 protected SessionFactory sessionFactory;
	 
	 public void addEntity(T t){
		 
		 Session session = sessionFactory.getCurrentSession();
		 session.save(t);
	 }
	 
	 public void deleteEntity(T t){
		 
		 Session session = sessionFactory.getCurrentSession();
		 session.delete(t);
	 }
	 
	 public void updateEntity(T t){
		 
		 Session session = sessionFactory.getCurrentSession();
		 session.update(t);
	 }
	 
	 @SuppressWarnings("unchecked")
	public T findById(int id) {
		 Session session = sessionFactory.getCurrentSession();
		 return (T) session.load(getPersistentClass(), id);
	 }
	 
	 @SuppressWarnings("unchecked")
	public List<T> findAllObjects(){
		 Session session = sessionFactory.getCurrentSession();
		 Criteria criteria = session.createCriteria(getPersistentClass());
		 return criteria.list();
	 }
	 
	

}
