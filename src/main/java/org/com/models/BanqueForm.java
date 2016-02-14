package org.com.models;

import org.com.entities.Compte;
import org.com.entities.Transaction;
import org.com.entities.Utilisateur;

public class BanqueForm {

	private Integer codeCompte;
	private Compte compte;
	private Utilisateur utilisateur;
	private String nom;
	private String cin;
	private Integer idutilisateur;
	private Transaction transaction;
	private java.util.List<Transaction> trans;
	private String dateTransaction;
	
	
	public java.util.List<Transaction> getTrans() {
		return trans;
	}
	public void setTrans(java.util.List<Transaction> trans) {
		this.trans = trans;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}
	public String getDateTransaction() {
		return dateTransaction;
	}
	public void setDateTransaction(String dateTransaction) {
		this.dateTransaction = dateTransaction;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
	private double montant;
	
	
	
	public Integer getIdutilisateur() {
		return idutilisateur;
	}
	public void setIdutilisateur(Integer idutilisateur) {
		this.idutilisateur = idutilisateur;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Integer getCodeCompte() {
		return codeCompte;
	}
	public void setCodeCompte(Integer codeCompte) {
		this.codeCompte = codeCompte;
	}
	public Compte getCompte() {
		return compte;
	}
	public void setCompte(Compte compte) {
		this.compte = compte;
	}
	
	
}
