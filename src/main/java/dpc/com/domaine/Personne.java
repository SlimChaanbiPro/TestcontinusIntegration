/**
 * 
 */
package dpc.com.domaine;

/**
 * @author slim
 *
 */
public class Personne {
	private int count;
	private String nom ;
	private String email;
	private String prenom;
	private String address;
	private String phone ;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Personne() {
		super();
	}
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	

}
