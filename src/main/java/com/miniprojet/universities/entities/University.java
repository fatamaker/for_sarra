package com.miniprojet.universities.entities;

import java.util.Date; 
import jakarta.persistence.Id; 
import jakarta.persistence.Entity; 
import jakarta.persistence.GeneratedValue; 
import jakarta.persistence.GenerationType; 


@Entity 
public class University {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUni;
	private String nomUni;
	private String adresseUni;
	private int numberEtudiants;
	private Date dateCreation;
	
	public University() {
		super();
	}

	public University(String nomUni, String adresseUni, int numberEtudiants, Date dateCreation) {
		super();
		this.nomUni = nomUni;
		this.adresseUni = adresseUni;
		this.numberEtudiants = numberEtudiants;
		this.dateCreation = dateCreation;
	}

	public Long getIdUni() {
		return idUni;
	}

	public void setIdUni(Long idUni) {
		this.idUni = idUni;
	}

	public String getNomUni() {
		return nomUni;
	}

	public void setNomUni(String nomUni) {
		this.nomUni = nomUni;
	}

	public String getAdresseUni() {
		return adresseUni;
	}

	public void setAdresseUni(String adresseUni) {
		this.adresseUni = adresseUni;
	}

	public int getNumberEtudiants() {
		return numberEtudiants;
	}

	public void setNumberEtudiants(int numberEtudiants) {
		this.numberEtudiants = numberEtudiants;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "University [idUni=" + idUni + ", nomUni=" + nomUni + ", adresseUni=" + adresseUni + ", NumberEtudiants="
				+ numberEtudiants + ", dateCreation=" + dateCreation + "]";
	}
}
	
	


