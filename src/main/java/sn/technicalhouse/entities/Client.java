package sn.technicalhouse.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Client extends Class<Object> implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codeVente;
	private String nomClient;
	private String prenomClient;
	private String emailClient;
	private String telephone;
	@OneToMany(mappedBy="demande")
	private Demande demandeClient;
	@OneToMany(mappedBy="commande")
	private Commande commandeClient;
	public int getCodeVente() {
		return codeVente;
	}
	public void setCodeVente(int codeVente) {
		this.codeVente = codeVente;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public Demande getDemandeClient() {
		return demandeClient;
	}
	public void setDemandeClient(Demande demandeClient) {
		this.demandeClient = demandeClient;
	}
	public Commande getCommandeClient() {
		return commandeClient;
	}
	public void setCommandeClient(Commande commandeClient) {
		this.commandeClient = commandeClient;
	}
	
}
