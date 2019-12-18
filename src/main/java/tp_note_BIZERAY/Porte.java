package tp_note_BIZERAY;

public class Porte {

	Integer numeroDePorte;
		
	public Porte(Integer numero) {
		this.numeroDePorte=numero;
	}

	public Integer getNumeroDePorte() {
		return numeroDePorte;
	}

	public void setNumeroDePorte(Integer numeroDePorte) {
		this.numeroDePorte = numeroDePorte;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDePorte == null) ? 0 : numeroDePorte.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		Porte other = (Porte) obj;
		if ((numeroDePorte == null) || (!numeroDePorte.equals(other.numeroDePorte))) {
			if (other.numeroDePorte != null)
				return false;
		} 
		return true;
	}

	@Override
	public String toString() {
		return "Porte [numeroDePorte=" + numeroDePorte + "]";
	}
	
	
	
}
