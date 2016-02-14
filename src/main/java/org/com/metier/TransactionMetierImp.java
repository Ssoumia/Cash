package org.com.metier;

import org.com.entities.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import Dao.TransactionDao;
import Dao.UtilisateurDao;

public class TransactionMetierImp implements TransactionMetier {
	
	
	@Autowired
	private TransactionDao dao;
	//=new CompteDaoImp();

	public TransactionDao getDao() {
		return dao;
	}

	public void setDao(TransactionDao dao) {
		this.dao = dao;
	}

	@Override
	public void addTransaction(Transaction t) {
		// TODO Auto-generated method stub
		dao.addTransaction(t);
		
	}

	@Override
	public Transaction findById(Integer tid) {
		// TODO Auto-generated method stub
		return dao.findById(tid);
	}
	
	
}
