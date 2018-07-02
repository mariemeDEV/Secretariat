package sn.technicalhouse.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Vente {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codeVente;
    @OneToOne	
	private Commande commande;
    @OneToOne
	private Paiement paiement;
    
	public int getCodeVente() {
		return codeVente;
	}
	public void setCodeVente(int codeVente) {
		this.codeVente = codeVente;
	}
	
	public Commande getCommande() {
		return commande;
	}
	public void setCommande(Commande commande) {
		this.commande = commande;
	}
	public Paiement getPaiement() {
		return paiement;
	}
	public void setPaiement(Paiement paiement) {
		this.paiement = paiement;
	}

}
