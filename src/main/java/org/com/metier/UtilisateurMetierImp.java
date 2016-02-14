package org.com.metier;


import org.com.entities.Utilisateur;
import org.springframework.beans.factory.annotation.Autowired;

import Dao.UtilisateurDao;

public class UtilisateurMetierImp implements UtilisateurMetier {

	
	@Autowired
	private UtilisateurDao dao;
	//=new CompteDaoImp();

	public UtilisateurDao getDao() {
		return dao;
	}

	public void setDao(UtilisateurDao dao) {
		this.dao = dao;
	}
	
	@Override
	public void addUser(Utilisateur u) {
		// TODO Auto-generated method stub
		dao.addUser(u);
		
	}

	@Override
	public Utilisateur findById(int uId) {
		// TODO Auto-generated method stub
		return dao.findById(uId);
	}

}
