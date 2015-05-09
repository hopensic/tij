package ch07;

public class Note {

	private String noteName;

	private Note(String noteName) {
		this.noteName = noteName;
	}

	public String toString() {
		return noteName;
	}

	public static final Note MIDDLE_C = new Note("Middle C"),
			C_SHARP = new Note("C Sharp"), B_FLAT = new Note("B Flat");
}
