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
public class StatutIntervenant implements Serializable, HasIntitule {

	
    
    
    
    
	private static final long serialVersionUID = 1L;
	
	private int id;
	
	private String intitule;

	/**
	 * Crée une instance
	 */
	public StatutIntervenant() {
		super();
	}

        @Override
	public String getIntitule() {
		return intitule;
	}

        @Override
	public void setIntitule(String intitule) {
		this.intitule = intitule;
	}

	public int getId() {
		return id;
	}
	
        @Override
	public String toString()
	{
		return intitule;
	}
   
}
