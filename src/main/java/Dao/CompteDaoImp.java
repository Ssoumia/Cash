package Dao;

import java.util.List;

import org.com.entities.Compte;
import org.com.entities.Utilisateur;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;





@Repository
public class CompteDaoImp implements CompteDao{


	public void addCompte(Compte c) {

		System.out.println("AjouterCompte");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		session.save(c);
	    session.getTransaction().commit();
	    session.close();
	}
	
	
	public Compte findById(Integer Cid) {
		System.out.println("getComptebyId");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		Compte u = (Compte) session.load(Compte.class, Cid);
		session.getTransaction().commit();
		return u;
	}
	
	@Transactional
	public void updateSolde(Compte c, double d){
		System.out.println("UpdateSole");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		c.setSolde(c.getSolde()+d);
		session.update(c);
		session.getTransaction().commit();
		
		
	}
	
	@Transactional
	public void update(Compte c, double d){
		System.out.println("UpdateSole");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		c.setSolde(c.getSolde()-d);
		session.update(c);
		session.getTransaction().commit();
		
		
	}
	
	public Compte findByIdClient(int cId) {
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		String sql = "FROM Compte c WHERE c.utilisateur.idutilisateur like :cId";
		Query q=session.createQuery(sql);
		q.setInteger("cId", cId );
		List<Compte> list= q.list();
		Compte c=list.get(0);
		session.close();
		return c ;
	}
	
	public Compte findByClientName(String nom){
		
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		String sql = "FROM Compte c WHERE c.utilisateur.nom like :nom";
		Query q=session.createQuery(sql);
		q.setString("nom", nom );
		List<Compte> list= q.list();
		Compte c=list.get(0);
		session.close();
		return c ;
		
		
	}

	
}
