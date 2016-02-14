package Dao;

import java.util.List;

import org.com.entities.Compte;
import org.com.entities.Transaction;

public interface TransactionDao {
	
	public void addTransaction(Transaction t);
	public Transaction findById(Integer tid);
	public Transaction findByIdCompte(int cId);

}
