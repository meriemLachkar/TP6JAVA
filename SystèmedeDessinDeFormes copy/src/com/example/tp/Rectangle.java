package com.example.tp;

/**
 * Rectangle de largeur et de hauteur données.
 */
public class Rectangle extends Forme {
	private double largeur, hauteur;

	public Rectangle(String couleur, double largeur, double hauteur) {
		super(couleur);
		this.largeur = largeur;
		this.hauteur = hauteur;
	}

	@Override
	public void dessiner() {
		System.out.println(
				"Dessiner un rectangle de couleur " + couleur + ", largeur= " + largeur + ", hauteur=" + hauteur);
	}

	@Override
	public double aire() {
		return hauteur * largeur;

	}

	@Override
	public String toString() {
		return "Rectangle de largeur " + largeur + " et de hauteur " + hauteur + " ";
	}

}
