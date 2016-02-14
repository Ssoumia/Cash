package Batch;

import org.com.entities.Compte;
import org.com.entities.Transaction;
import org.com.entities.Utilisateur;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.CompteDaoImp;
import Dao.UtilisateurDaoImp;



@Service("transactionProcessor")
public class TransactionProcessor implements ItemProcessor<Transaction, Transaction> {

	UtilisateurDaoImp dao;
	CompteDaoImp daoS;

	@Autowired
	public void setDaoS(CompteDaoImp daoS) {
		this.daoS = daoS;
	}

	@Autowired
	public void setDao(UtilisateurDaoImp dao) {
		this.dao = dao;
	}

	public Transaction process(final Transaction transactionInput) throws Exception {
		Transaction transactionOutput = null;
		transactionOutput = new Transaction();
		
		if ("Retracted".equals(transactionInput.getValide())) {
			Utilisateur client = dao.findById(transactionInput.getUtilisateur().getIdutilisateur());
			Compte c= daoS.findById(transactionInput.getCompte().getCodeCompte());
			System.out.println("---------------------"+c.getSolde()+"----------------------");
			daoS.updateSolde(c, transactionInput.getMontant());
			System.out.println("---------------------"+c.getSolde()+"----------------------");
			transactionOutput.setIdTransaction(transactionInput.getIdTransaction());
			transactionOutput.setDateTransaction(transactionInput.getDateTransaction());
			transactionOutput.setMontant(transactionInput.getMontant());
			transactionOutput.setValide(transactionInput.getValide());
			transactionOutput.setUtilisateur(transactionInput.getUtilisateur());
			transactionOutput.setCompte(transactionInput.getCompte());
			
			
		} else {
			
			Utilisateur client = dao.findById(transactionInput.getUtilisateur().getIdutilisateur());
			Compte c= daoS.findById(transactionInput.getCompte().getCodeCompte());
			System.out.println("---------------------"+c.getSolde()+"----------------------");
			daoS.update(c, transactionInput.getMontant());
			System.out.println("---------------------"+c.getSolde()+"----------------------");
			transactionOutput.setIdTransaction(transactionInput.getIdTransaction());
			transactionOutput.setDateTransaction(transactionInput.getDateTransaction());
			transactionOutput.setMontant(transactionInput.getMontant());
			transactionOutput.setValide(transactionInput.getValide());
			transactionOutput.setUtilisateur(transactionInput.getUtilisateur());
			transactionOutput.setCompte(transactionInput.getCompte());
		}
		return transactionOutput;
	}

}
