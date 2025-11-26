package com.example.tp;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// 1. Construction d’un tableau hétérogène de Forme
		Forme[] formes = new Forme[] { new Cercle("Rouge", 5.0), new Rectangle("Bleu", 4.0, 3.0),
				new Triangle("Vert", 6.0, 2.5), new Carré("Rose", 4.5) };

		// 2. Polymorphisme en action
		for (Forme f : formes) {
			f.dessiner(); // appel dynamiquedepuis la classe réellement instanciée
		}

		System.out.println("-  Extensions possibles : un tableau trié par aire");

		Arrays.sort(formes);

		for (Forme f : formes) {
			System.out.println(f + "a pour aire : " + f.aire());
		}
	}
}
