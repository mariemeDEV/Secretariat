package sn.technicalhouse.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Paiement {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codePaiement;
	@Temporal(TemporalType.DATE)
	private Date datePaiement;
	private boolean etatPaiement;
	private float montantPaye;
	private float montantDu;
	private float montantRestant;
	
	public int getCodePaiement() {
		return codePaiement;
	}
	public void setCodePaiement(int codePaiement) {
		this.codePaiement = codePaiement;
	}
	public Date getDatePaiement() {
		return datePaiement;
	}
	public void setDatePaiement(Date datePaiement) {
		this.datePaiement = datePaiement;
	}
	public boolean isEtatPaiement() {
		return etatPaiement;
	}
	public void setEtatPaiement(boolean etatPaiement) {
		this.etatPaiement = etatPaiement;
	}
	public float getMontantPaye() {
		return montantPaye;
	}
	public void setMontantPaye(float montantPaye) {
		this.montantPaye = montantPaye;
	}
	public float getMontantDu() {
		return montantDu;
	}
	public void setMontantDu(float montantDu) {
		this.montantDu = montantDu;
	}
	public float getMontantRestant() {
		return montantRestant;
	}
	public void setMontantRestant(float montantRestant) {
		this.montantRestant = montantRestant;
	}
	
	
}
