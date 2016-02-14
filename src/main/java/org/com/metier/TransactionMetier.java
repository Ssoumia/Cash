package org.com.metier;

import org.com.entities.Transaction;

public interface TransactionMetier {
	
	public void addTransaction(Transaction t);
	public Transaction findById(Integer tid);


}
