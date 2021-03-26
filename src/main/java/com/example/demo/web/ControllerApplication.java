package com.example.demo.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Metier.IArticleMetier;
import com.example.demo.entities.Article;

@Controller
public class ControllerApplication {
	
	
	@Autowired
	IArticleMetier article;
	
	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String requestMethodName(Model mode) {
		
		
				List<Article> listemc =(List<Article>) mode.getAttribute("listeArticles");


				if(listemc==null) {
					
					List<Article> liste =article.tousLesArticles();

					mode.addAttribute("listeArticles",liste);
				}else {
					mode.addAttribute("listeArticles",listemc);

				}
				
			
		

		
		return "index";
	}

	
	
	@RequestMapping(value = "/ajouter", method = RequestMethod.GET)
	public String ajouter() {
		return "saisie";
	}
	
	
	@RequestMapping(value = "/supprimer", method = RequestMethod.POST)
	public String requestMethodName(int identifiant) {
		
		article.supprimerArticle(identifiant);
		return "redirect:/home";
	}
	
	
	@RequestMapping(value = "/calcul", method = RequestMethod.POST)
	public String requestMethodName(String enrg,Model mode) {
		
		if(enrg.equals("")) {
			return "redirect:/home";

		}
		
		List<Article> lsarticles = article.articleParMc(enrg);
		
		mode.addAttribute("listeArticles",lsarticles);
		
				
		return "index";
	}
	
	
	@RequestMapping(value = "/ajouterArticle", method = RequestMethod.POST)
	public String requestMethodName( Article arti ) {
		
		arti.setDatePublication(new Date());
		
		String [] tab =arti.getPhotoArticle().split("\\.");
		
		
		
		arti.setPhotoArticle(tab[0]);
				
	
		article.ajouterArticle(arti);
		
		return "redirect:/home";
	}





}
