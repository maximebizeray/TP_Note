package tp_note_BIZERAY;


import java.util.ArrayList;

public class Route  {

	ArrayList<Porte> portes;

	
	public Route() {
		this.portes = new ArrayList<Porte>();
	}

	public void addPorte(Porte p) {
		portes.add(p);
	}

	@Override
	public String toString() {
		return "Route [portes=" + portes + "]";
	}
	
	
}
