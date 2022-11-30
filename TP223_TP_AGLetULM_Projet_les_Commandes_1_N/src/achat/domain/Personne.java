package achat.domain;

import java.time.LocalDate;

public class Personne {
	private String nom;
	private String prenom;
	private LocalDate dateNaiss;

	public Personne() {

	}

	

	public Personne(String nom, String prenom, LocalDate dateNaiss) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom; 
	}

	public LocalDate getDateNaiss() {
		return dateNaiss;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setDateNaiss(LocalDate dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	
	public TypeAge getAge() {
		
		return null; 
	}

}
