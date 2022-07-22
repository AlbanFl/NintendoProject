package metier;

public class Boutique {

	private String nomBoutique;
	private String nomAdresse;
	public Boutique(String nomBoutique, String nomAdresse) {
		super();
		this.nomBoutique = nomBoutique;
		this.nomAdresse = nomAdresse;
	}
	public String getNomBoutique() {
		return nomBoutique;
	}
	public void setNomBoutique(String nomBoutique) {
		this.nomBoutique = nomBoutique;
	}
	@Override
	public String toString() {
		return "Boutique [nomBoutique=" + nomBoutique + ", nomAdresse=" + nomAdresse + "]";
	}
	
	
}
