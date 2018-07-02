package sn.technicalhouse.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Commande {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codeCommande;
	@Temporal(TemporalType.DATE)
	private Date dateCommande;
	private boolean etatCommande;
	@OneToMany(mappedBy="Idproduit")
	@JsonIgnore
	private List<Produit> produits;
	
	public int getCodeCommande() {
		return codeCommande;
	}
	public void setCodeCommande(int codeCommande) {
		this.codeCommande = codeCommande;
	}
	public Date getDateCommande() {
		return this.dateCommande;
	}
	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}
	public boolean isEtatCommande() {
		return etatCommande;
	}
	public void setEtatCommande(boolean etatCommande) {
		this.etatCommande = etatCommande;
	}
	public List<Produit> getProduits() {
		return produits;
	}
	public void setProduits(List<Produit> produits) {
		this.produits = produits;
	}
	
}
