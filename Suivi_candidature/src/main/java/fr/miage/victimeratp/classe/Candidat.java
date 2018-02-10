package fr.miage.victimeratp.classe;

import java.io.File;

public class Candidat extends Personne {
	private int age;
	private File cvCandidat;
	
	public Candidat(String nom, String prenom, int age, String adresseMail, File cvCandidat){
		super(nom,prenom,adresseMail);
		this.age = age;
		this.cvCandidat = cvCandidat;		
	}
	
	public int getAge(){return this.age;}
	public File getCvCandidat(){ return this.cvCandidat; }
	
	


}
