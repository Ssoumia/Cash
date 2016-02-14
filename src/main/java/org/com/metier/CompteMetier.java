package org.com.metier;

import org.com.entities.Compte;

public interface CompteMetier {
	
	public void addCompte(Compte c);
	public Compte findById(Integer Cid);
	public void updateSolde(Compte c, double solde);

}
