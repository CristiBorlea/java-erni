package ro.erni.java.training.interfaces;

import java.applet.AudioClip;

public interface SingerSongwriter {
	AudioClip sing(Song s);
	Song compose(boolean hit);
}
