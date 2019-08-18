package tpjava;

import java.util.Scanner;

public class tpjava {
	private static Scanner r;
	public static final int Menu_CalculerTotal = 1, Menu_AfficherPairs = 2, Menu_LePlus = 3;
	private static Scanner r2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nom;
		int plusp = 0, plusg = 0, choix, total ;
		int[] table = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		nom = lire();
		afficher(nom);
		choix = option();
		outer:
		while (choix > 0) {
			switch (choix) {
			case 1:
				total = calculTotal(table);
				break;
			case 2:
				afficherpair(table);
				break;

			case 3:
				afficherplus(plusg, plusp, table);
				break;
			default:
				System.out.println("Vous vous etes tromp!");
			break outer;	
			}
			System.out.println("Donnez votre choix:");
			choix = r.nextInt();
		}
	}

	private static void afficherplus(int grand, int petit, int[] comparer) {
		petit = comparer[0];
		for (int i = 0; i < comparer.length; i++) {
			if (comparer[i] > grand) {
				grand = comparer[i];
			} else {
				petit = comparer[i];
			}
		}
		System.out.println("la plus petite valeur est:" + petit + "\r\n" + "la plus grande valeur est:" + grand);

	}

	private static void afficherpair(int[] entier) {
		int pairs;
		System.out.println("les	nombres	pairs du tableau:");
		for (int i = 0; i < entier.length; i++) {
			if (entier[i] % 2 == 0) {
				pairs = entier[i];
				System.out.println(+pairs);
			}
		}

	}

	private static int option() {
		r2 = new Scanner(System.in);
		int n;
		System.out.println(
				"Menu\n" + "---\n" + "1.calculer le montant total\n" + "2.afficher les nombres pairs du tableau\n"
						+ "3.afficher la plus petite& la plus grande valeur du tableau\n");
		System.out.println("Donnez votre choix:");
		n = r2.nextInt();
		return n;

	}

	private static int calculTotal(int[] somme) {
		int he = 0;
		for (int i = 0; i < somme.length; i++) {
			he += somme[i];
		}
		System.out.println("Le montant total des éléments du tableau:" +he);
		return he;
	}

	private static String lire() {
		System.out.print("Donnez votre nom :");
		r = new Scanner(System.in);
		String name = r.next();
		return name;
	}

	private static void afficher(String nom) {
		System.out.println(" Bonjour " + nom);
	}
}
