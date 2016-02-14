package Dao;


import java.util.List;

import org.com.entities.Compte;
import org.com.entities.Transaction;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;


@Repository
public class TransactionDaoImp implements TransactionDao {
	
	public void addTransaction(Transaction t) {

		System.out.println("AjouterTransaction");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		session.save(t);
	    session.getTransaction().commit();
	    session.close();
	}
	
	public Transaction findById(Integer tid) {
		System.out.println("gettransactionbyId");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		Transaction t = (Transaction) session.load(Transaction.class, tid);
		session.getTransaction().commit();
		return t;
	}
	
	public Transaction findByIdCompte(int cId) {
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		String sql = "FROM Transaction t WHERE t.compte.codeCompte like :cId";
		Query q=session.createQuery(sql);
		q.setInteger("cId", cId );
		List<Transaction> list= q.list();
		Transaction t=list.get(0);
		session.close();
		return t ;
		
		
		
		
	}	
	

}
