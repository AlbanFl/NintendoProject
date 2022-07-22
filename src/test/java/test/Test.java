package test;

import java.time.LocalDate;
import metier.Achat;
import metier.Adresse;
import metier.Boutique;
import metier.Client;
import metier.Hybride;
import metier.Jeu;
import metier.Salon;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boutique b = new Boutique("Game Cash",new Adresse(25,"rue de la roux","Angers")  );
		Hybride h1 = new Hybride("Switch", 300, LocalDate.parse("2017-03-03"));
		Salon s2 = new Salon("PS4", 250, LocalDate.parse("2015-01-01"));
		Jeu j1 = new Jeu("Civilization 6", s2, b);
		Jeu j2 = new Jeu("WoW", h1,b);
		Jeu j3 = new Jeu("Fifa 22", s2,b);
		Jeu j4 = new Jeu("Fifa 21", s2,b);
		Jeu j5 = new Jeu("Skyrim", h1,b);
		

		
		
		Client cl1= new Client("Ariane", "Badoual");
		Client cl2= new Client("Megan", "Street");
		Client cl3 = new Client("william", "shakespeare");
		
		cl3.addAchat( new Achat(j1, LocalDate.now(), 30 ) );

	}

}
