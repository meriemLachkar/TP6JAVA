package com.example.tp;

public class Media {
	protected String titre;

	public Media(String titre) {
		this.titre = titre;
	}

	/** Lecture générique */
	public void lire() {
		System.out.println("Lecture de : " + titre);
	}

	/** Durée en secondes; par défaut 0 */
	public int getDuree() {
		return 0;
	}
	
	public void stop() {
		System.out.println("L'arrêt de :  " + titre);
	}
}
