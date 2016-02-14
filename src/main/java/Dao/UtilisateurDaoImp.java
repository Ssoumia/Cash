package Dao;

import java.util.List;

import org.com.entities.Utilisateur;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;




@Repository
public class UtilisateurDaoImp implements UtilisateurDao {



	public List<Utilisateur> findAll() {
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		try {
		Query query = session.createQuery("from Utilisateur");
		return query.list();
		} 
		
		finally {
		session.close();
			}
		}
	

	public void addUser(Utilisateur u) {
					System.out.println("AjouterUtilisateur");
					Session session =  HibernateUtil.getSession();
					session.beginTransaction();	
					session.save(u);
				    session.getTransaction().commit();
				    session.close();
		}

	
	public Utilisateur findById(int uId) {
		System.out.println("getUtilisateurbyId");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		Utilisateur u = (Utilisateur) session.load(Utilisateur.class, uId);
		session.getTransaction().commit();
		return u;
		
		
	}


	@Override
	public List<Utilisateur> getAllUtilisateur() {
		// TODO Auto-generated method stub
		System.out.println("getAllUtilisateur");
		Session session =  HibernateUtil.getSession();
		session.beginTransaction();	
		List<Utilisateur> u = session.createQuery("from utilisateur").list();
		
		return u;
	}
	
}
