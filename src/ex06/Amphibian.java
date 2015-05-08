package ex06;

import tools.P;

class Frog extends Amphibian {
	public void speak() {
		P.lnrint("Frog speak");
	}
}

public class Amphibian {
	public void speak() {
		P.lnrint("Amphibian speak");
	}

	public Amphibian() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Amphibian a = new Frog();
		((Amphibian) a).speak();
	}

}
