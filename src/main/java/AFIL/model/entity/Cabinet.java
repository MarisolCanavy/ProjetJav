/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AFIL.model.entity;

import java.io.Serializable;

/**
 *
 * @author gaetan
 */
public class Cabinet implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	
	private String nom;
	
	private String adresse;
        
        private String telephone;
	
	/**
	 * Crée une instance
	 */
	public Cabinet() {
		super();
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
        
        public String getTelephone() {
		return telephone;
	}


	public int getId() {
		return id;
	}
	
	
	
   
}