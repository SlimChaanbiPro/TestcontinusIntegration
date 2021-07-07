package dpc.com.domaine;

public class Matiere {
private int idmatiere;
private String nom;
private String nomber;
private String departement;
public int getIdmatiere() {
	return idmatiere;
}
public void setIdmatiere(int idmatiere) {
	this.idmatiere = idmatiere;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getNomber() {
	return nomber;
}
public void setNomber(String nomber) {
	this.nomber = nomber;
}
public String getDepartement() {
	return departement;
}
public void setDepartement(String departement) {
	this.departement = departement;
}
public Matiere(int idmatiere, String nom, String nomber, String departement) {
	super();
	this.idmatiere = idmatiere;
	this.nom = nom;
	this.nomber = nomber;
	this.departement = departement;
}

}
