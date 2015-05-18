package ch08;

import tools.P;
import ch07.Note;

interface Instrument {
	int I = 5;

	String what();

	void adjust();
}

interface Playable {
	void play(Note n);
}

class Wind implements Instrument, Playable {
	public void play(Note n) {
		P.lnrint("Wind.play() " + n);
	}

	public String what() {
		return "Wind";
	}

	public void adjust() {
	}

}

public class Music5 {
	static void tune(Playable i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Playable[] e) {
		for (Playable in : e)
			tune(in);
	}

	public static void main(String[] args) {
		Playable[] orchestra = { new Wind() };
		tuneAll(orchestra);
	}
}
