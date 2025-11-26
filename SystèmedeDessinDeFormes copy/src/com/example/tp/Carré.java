package com.example.tp;

public class Carré extends Forme {
	private double cote;

	public Carré(String couleur, double cote) {
		super(couleur);
		this.cote = cote;
	}

	@Override
	public void dessiner() {
		System.out.println("Dessiner un carré de couleur " + couleur + ", cote =" + cote);
	}

	public double aire() {
		return cote * cote;
	}

	@Override
	public String toString() {
		return "Carré de côté " + cote + " ";
	}

}
