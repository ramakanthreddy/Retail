package com.javahome.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
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
	 
	/* public List<T> searchBasedOnInput(String search){
		 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(getPersistentClass());
		 //criteria.add(Restrictions.l)
		 //return List<T>criteria.list();
	 }*/

}
