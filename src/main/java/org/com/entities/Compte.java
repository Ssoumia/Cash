package org.com.entities;

// Generated 30 janv. 2016 11:57:34 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;




/**
 * Compte generated by hbm2java
 */
@Entity
@Table(name = "compte", catalog = "retrait")
public class Compte implements java.io.Serializable {

	private Integer codeCompte;
	private Utilisateur utilisateur;
	private double solde;
	private int code;
	private Set<Transaction> transactions = new HashSet<Transaction>(0);
	

	public Compte() {
	}

	public Compte(Utilisateur utilisateur, double solde, int code) {
		this.utilisateur = utilisateur;
		this.solde = solde;
		this.code = code;
	}

	public Compte(Utilisateur utilisateur, double solde, int code,
			Set<Transaction> transactions) {
		this.utilisateur = utilisateur;
		this.solde = solde;
		this.code = code;
		this.transactions = transactions;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "codeCompte", unique = true, nullable = false)
	public Integer getCodeCompte() {
		return this.codeCompte;
	}

	public void setCodeCompte(Integer codeCompte) {
		this.codeCompte = codeCompte;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idutilisateur", nullable = false)
	public Utilisateur getUtilisateur() {
		return this.utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	@Column(name = "solde", nullable = false, precision = 22, scale = 0)
	public double getSolde() {
		return this.solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Column(name = "code", nullable = false)
	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "compte")
	public Set<Transaction> getTransactions() {
		return this.transactions;
	}

	public void setTransactions(Set<Transaction> transactions) {
		this.transactions = transactions;
	}

}
