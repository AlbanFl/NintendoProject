package metier;

import java.time.LocalDate;

public class Achat {
	private Jeu jeu;
	private LocalDate date;
	private int prix;
	public Achat(Jeu jeu, LocalDate date, int prix) {
		super();
		this.jeu = jeu;
		this.date = date;
		this.prix = prix;
	}
	public Jeu getJeu() {
		return jeu;
	}
	public void setJeu(Jeu jeu) {
		this.jeu = jeu;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	
}

