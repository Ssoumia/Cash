package org.com.controller;


import org.com.entities.Compte;
import org.com.entities.Transaction;
import org.com.entities.Utilisateur;
import org.com.models.BanqueForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Dao.CompteDaoImp;
import Dao.TransactionDaoImp;
import Dao.UtilisateurDaoImp;



@Controller
public class Control {
	
	CompteDaoImp metier=new CompteDaoImp();
	UtilisateurDaoImp dao=new UtilisateurDaoImp();
	TransactionDaoImp dao1=new TransactionDaoImp();
	

	
	@RequestMapping("/login")
	public String login() {
	    return "login";
	}
	
	
	@RequestMapping(value={"/","/auth"})
	public ModelAndView home(){
		ModelAndView modelview = new ModelAndView();
		modelview.setViewName("Auth");
		return modelview;
	}
	
//	@RequestMapping(value="/login")
//	public String log(Model model)
//	{
//		
//		model.addAttribute("banqueForm",new BanqueForm());
//		return "login";
//		
//	}
	
	@RequestMapping(value="/menu")
	public String menu(Model model){
		
		model.addAttribute("banqueForm",new BanqueForm());
		
		return "Menu";
		
	}
	
	


	@RequestMapping(value="/saisiUser")
	public String saisie(Model model){
		
		model.addAttribute("banqueForm",new BanqueForm());
		
		return "InfoUser";
		
	}
	
	@RequestMapping(value="/iformationUser")
	public String information(BanqueForm bf,Model model){
		
		Utilisateur utilisateur=dao.findById(bf.getIdutilisateur());
		bf.setUtilisateur(utilisateur);
		model.addAttribute("banqueForm",bf);
		
		return "InfoUser";
		
	}
	
	@RequestMapping(value="/getCptbyuser")
	public String sais(Model model){
		
		model.addAttribute("banqueForm",new BanqueForm());
		
		return "infoCpt";
		
	}
	
	@RequestMapping(value="/iformationCpt")
	public String infoCompte(BanqueForm bf,Model model){
		
		Compte compte=metier.findByClientName(bf.getNom());
		Transaction  transaction=dao1.findByIdCompte(compte.getCodeCompte());
		bf.setCompte(compte);
		bf.setTransaction(transaction);
		
		model.addAttribute("banqueForm",bf);
		
		return "infoCpt";
		
	}
	
	
	@RequestMapping(value="/list")
	public String liste(Model model){
		
		model.addAttribute("banqueForm",new BanqueForm());
		
		return "liste";
		
	}
	
	@RequestMapping(value="/listeUtilisateur")
	public ModelAndView listUser(){
		ModelAndView modelview=new ModelAndView();
		modelview.addObject("lp",dao.findAll());
		modelview.setViewName("listp");
		
		return modelview;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(value="/listecli")
//	public ModelAndView listeClient(){
//		
//		ModelAndView modelview=new ModelAndView();
//		
//		modelview.addObject("liste", metier.getAllUtilisateur());
//		modelview.setViewName("listeClient");
//		return modelview;
}
