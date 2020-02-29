/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AFIL.model.entity;

/**
 *
 * @author gaetan
 */
import java.io.Serializable;


/**
 * Entity implementation class for Entity: Personne
 *
 */
public class Personne implements Serializable {
	
	private int id;
	
	private String nom;
	private String nomJeuneFille;
	private String prenom;
	private String rue;
	private String telephone;
	private String mail;
	private String ville;
	private String codepost;
	private String batiment;
	private String appartement;

	/**
	 * Crée une instance
	 */
	public Personne() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNomJeuneFille() {
		return nomJeuneFille;
	}

	public void setNomJeuneFille(String nomJeuneFille) {
		this.nomJeuneFille = nomJeuneFille;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getCodepost() {
		return codepost;
	}

	public void setCodepost(String codepost) {
		this.codepost = codepost;
	}

	public String getBatiment() {
		return batiment;
	}

	public void setBatiment(String batiment) {
		this.batiment = batiment;
	}

	public String getAppartement() {
		return appartement;
	}

	public void setAppartement(String appartement) {
		this.appartement = appartement;
	}

	public int getId() {
		return id;
	}
	
	
   
}
