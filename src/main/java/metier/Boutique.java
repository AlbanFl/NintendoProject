package metier;

public class Boutique {

	private String nomBoutique;
	private Adresse adresse;
	public Boutique(String nomBoutique, Adresse adresse) {
		super();
		this.nomBoutique = nomBoutique;
		this.adresse = adresse;
	}
	public String getNomBoutique() {
		return nomBoutique;
	}
	public void setNomBoutique(String nomBoutique) {
		this.nomBoutique = nomBoutique;
	}
	@Override
	public String toString() {
		return "Boutique [nomBoutique=" + nomBoutique + ", adresse=" + adresse + "]";
	}


}
