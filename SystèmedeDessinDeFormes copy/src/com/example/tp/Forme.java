package com.example.tp;

/**
 * Super-classe représentant une forme géométrique.
 */
public abstract class Forme implements Comparable<Forme> {
	protected String couleur;

	public Forme(String couleur) {
		this.couleur = couleur;
	}

	/**
	 * Méthode de dessin générique. Peut être redéfinie par chaque sous-classe.
	 */
	public void dessiner() {
		System.out.println("Dessiner une forme de couleur " + couleur);
	}

	public abstract double aire();

	public int compareTo(Forme f) {
		return Double.compare(this.aire(), f.aire());
	}
}
