package Batch;

import java.util.List;

import org.com.entities.Transaction;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.TransactionDao;



@Service("transactionWriter")
public class TransactionWriter implements ItemWriter<Transaction> {

	private TransactionDao dao;

	@Autowired
	public void setDao(TransactionDao dao) {
		this.dao = dao;
	}

	public void write(List<? extends Transaction> items) throws Exception {
		for (Transaction transaction : items) {

			if("retrait".equals(transaction.getValide()))
			dao.addTransaction(transaction);

			System.out.println("------*******-------");

		}
	} }

