/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ihmpts2appliveille.modele.accesbd.entites;

import java.util.Calendar;
import java.util.Date;

/**
 * Classe Article : Un article est posté par un étudiant et noté par les professeurs et commenté par les professeurs ainsi que les autres étudiants.
 * @author vpivet
 */
public class Article {
    private int idArticle;
    private int idAuteur;
    private int idTheme;
    private int nbCommArt;
    private String intitule;
    private String contenu;
    private Date datePubli;
    private Date dateModif;
    private float note;
    private boolean visible;
    
    /**
     * Constructeur de la classe
     * @param idArticle l'identifiant de l'article
     * @param idAuteur l'identitfiant de l'auteur de l'article
     * @param idTheme l'identifiant du theme dont dépend l'article
     * @param nbCommArt le nombre de commentaires liés à l'article
     * @param intitule l'intitulé ou le titre de l'article
     * @param contenu le contenu de l'article
     * @param datePubli la date de publication de l'article
     * @param dateModif la date de modification de l'article
     * @param note la note de l'article attribué par un professeur
     * @param visible la visibilité de l'article sur l'interface
     */
    public Article(int idArticle, int idAuteur, int idTheme, int nbCommArt, String intitule, String contenu, Date datePubli, Date dateModif, float note, boolean visible) {
        this.idArticle = idArticle;
        this.idAuteur = idAuteur;
        this.idTheme = idTheme;
        this.nbCommArt = nbCommArt;
        this.intitule = intitule;
        this.contenu = contenu;
        this.datePubli = datePubli;
        this.dateModif = dateModif;
        this.note = note;
        this.visible = visible;
    }

    /**
     * Getter sur l'identifiant de l'article
     * @return l'idArticle
     */
    public int getIdArticle() {
        return idArticle;
    }

    /**
     * Getter sur l'auteur de l'article
     * @return l'idAuteur
     */
    public int getIdAuteur() {
        return idAuteur;
    }

    /**
     * Getter sur le thème de l'article
     * @return l'idTheme
     */
    public int getIdTheme() {
        return idTheme;
    }

    /**
     * Getter sur le nombre de commentaire de l'article
     * @return l'nbCommArt : le nombre de commentaire
     */
    public int getNbCommArt() {
        return nbCommArt;
    }

    /**
     * Getter sur l'intitule de l'article
     * @return l'intitule
     */
    public String getIntitule() {
        return intitule;
    }

    /**
     * Getter sur le contenu de l'article
     * @return le contenu
     */
    public String getContenu() {
        return contenu;
    }

    /**
     * Getter sur la date de publication de l'article
     * @return la datePubli : date de publication
     */
    public Date getDatePubli() {
        return datePubli;
    }

    /**
     * Getter sur la date de modification de l'article
     * @return la dateModif : date de modification
     */
    public Date getDateModif() {
        return dateModif;
    }

    /**
     * Getter sur la note de l'article
     * @return la note
     */
    public float getNote() {
        return note;
    }
    
    /**
     * Getter sur la visibilité de l'article
     * @return visible
     */
    public boolean getVisible(){
        return visible;
    }

    
}

