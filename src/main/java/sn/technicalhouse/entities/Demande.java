package sn.technicalhouse.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Demande {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int codeDemande;
	@Temporal(TemporalType.DATE)
	private Date dateDemande;
	
	public int getCodeDemande() {
		return codeDemande;
	}
	public void setCodeDemande(int codeDemande) {
		this.codeDemande = codeDemande;
	}
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	public boolean isEtatDemande() {
		return etatDemande;
	}
	public void setEtatDemande(boolean etatDemande) {
		this.etatDemande = etatDemande;
	}
	private boolean etatDemande;

}
