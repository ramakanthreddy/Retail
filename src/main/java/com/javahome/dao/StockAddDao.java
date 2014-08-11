package com.javahome.dao;

import org.hibernate.Session;

import org.hibernate.Transaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.javahome.dao.entity.StockAddEntity;

@Repository
public class StockAddDao implements IStockAddDao {

	@Autowired
	private HibernateTemplate template;
	
	@Override
	public boolean StockAddToDb(StockAddEntity stockAddEntity) {
		
		Session session = template.getSessionFactory().openSession();
		
		Transaction transaction = session.beginTransaction();
		session.save(transaction);
		transaction.commit();
		return true;
	}

	

}
