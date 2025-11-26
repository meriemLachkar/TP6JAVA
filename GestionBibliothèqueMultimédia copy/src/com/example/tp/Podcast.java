package com.example.tp;

public class Podcast extends Audio {
	private String hote;

	public Podcast(String titre, int duree, String hote) {
		super(titre, duree);
		this.hote = hote;
	}
}
