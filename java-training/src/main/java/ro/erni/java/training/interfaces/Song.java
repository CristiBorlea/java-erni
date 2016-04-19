package ro.erni.java.training.interfaces;

import java.util.Date;

public class Song {

	public Date realeaseDate;
	public String artist;

	Song(Date realeaseDate, String artist) {
		this.realeaseDate = realeaseDate;
		this.artist = artist;
	}
}
