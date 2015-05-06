package ch06;

import tools.P;

class Game {
	Game(int i) {
		P.lnrint("Game constructor");
	}
}

class BoardGame extends Game {
	BoardGame(int i) {
		super(i);
		P.lnrint("BoardGame constructor");
	}
}

public class Chess extends BoardGame {

	public Chess() {
		super(11);
		P.lnrint("Chess constructor");
	}
	
	public static void main(String[] args) {
		Chess chess = new Chess();
	}

}
