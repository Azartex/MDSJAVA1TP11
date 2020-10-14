package fr.mds.javacourse.java1tp11.utils;

public class Launcher {

	public static void main(String[] args) {
		
		final String verbes[] = {"donner", "regarder", "tomber", "écouter", "allumer", "marcher"};
				
		Conjugateur.conjugueSansSaisi(verbes);
		Conjugateur.conjugueAvecSaisi();
	}
}
