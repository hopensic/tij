package test;

import tools.P;
import ch07.Note;

interface Instrument {
	int I = 5;

	void play(Note n);

	String what();

	void adjust();
}

class Wind implements Instrument {
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
	static void tune(Instrument i) {
		i.play(Note.MIDDLE_C);
	}

	static void tuneAll(Instrument[] e) {
		for (Instrument in : e)
			tune(in);
	}

	public static void main(String[] args) {
		Instrument[] orchestra = { new Wind() };
		tuneAll(orchestra);
	}
}
