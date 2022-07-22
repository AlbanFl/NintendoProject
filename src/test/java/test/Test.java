package test;

import metier.Console;
import metier.Jeu;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Console c1 = new Console("PC");
		Console c2 = new Console("PS4");
		Jeu j1 = new Jeu("Civilization 6", c1);
		Jeu j2 = new Jeu("WoW", c1);
		Jeu j3 = new Jeu("Fifa 22", c2);
		Jeu j4 = new Jeu("Fifa 21", c2);
		Jeu j5 = new Jeu("Skyrim", c2);
	}

}
