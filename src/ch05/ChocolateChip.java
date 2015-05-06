package ch05;

import tools.P;
import ch05.dessert.Cookie;

public class ChocolateChip extends Cookie {

	public ChocolateChip() {
		P.lnrint("ChocolateChip constructor");
	}

	public static void main(String[] args) {
		ChocolateChip chocolateChip = new ChocolateChip();
		chocolateChip.bite();
	}

}
