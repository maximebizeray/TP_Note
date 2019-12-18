package tp_note_BIZERAY;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CompagnieAutoroute extends Route{

	ArrayList<Route> listeRoute =new ArrayList<Route>();
	ArrayList<Tarif> listeTarif =new ArrayList<Tarif>();
	
	public void ajouterTarif(Tarif t) {
		listeTarif.add(t);
	}
	
	public void ajouterRoute(Route r) {
		listeRoute.add(r);
	}
	
	public BigDecimal obtenirTarif(Porte p1, Porte p2) {
		Tarif t;
		t = getTarifExacte(p1, p2);
		if(t==null){
			t = getTarifCalculé(p1,p2);	
		}
		return t.getPrix();
				
	}
	
	private Tarif getTarifCalculé(Porte p1, Porte p2) {
		
		Porte entree = null;
		Porte sortie = null;
		BigDecimal prix = new BigDecimal(0);
		Tarif t = new Tarif(entree, sortie, prix); 
		for(Tarif t1: listeTarif) {
			if(t1.getEntree().getNumeroDePorte() >= p1.getNumeroDePorte() && t1.getSortie().getNumeroDePorte()<= p2.getNumeroDePorte()) {
				t.setPrix(t.getPrix().add(t1.getPrix()));
			}
		}
		this.listeTarif.add(t);
		return t;
		
	}
	
	private Tarif getTarifExacte(Porte p1, Porte p2) {
		for(Tarif t1 : listeTarif) {
			if(t1.getEntree().equals(p1)) {
				if(t1.getSortie().equals(p2)) {
					return t1;
				}
			}
		}
		return null;
	}	
}
