package tp_note_BIZERAY;

import java.math.BigDecimal;

public class Voyage {

	Porte entree;
	BigDecimal tarif;
	Porte sortie;
	CompagnieAutoroute autoroute;
	
	public Voyage(Porte entree, Porte sortie, CompagnieAutoroute autoroute) {
		super();
		this.entree = entree;
		this.sortie = sortie;
		this.autoroute = autoroute;
	}

	public Porte getEntree() {
		return entree;
	}

	public void setEntree(Porte entree) {
		this.entree = entree;
	}

	public BigDecimal getTarif() {
		return tarif;
	}

	public void setTarif(BigDecimal tarif) {
		this.tarif = tarif;
	}

	public Porte getSortie() {
		return sortie;
	}

	public void setSortie(Porte sortie) {
		this.sortie = sortie;
	}

	public CompagnieAutoroute getAutoroute() {
		return autoroute;
	}

	public void setAutoroute(CompagnieAutoroute autoroute) {
		this.autoroute = autoroute;
	}
	
	
	
}
