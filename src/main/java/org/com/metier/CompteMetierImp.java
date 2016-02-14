package org.com.metier;

import org.com.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dao.CompteDao;

//@Service("compteMetier")
public class CompteMetierImp implements CompteMetier {
	
	@Autowired
	private CompteDao dao;
	//=new CompteDaoImp();

	public void setDao(CompteDao dao) {
		this.dao = dao;
	}

	@Override
	public void addCompte(Compte c) {
		// TODO Auto-generated method stub
		dao.addCompte(c);
		
	}

	@Override
	public Compte findById(Integer Cid) {
		// TODO Auto-generated method stub
		return dao.findById(Cid);
	}

	@Override
	public void updateSolde(Compte c, double solde) {
		// TODO Auto-generated method stub
		dao.updateSolde(c, solde);
		
	}

}
