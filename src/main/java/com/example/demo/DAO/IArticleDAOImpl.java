package com.example.demo.DAO;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entities.Article;

@Component
public class IArticleDAOImpl implements IArticleDAO{
	
	@Autowired
	EntityManager entity;

	@Override
	public void ajouterArticle(Article a) {

		entity.persist(a);
		
	}

	@Override
	public List<Article> tousLesArticles() {
		
		List<Article> liste =entity.createQuery("FROM Article").getResultList();
		
		return liste;
		
	}

	@Override
	public List<Article> articleParMc(String mc) {
		
		List<Article> liste =tousLesArticles();
		List<Article> listemc = new ArrayList<>();
		
		for (Article article : liste) {
			
			if(article.getNomArticle().toLowerCase().contains(mc.toLowerCase())) {
				listemc.add(article);
			}
			
		}
		
		return listemc;
	}

	@Override
	public void supprimerArticle(int id) {
		
		Article artc =entity.find(Article.class, id);
		entity.remove(artc);
		
	}

	@Override
	public Article consulterArticle(int id) {
		
		Article artc = entity.find(Article.class, id);
		return artc;
		
	}

}
