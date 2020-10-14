package fr.mds.javacourse.java1tp11.utils;

import java.util.Scanner;

public class Conjugateur {
	
	//Attributs
	private final static String sujets[] = {"Je", "Tu", "Il/Elle/On", "Nous", "Vous", "Ils/Elles"};
	private final static String terminaisons [] = {"e", "es", "e", "ons", "ez", "ent"};
	private static String verbe;
	private static int	nbLettres;
	private static boolean correct = false;
	
	public static void conjugueSansSaisi(String[] verbes) {
		
		for(int i = 0; i < verbes.length; i++) {
			
			nbLettres = verbes[i].length();
			
			String base = verbes[i].substring(0, nbLettres-2);
			int taille = terminaisons.length;
			
			for(int j=0; j<taille; j++) {
				System.out.println(sujets[j] + " " + base + terminaisons[j]);
			}
			System.out.println();
		}
	}

	public static void conjugueAvecSaisi() {
		
		System.out.println("Donnez un verbe regulier du premier groupe : \n");
		
		while(correct == false){
			Scanner clavier = new Scanner(System.in);
			verbe = clavier.next();
			System.out.println();
			nbLettres = verbe.length();
			String endVerbe = verbe.substring(nbLettres-2, nbLettres);

			if((!verbe.equals("aller")) && (!verbe.equals("nager")) && endVerbe.equals("er")){
				correct = true;
			}
			
			else if(endVerbe != "er"){
				System.out.print("Veuillez saisir un verbe correct, celui-ci n'est pas un verbe du premier groupe.\n");
			}
		}

		String base = verbe.substring(0, nbLettres-2);
		int taille = terminaisons.length;

		for(int i=0; i<taille; i++) {
			System.out.println(sujets[i] + " " + base + terminaisons[i]);
		}
	}
}