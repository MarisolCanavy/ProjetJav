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
interface HasCommentaire {
    /**
	 * Retourne le commentaire
	 * @return le commentaire
	 */
	String getCommentaire();
	
	/**
	 * Assigne le commentaire
	 * @param commentaire le commentaire
	 */
	void setCommentaire(String commentaire);
    
}
