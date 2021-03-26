package com.example.demo.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="NUMERO_ARTICLE")
	private int numero;
	
	@Column(name="NOM_ARTICLE")
	private String nomArticle;
	
	@Column(name="NOM_AUTEUR")
	private String nomAuteur;
	
	@Column(name="DATE_PUBLICATION")
	private Date datePublication;
	
	@Column(name="TEXTE_ARTICLE")
	private String texteArticle;
	
	@Column(name="PHOTO_ARTICLE")
	private String photoArticle;

	
	
	public Article(String nomArticle, String nomAuteur, Date datePublication, String texteArticle,String photoArticle) {
		
		this.nomArticle = nomArticle;
		this.nomAuteur = nomAuteur;
		this.datePublication = datePublication;
		this.texteArticle = texteArticle;
		this.photoArticle = photoArticle;
		
	}
	
	
	public Article() {
		
	}


	public int getNumero() {
		return numero;
	} 


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getNomArticle() {
		return nomArticle;
	}


	public void setNomArticle(String nomArticle) {
		this.nomArticle = nomArticle;
	}


	public String getNomAuteur() {
		return nomAuteur;
	}


	public void setNomAuteur(String nomAuteur) {
		this.nomAuteur = nomAuteur;
	}


	public Date getDatePublication() {
		return datePublication;
	}


	public void setDatePublication(Date datePublication) {
		this.datePublication = datePublication;
	}


	public String getTexteArticle() {
		return texteArticle;
	}


	public void setTexteArticle(String texteArticle) {
		this.texteArticle = texteArticle;
	}


	public String getPhotoArticle() {
		return photoArticle;
	}


	public void setPhotoArticle(String photoArticle) {
		this.photoArticle = photoArticle;
	}


	@Override
	public String toString() {
		return "Article [nomArticle=" + nomArticle + ", nomAuteur=" + nomAuteur + ", datePublication=" + datePublication
				+ ", texteArticle=" + texteArticle + ", photoArticle=" + photoArticle + "]\n";
	}
	
	
	
	
	
	
	
	
	
	
	

}
