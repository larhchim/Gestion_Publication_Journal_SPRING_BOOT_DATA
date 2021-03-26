package com.example.demo;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Metier.IArticleMetier;
import com.example.demo.entities.Article;

@SpringBootApplication
public class ExamJava2019Application {

	@Autowired
	IArticleMetier article;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamJava2019Application.class, args);
	}
	

	@PostConstruct 
	public void LoadOnceFinished() {
		
		System.out.println("******************************************************");
		
		/*Article a = new Article();
		a.setDatePublication(new Date());
		a.setNomArticle("LA CASETTA4");
		a.setNomAuteur("ISMAI4");
		a.setPhotoArticle("home4.jpg");
		a.setTexteArticle("LA CASA DEL PAPEL DEL NUESTRA4");
		article.ajouterArticle(a);*/
		
		
		//List<Article> listea =article.tousLesArticles();
		
		//System.out.println(listea.toString());
		
		//List<Article> listeaPmc =article.articleParMc("ettA2");
		
		//System.out.println(listeaPmc.toString());
		
		//article.consulterArticle(1);
		
		//System.out.println(article.consulterArticle(5).toString());
		
		//article.supprimerArticle(1);
		
		System.out.println("******************************************************");

		
	}

}
