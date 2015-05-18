package ch06;

import tools.P;

class Art {
	Art() {
		P.lnrint("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		P.lnrint("Drawing constructor");
	}
}



public class Cartoon extends Drawing {
	public Cartoon() {
		P.lnrint("Cartoon constructor");
	}

	public static void main(String[] args) {
		Cartoon cartoon = new Cartoon();
	}
}
