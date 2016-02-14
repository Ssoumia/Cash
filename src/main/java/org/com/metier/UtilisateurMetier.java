
package org.com.metier;

import org.com.entities.Utilisateur;

public interface UtilisateurMetier {

	public void addUser(Utilisateur u);
	public Utilisateur findById(int uId);
}
