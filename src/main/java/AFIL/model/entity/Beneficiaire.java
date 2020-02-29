/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AFIL.model.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gaetan
 */
public class Beneficiaire extends Personne implements Serializable, HasCommentaire {

    public static enum Sexe {
        HOMME,
        FEMME
    }

    private String informationsAdministratives;

    private String commentaire;

    private Date naissance;

    private double taille;

    private double poids;

    private Sexe sexe;

    private String zone;

    /**
     * Crée une instance
     */
    public Beneficiaire() {
        super();
    }

    public String getInformationsAdministratives() {
        return informationsAdministratives;
    }

    public void setInformationsAdministratives(String informationsAdministratives) {
        this.informationsAdministratives = informationsAdministratives;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    public Date getNaissance() {
        return naissance;
    }

    public void setNaissance(Date naissance) {
        this.naissance = naissance;
    }

    public double getTaille() {
        return taille;
    }

    public void setTaille(double taille) {
        this.taille = taille;
    }

    public double getPoids() {
        return poids;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    /**
     * Renvoie l'age du bénéficiaire
     *
     * @return l'age du bénéficiaire
     */
    public int getAge() {
        if (getNaissance() == null) {
            return -1;
        }
        return new Date(new Date().getTime() - getNaissance().getTime()).getYear() - 70;
    }

    /**
     * Renvoie l'IMC du bénéficiaire
     *
     * @return l'IMC du bénéficiaire
     */
    public double getIMC() {
        double tmp = getTaille();
        return getPoids() / (tmp * tmp);
    }

}
