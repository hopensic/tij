package ex09;

import tools.P;

class Ep1 extends Exception {
}

class Ep2 extends Exception {
}

class Ep3 extends Exception {
}

public class Ex07 {
	void m1() {
		try {
			for (int i = 0; i < 3; i++) {
				switch (i) {
				case 0:
					throw new Ep1();
				case 1:
					throw new Ep2();
				case 2:
					throw new Ep3();
				default:
					break;
				}
			}
		} catch (Ep1 e) {
			throw new RuntimeException(e);
		} catch (Ep2 e) {
			throw new RuntimeException(e);
		} catch (Ep3 e) {
			throw new RuntimeException(e);
		}

	}

	public static void main(String[] args) {
		try {
			new Ex07().m1();
		} catch (RuntimeException e) {
			
			e.getCause();
			
			P.lnrint(e);
			P.lnrint("-----");
		}

	}

}
