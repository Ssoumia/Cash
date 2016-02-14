package Dao;

import org.com.entities.Compte;

public interface CompteDao {
	
	public void addCompte(Compte c);
	public Compte findById(Integer Cid);
	public void updateSolde(Compte c, double solde);
	public Compte findByIdClient(int cId);

}
