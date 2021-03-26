package com.example.demo.Metier;

import java.util.List;

import com.example.demo.entities.Article;

public interface IArticleMetier {
	
	public void ajouterArticle(Article a);
	
	public List<Article> tousLesArticles();
	
	public List<Article> articleParMc(String mc);
	
	public void supprimerArticle(int id);
	
	public Article consulterArticle(int id);

}
