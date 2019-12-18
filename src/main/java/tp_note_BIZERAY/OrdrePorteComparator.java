package tp_note_BIZERAY;

import java.util.Comparator;

public class OrdrePorteComparator implements Comparator<Porte> {

	Porte p1;
	Porte p2;
	

	public int compare(Porte p1, Porte p2) {
		Integer Porte1 = p1.getNumeroDePorte();
		Integer Porte2 = p2.getNumeroDePorte();
		Integer PorteCompare = Porte1.compareTo(Porte2);

		return PorteCompare;
	}

	
	

}
