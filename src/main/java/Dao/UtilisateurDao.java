package Dao;

import java.util.List;

import org.com.entities.Utilisateur;

public interface UtilisateurDao {
	
	public void addUser(Utilisateur u);
	public Utilisateur findById(int uId);
	public List<Utilisateur> getAllUtilisateur();

}
