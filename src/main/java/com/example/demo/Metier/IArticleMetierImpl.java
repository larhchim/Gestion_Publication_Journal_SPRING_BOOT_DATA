package com.example.demo.Metier;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DAO.IArticleDAO;
import com.example.demo.entities.Article;

@Service
public class IArticleMetierImpl implements IArticleMetier{
	
	@Autowired
	IArticleDAO article;
	
	

	public void setArticle(IArticleDAO article) {
		this.article = article;
	}

	@Override
	@Transactional
	public void ajouterArticle(Article a) {
		
		article.ajouterArticle(a);
		
	}

	@Override
	@Transactional
	public List<Article> tousLesArticles() {
		
		return article.tousLesArticles();
		
	}

	@Override
	@Transactional
	public List<Article> articleParMc(String mc) {
		
		return article.articleParMc(mc);
		
	}

	@Override
	@Transactional
	public void supprimerArticle(int id) {
		
		article.supprimerArticle(id);
		
	}

	@Override
	@Transactional
	public Article consulterArticle(int id) {
		
		return article.consulterArticle(id);
		
	}

}
