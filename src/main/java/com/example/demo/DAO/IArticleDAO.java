package com.example.demo.DAO;

import java.util.List;

import com.example.demo.entities.Article;

public interface IArticleDAO {
	
	public void ajouterArticle(Article a);
	
	public List<Article> tousLesArticles();
	
	public List<Article> articleParMc(String mc);
	
	public void supprimerArticle(int id);
	
	public Article consulterArticle(int id);

}
